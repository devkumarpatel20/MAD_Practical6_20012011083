package com.example.mad_practical6_20012011083

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId="kRZ9_G7M3TQ"
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val mywebview = findViewById<WebView>(R.id.webView)
        val myactionbutton = findViewById<FloatingActionButton>(R.id.btn2)

        myactionbutton.setOnClickListener(){
            Intent(this,MainActivity::class.java).apply { startActivity(this) }
        }

        val youtubeid = "97JGkxPROOY"

        val webSettings:WebSettings = mywebview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}