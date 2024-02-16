package com.gy25m.hellojeju

import android.content.Context
import androidx.room.Room
import com.gy25m.hellojeju.database.AppDatabase
import com.gy25m.hellojeju.repository.LoginRepository
import com.gy25m.hellojeju.repository.MapRepository
import com.gy25m.hellojeju.repositoryimpl.LoginRepositoryImpl
import com.gy25m.hellojeju.repositoryimpl.MapRepositoryImpl
import com.gy25m.hellojeju.service.MapApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object MyModule {

    @Provides
    @Singleton
    fun provideMapRepository(@Named("visitJeJu")retrofit: MapApiService,appDatabase: AppDatabase): MapRepository = MapRepositoryImpl(retrofit,appDatabase)

    @Provides
    @Singleton
    fun provideLoginRepository(): LoginRepository = LoginRepositoryImpl()


    @Provides
    @Singleton
    @Named("visitJeJu")
    fun provideMapRetrofit(): MapApiService{
        // HTTP 인터셉터 생성
        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        // OkHttpClient 생성하고 인터셉터 설정
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl("https://api.visitjeju.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient) // OkHttpClient 설정
            .build()

            .create(MapApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, "HelloJEJU"
        )
            .fallbackToDestructiveMigration()
            .build()
    }





}