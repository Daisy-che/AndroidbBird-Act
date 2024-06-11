package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class fiveBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val btnPrev4=findViewById<ImageView>(R.id.imageView7)
        binding.tvBird.setOnClickListener {
            val intent= Intent(this,fourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://img.freepik.com/free-photo/bird-with-blue-head-red-head-sits-pink-flower_1340-22892.jpg")

            .centerInside()
            .resize(500,500)
            .into(binding.btnNext)

        }
    }
