package com.example.fangxy.glidepalbykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {

    private var button : Button? = null
    private var iv : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        iv = findViewById(R.id.iv)

    }
    fun onClick(view :View){

        val requestedOrientation :RequestOptions = RequestOptions()
                .error(null)
        Glide.with(this).load("https://avatar.csdn.net/A/A/8/1_maskedfang.jpg?1527152743").apply(requestedOrientation).into(iv!!)

    }
}
