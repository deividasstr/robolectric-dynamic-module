package com.example.dynamicrobolectrictest

import android.app.Application

class DynamicApp: Application() {

    override fun onCreate() {
        super.onCreate()
        getString(R.string.feature1)
        println("On app create")
    }
}