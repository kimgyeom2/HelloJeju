object Versions {

    // AndroidX
    const val APP_COMPAT = "1.6.1"
    const val MATERIAL = "1.9.0"
    const val CONSTRAINT_LAYOUT = "2.1.4"

    // KTX
    const val CORE = "1.10.0"
    const val KTX_ACTIVITY = "1.7.2"
    const val KTX_FRAGMENT = "1.6.1"
    const val KTX_VIEWMODEL = "2.6.1"

    // TEST
    const val UNIT_TEST_JUNIT = "4.13.2"
    const val INTEGRATION_TEST_JUNIT = "1.1.5"

    // Android Test
    const val ESPRESSO_CORE = "3.5.1"

    // Hilt
    const val HILT = "2.44"

    // Network
    const val RETROFIT = "2.9.0"
    const val OKHTTP = "4.5.0"

    // Room
    const val ROOM = "2.5.2"

    // DataStore
    const val DATA_STORE = "1.0.0"

    // Firebase
    const val FIREBASE = "32.2.2"


    const val COROUTINE = "1.7.3"

}


object Libraries {

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
        const val KTX_ACTIVITY = "androidx.activity:activity-ktx:${Versions.KTX_ACTIVITY}"
        const val KTX_FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.KTX_FRAGMENT}"
        const val KTX_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.KTX_VIEWMODEL}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.UNIT_TEST_JUNIT}"
    }

    object AndroidTest {
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
        const val JUNIT = "androidx.test.ext:junit:${Versions.INTEGRATION_TEST_JUNIT}"
    }

    object Hilt {
        const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val KAPT_HILT = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    }

    object Room {
        const val KTX_ROOM = "androidx.room:room-ktx:${Versions.ROOM}"
        const val KAPT_ROOM = "androidx.room:room-compiler:${Versions.ROOM}"
        const val ROOM = "androidx.room:room-runtime:${Versions.ROOM}"
    }

    object Network {
        //Retrofit
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"

        //Okhttp
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
        const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
    }

    object DataStore {
        const val DATA_STORE = "androidx.datastore:datastore-preferences:${Versions.DATA_STORE}"
    }

    object Firebase {
        const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${Versions.FIREBASE}"
        const val FIREBASE_CRASHLYTICS = "com.google.firebase:firebase-crashlytics-ktx"
        const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
    }

    object Coroutine{
        const val COROUTINE_CORE="org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
        const val COROUTINE_ANDROID="org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
    }

    object Kakao{
        const val KAKAO_SDK="com.kakao.sdk:v2-user:2.19.0"
    }

    object Compose{
        const val COMPOSE_BOM="androidx.compose:compose-bom:2022.10.00"
        const val COMPOSE_UI="androidx.compose.ui:ui"
        const val COMPOSE_UI_GRAPHICS="androidx.compose.ui:ui-graphics"
        const val COMPOSE_MATERIAL="androidx.compose.material3:material3"
        const val COMPOSE_PREVIEW="androidx.compose.ui:ui-tooling-preview"
        const val COMPOSE_UI_TOOL="androidx.compose.ui:ui-tooling"
        const val COMPOSE_UI_TEST="androidx.compose.ui:ui-test-junit4"
        const val COMPOSE_UI_TEST2="androidx.compose.ui:ui-test-manifest"
        const val COMPOSE_ACTIVITY="androidx.activity:activity-compose:1.6.0"
        const val COMPOSE_VIEWMODEL="androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
        const val COMPOSE_LIVEDATA="androidx.compose.runtime:runtime-livedata"
    }
}