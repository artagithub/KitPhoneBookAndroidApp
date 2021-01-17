package com.sematec.basic.utils

import android.content.Context
import android.util.Log
import android.widget.Toast

class AppUtils {
    companion object {
        fun log(msg: String) {
            Log.d("kit-app-debug", msg)
        }

        fun toast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }


}