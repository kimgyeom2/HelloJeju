plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.gy25m.presentation"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures{
        dataBinding=true
        viewBinding=true
        buildConfig=true
        compose=true
    }

    composeOptions {
        kotlinCompilerExtensionVersion="1.4.3"
    }
}

dependencies {

    // Module
    implementation(project(":data"))
    implementation(project(":domain"))

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
    implementation (Libraries.Coroutine.COROUTINE_CORE)
    implementation (Libraries.Coroutine.COROUTINE_ANDROID)


    //LifeCycle
    implementation ("androidx.activity:activity-ktx:1.6.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")

    //Kakao Login
    implementation (Libraries.Kakao.KAKAO_SDK)

    //Lottie Animation
    implementation ("com.airbnb.android:lottie:6.3.0")
    implementation ("com.airbnb.android:lottie-compose:6.3.0")

    //Compose
    val composeBom = platform(Libraries.Compose.COMPOSE_BOM)
    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation(Libraries.Compose.COMPOSE_UI)
    implementation(Libraries.Compose.COMPOSE_UI_GRAPHICS)
    implementation(Libraries.Compose.COMPOSE_MATERIAL)
    implementation(Libraries.Compose.COMPOSE_PREVIEW)
    debugImplementation(Libraries.Compose.COMPOSE_UI_TOOL)
    androidTestImplementation(Libraries.Compose.COMPOSE_UI_TEST)
    debugImplementation(Libraries.Compose.COMPOSE_UI_TEST2)
    implementation(Libraries.Compose.COMPOSE_ACTIVITY)
    implementation(Libraries.Compose.COMPOSE_VIEWMODEL)
    implementation(Libraries.Compose.COMPOSE_LIVEDATA)

    implementation("com.navercorp.nid:oauth:5.9.0")
}