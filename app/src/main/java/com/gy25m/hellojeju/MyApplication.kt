package com.gy25m.hellojeju

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication:Application() {

    override fun onCreate() {
        super.onCreate()

        initFirebase()
    }

    private fun initFirebase() {

    }
}