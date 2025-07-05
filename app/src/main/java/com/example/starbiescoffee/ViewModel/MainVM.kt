package com.example.starbiescoffee.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.starbiescoffee.Domain.BannerModel
import com.example.starbiescoffee.Repository.MainRepository

class MainVM: ViewModel() {
    private val repo = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>> {
        return repo.loadBanner()
    }
}