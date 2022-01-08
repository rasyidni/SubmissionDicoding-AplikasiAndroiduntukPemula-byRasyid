package com.example.astronomicalobject

import AstronomicalObject
import android.app.Notification.EXTRA_TITLE
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAstronomicals: RecyclerView
    private var list: ArrayList<AstronomicalObject> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Objek Astronomi"
        rvAstronomicals = findViewById(R.id.rv_heroes)
        rvAstronomicals.setHasFixedSize(true)

        list.addAll(AstronomicalObjectData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAstronomicals.layoutManager = LinearLayoutManager(this)
        val listAstronomicalAdapter = ListAstronomicalObjectAdapter(list)
        rvAstronomicals.adapter = listAstronomicalAdapter

        listAstronomicalAdapter.setOnItemClickCallback(object : ListAstronomicalObjectAdapter.OnItemClickCallback {
            override fun onItemClicked(data: AstronomicalObject) {
                showSelectedAstronomical(data)
            }
        })
    }

    private fun showSelectedAstronomical(astro: AstronomicalObject) {
        Toast.makeText(this, "Kamu memilih " + astro.name, Toast.LENGTH_SHORT).show()
        val intent = Intent(this@MainActivity, DetailPage::class.java)
        intent.putExtra("photo",astro.photo)
        intent.putExtra(DetailPage.EXTRA_TITLE, astro.name)
        intent.putExtra(DetailPage.EXTRA_DETAIL, astro.detail)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.aboutpage -> {
                val moveIntent = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(moveIntent)
            }
        }
    }
}