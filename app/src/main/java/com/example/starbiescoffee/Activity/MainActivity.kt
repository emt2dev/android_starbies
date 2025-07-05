package com.example.starbiescoffee.Activity

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.example.starbiescoffee.R
import com.example.starbiescoffee.ViewModel.MainVM
import com.example.starbiescoffee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val vm = MainVM()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBanner()
    }

    private fun initBanner() {
        binding.progressBarBanner.visibility = View.VISIBLE
        vm.loadBanner().observeForever {
            Glide.with(this@MainActivity)
                .load(it[0].url)
                .into(binding.banner)
            binding.progressBarBanner.visibility = View.GONE
        }

        vm.loadBanner()
    }
}
