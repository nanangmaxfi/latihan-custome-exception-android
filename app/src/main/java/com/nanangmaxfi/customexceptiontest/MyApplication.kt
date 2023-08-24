package com.nanangmaxfi.customexceptiontest

import android.app.Application

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        /**
         * Add Custom Exception if any throw exception or error
         */
        GeneralExceptionHandler.initialize(this, CrashActivity::class.java)
    }
}