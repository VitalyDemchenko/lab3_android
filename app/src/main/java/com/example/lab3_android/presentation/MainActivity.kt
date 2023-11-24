package com.example.lab3_android.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_android.R
import com.example.lab3_android.databinding.ActivityMainBinding
import androidx.navigation.NavController
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.fragment1)

        MAIN = this

    }
}