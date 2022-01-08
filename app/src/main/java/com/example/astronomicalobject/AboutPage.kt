package com.example.astronomicalobject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_page)

        supportActionBar?.title = "About Me"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}