package com.example.uielementsparttwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class RiotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riot)

        val riotsArray = arrayOf(
                "That's What You Get",
                "Hallelujah",
                "When It Rains",
                "Fences",
                "Misery Business")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, riotsArray)
        val riotListView = findViewById<ListView>(R.id.riotListView)
        riotListView.adapter = adapter

        riotListView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            Log.i("Position", "Position $position")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.go_to_albums -> {
                startActivity(Intent(this, AlbumsActivity::class.java))
                true
            }
            R.id.go_to_songs -> {
                startActivity(Intent(this, SongsActivity::class.java))
                true
            }
            R.id.go_to_queue -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}