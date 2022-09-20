package com.example.mad_practical6_20012011083

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId="kRZ9_G7M3TQ"
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)


        val myWebView = findViewById<WebView>(R.id.webView)
        val settings = myWebView.settings
        settings.javaScriptEnabled = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort=true
        myWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}