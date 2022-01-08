package com.example.astronomicalobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailPage : AppCompatActivity() {

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        val imageView: ImageView = findViewById(R.id.imageView)
        val titleView: TextView = findViewById(R.id.titleView)
        val detailView: TextView = findViewById(R.id.detailView)

        val bundle: Bundle? = intent.extras
        val photo: Int = bundle!!.getInt("photo")
        val title = intent.getStringExtra(EXTRA_TITLE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        imageView.setImageResource(photo)
        titleView.text = title
        detailView.text = detail

        supportActionBar?.title = "Detail $title"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}