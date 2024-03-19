package com.gy25m.presentation.ui.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.gy25m.hellojeju.ui.map.viewmodel.MapViewModel
import com.gy25m.presentation.databinding.ActivityMapBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapActivity : AppCompatActivity() {
    val viewModel: MapViewModel by viewModels()
    val binding by lazy { ActivityMapBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.vm=viewModel
        binding.lifecycleOwner=this
    }
}