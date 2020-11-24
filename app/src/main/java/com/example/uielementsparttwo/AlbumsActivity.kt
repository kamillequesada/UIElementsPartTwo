package com.example.uielementsparttwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView

class AlbumsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_albums)

        val riotsImageView = findViewById(R.id.riotsImageView) as ImageView
        riotsImageView.setOnClickListener {
            startActivity(Intent(this, RiotActivity::class.java))

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