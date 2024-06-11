package com.example.hello

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

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnPrev=findViewById<ImageView>(R.id.btnNext)
        val btnNext2=findViewById<ImageView>(R.id.btnNext)
        btnPrev.setOnClickListener {
            finish()
        }
        binding.btnNext.setOnClickListener {
            val intent=Intent(this,fourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.pexels.com/photos/326900/pexels-photo-326900.jpeg?cs=srgb&dl=pexels-pixabay-326900.jpg&fm=jpg")

            .centerInside()
            .resize(500,500)
            .into(binding.imageView2)

        var btnNext= findViewById<ImageView>(R.id.btnNext)
            binding.btnNext.setOnClickListener {
            val intent=Intent(this,thirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://cdn4.sharechat.com/compressed_gm_40_img_115456_1fc61139_1703590113323_sc.jpg?tenant=sc&referrer=tag-service&f=323_sc.jpg")

            .centerInside()
            .resize(500,500)
            .into(binding.btnNext)

    }
}