package com.example.mad_practical6_20012011083

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController = MediaController(this)
        var uri: Uri = Uri.parse("android:resource://" + packageName + "/" + R.raw.thestoryoflight)
        var myVideoView = findViewById<VideoView>(R.id.vidView)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()
        val button=findViewById<FloatingActionButton>(R.id.btn)
        button.setOnClickListener{
           Intent(this,YoutubeActivity::class.java).apply { startActivity(this) }
        }

    }
}