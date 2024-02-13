package com.maurodev.delivery_lector.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maurodev.delivery_lector.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.bInit.setOnClickListener {
            openCamera()
        }
    }

    private fun openCamera() {
        val intent = Intent("android.media.action.IMAGE_CAPTURE")
        startActivity(intent)
    }
}