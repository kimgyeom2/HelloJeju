package com.gy25m.hellojeju

import android.app.Application
import com.kakao.sdk.common.KakaoSdk
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication:Application() {

    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "ca1beef60085eb4f1b338dde9d5e2ec5")
    }
}