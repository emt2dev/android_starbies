package com.example.starbiescoffee.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.starbiescoffee.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.getStartedButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}