package com.gy25m.hellojeju.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gy25m.hellojeju.R
import com.gy25m.hellojeju.databinding.ActivityMainBinding
import com.gy25m.hellojeju.ui.map.MapActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tv.setOnClickListener { startActivity(Intent(this, MapActivity::class.java)) }
    }
}