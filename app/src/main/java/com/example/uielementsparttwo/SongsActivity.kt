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

class SongsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs)

        val songsArray = arrayOf(
            "That's What You Get",
            "Hallelujah",
            "When It Rains",
            "Fences",
            "Misery Business",
            "Miracle",
            "Careful",
            "Ignorance",
            "Playing God",
            "Decode",
            "All I wanted",
            "All We Know",
            "Pressure",
            "Emergency",
            "My Heart",
            "Brighter"
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray)
        val songsListView = findViewById<ListView>(R.id.songsListview)
        songsListView.adapter = adapter

        songsListView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
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