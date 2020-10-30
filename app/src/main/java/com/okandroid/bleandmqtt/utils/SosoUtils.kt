package com.phyathai.NurseTrackingClient.utils

import android.content.Context

class SosoUtils private constructor(
    private val context: Context
) {
    private var sosoUtils: SosoUtils? = null

    companion object {
        private var instance: SosoUtils? = null
        @Synchronized
        fun getInstance(context: Context): SosoUtils {
            if (instance == null) {
                instance = SosoUtils(context)
            }
            return instance as SosoUtils
        }
    }
}