package com.example.databindinig_test

import android.app.Application
import com.example.databindinig_test.di.networkModule
import com.example.databindinig_test.di.retrofitServiceModule
import com.example.databindinig_test.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(viewModelModule, retrofitServiceModule, networkModule))
        }
    }
}