plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
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

    // Hilt
    implementation(Libraries.Hilt.HILT)
    kapt(Libraries.Hilt.KAPT_HILT)

    //Kakao Login
    implementation (Libraries.Kakao.KAKAO_SDK)

    //Firebase SDK
    implementation(platform("com.google.firebase:firebase-bom:32.7.4"))
    implementation("com.google.firebase:firebase-analytics")

    // TEST
    testImplementation(Libraries.Test.JUNIT)

    // AndroidTest
    androidTestImplementation(Libraries.AndroidTest.ESPRESSO_CORE)
    androidTestImplementation(Libraries.AndroidTest.JUNIT)


}