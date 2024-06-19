package com.varughese.mynewsapp.debug

import timber.log.Timber

object TimberLog {

    fun init() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    fun d(message: String, vararg args: Any?) {
        Timber.d(message, *args)
    }

    fun e(message: String, vararg args: Any?) {
        Timber.e(message, *args)
    }

    fun i(message: String, vararg args: Any?) {
        Timber.i(message, *args)
    }

    fun w(message: String, vararg args: Any?) {
        Timber.w(message, *args)
    }
}