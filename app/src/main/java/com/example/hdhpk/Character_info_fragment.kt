package com.example.hdhpk

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class Character_info_fragment(fragment_text: String) : Fragment(R.layout.fragment_text){
    private lateinit var textView: TextView
    private var text = fragment_text

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.text)
        setText(text)
    }

    fun setText(text: String) {
        textView.text = text
    }
}