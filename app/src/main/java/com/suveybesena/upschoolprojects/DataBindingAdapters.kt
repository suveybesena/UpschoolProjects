package com.suveybesena.upschoolprojects

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class DataBindingAdapters {
    companion object{
        @JvmStatic @BindingAdapter("imageResource")
        fun setImageResource(imageView: ImageView, resource:Int){
            imageView.setImageResource(resource)
        }

    }
}