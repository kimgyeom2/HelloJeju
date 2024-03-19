package com.gy25m.presentation.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gy25m.hellojeju.ui.login.LoginActivity
import com.gy25m.presentation.databinding.ActivityMainBinding
import com.gy25m.presentation.ui.map.MapActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tv.setOnClickListener { startActivity(Intent(this, MapActivity::class.java)) }
        binding.tv2.setOnClickListener { startActivity(Intent(this, LoginActivity::class.java)) }
    }
}