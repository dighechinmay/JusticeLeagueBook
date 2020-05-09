package com.chinmay.superherobook

import android.graphics.Bitmap




class Singleton {
    companion object Chosen {
        var selectedImage: Bitmap? = null
        fun returnImage(): Bitmap {
            return selectedImage!!
        }
    }
}