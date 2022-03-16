package com.example.hdhpk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val go_to_druid = findViewById<Button>(R.id.druid)
        val go_to_fighter = findViewById<Button>(R.id.fighter)

        go_to_druid.setOnClickListener {
            val intent = Intent(this, Character_info_activity::class.java)
            intent.putExtra("class", "Druid")
            startActivity(intent)
        }
        go_to_fighter.setOnClickListener {
            val intent = Intent(this, Character_info_activity::class.java)
            intent.putExtra("class", "Fighter/bard")
            startActivity(intent)
        }

    }
}