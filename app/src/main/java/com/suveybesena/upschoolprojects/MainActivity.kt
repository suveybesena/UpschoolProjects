package com.suveybesena.upschoolprojects

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.suveybesena.upschoolprojects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.materialButton.setOnClickListener {
            val customAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.custom_anim)
            binding.bvAction.startAnimation(customAnimation)
        }
    }
}