package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.fitnessapp.databinding.ActivityContactNumOtpPageBinding

class Contact_num_otp_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityContactNumOtpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}