package com.dicoding.mysimplecleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dicoding.mysimplecleanarchitecture.R
import com.dicoding.mysimplecleanarchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        val message = viewModel.getMessage("Dico")
        tv_welcome.text = message.welcomeMessage
    }
}