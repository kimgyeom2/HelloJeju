plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.gy25m.hellojeju"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.gy25m.hellojeju"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )

            buildConfigField("boolean", "IS_DEV", "false")
        }

        debug {
            buildConfigField("boolean", "IS_DEV", "true")
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
        buildConfig = true
    }

}

dependencies {

    // Module
    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":presentation"))

    // AndroidX
    implementation(Libraries.AndroidX.APP_COMPAT)
    implementation(Libraries.AndroidX.MATERIAL)
    implementation(Libraries.AndroidX.CONSTRAINT_LAYOUT)

    // KTX
    implementation(Libraries.KTX.CORE)
    implementation(Libraries.KTX.KTX_ACTIVITY)
    implementation(Libraries.KTX.KTX_FRAGMENT)
    implementation(Libraries.KTX.KTX_VIEWMODEL)

    // TEST
    testImplementation(Libraries.Test.JUNIT)

    // AndroidTest
    androidTestImplementation(Libraries.AndroidTest.ESPRESSO_CORE)
    androidTestImplementation(Libraries.AndroidTest.JUNIT)

    // Hilt
    implementation(Libraries.Hilt.HILT)
    kapt(Libraries.Hilt.KAPT_HILT)

    // Room
    implementation(Libraries.Room.ROOM)
    implementation(Libraries.Room.KTX_ROOM)
    kapt(Libraries.Room.KAPT_ROOM)

    // Retrofit
    implementation(Libraries.Network.RETROFIT)
    implementation(Libraries.Network.RETROFIT_CONVERTER)

    // Okhttp
    implementation(Libraries.Network.OKHTTP)
    implementation(Libraries.Network.OKHTTP_LOGGING_INTERCEPTOR)

    // DataStore
    implementation(Libraries.DataStore.DATA_STORE)

    //Coroutine
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")

    //LifeCycle
    implementation ("androidx.activity:activity-ktx:1.6.1")

    //Lottie Animation
    implementation ("com.airbnb.android:lottie:6.3.0")

    //Kakao Login
    implementation ("com.kakao.sdk:v2-user:2.19.0")
}