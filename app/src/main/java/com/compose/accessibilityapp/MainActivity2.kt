package com.compose.accessibilityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.compose.accessibilityapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        binding.progressDx
        setContentView(R.layout.activity_main2)
    }
}