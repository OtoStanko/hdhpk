package com.example.hdhpk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Character_info_activity : AppCompatActivity(R.layout.character_info) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO create SecondFragment programmatically, pass it FRAGMENT2_TEXT and place it into container view
        val fragmentText = intent.getStringExtra("class")

        fragmentText?.let { Character_info_fragment(it) }?.let {
            supportFragmentManager.beginTransaction()
                .replace(R.id.character_info, it)
                .commitNow()
        }
    }
}