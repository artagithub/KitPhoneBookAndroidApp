package com.sematec.basic.utils

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import ir.kit.phonebook.R
import ir.kit.phonebook.utils.MyApplication
import java.io.File


fun ImageView.load(ctx: Context, url: String) {
    Glide
        .with(ctx)
        .load(url)
        .centerCrop()
        .placeholder(R.drawable.ic_arrow_white_24px)
        .into(this)
}




fun String.log(tag: String = "kit_debug") {
//    if (BuildConfig.DEBUG) {
//        Log.d(tag, this)
//        //Timber.d(this)
//    }
}

fun Int.log(tag: String = "kit_debug") {
    this.toString().log(tag)
}


fun String.toast() {
    Toast.makeText(MyApplication.context, this, Toast.LENGTH_LONG).show()
}