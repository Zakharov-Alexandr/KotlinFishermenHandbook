package com.example.kotlinfishermenhandbook

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layout.*
import kotlinx.android.synthetic.main.item_layout.*

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        tvTitle1.text = intent.getStringExtra("title")
        tvTitle1.text = intent.getStringExtra("title")
        im1.setImageResource(intent.getIntExtra("image", ))
    }
}