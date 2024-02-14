package com.gy25m.hellojeju.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.gy25m.hellojeju.R
import com.gy25m.hellojeju.ui.main.MainActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lifecycleScope.launch(Dispatchers.Main) {
            delay(5000L)
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish()
        }
    }
}