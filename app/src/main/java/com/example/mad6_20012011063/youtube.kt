package com.example.mad6_20012011063

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class YoutubeActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val YouTube="l04omgNTOt0"
        val mywebview=findViewById<WebView>(R.id.wv)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$YouTube")

    }
}