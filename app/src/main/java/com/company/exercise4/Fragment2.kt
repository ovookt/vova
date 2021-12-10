package com.company.exercise4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    private lateinit var nextActivityButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)

        nextActivityButton = view.findViewById(R.id.Call)

        nextActivityButton.setOnClickListener {
            val phoneNumberUri = Uri.parse("tel:+79099090909")
            val callIntent = Intent(Intent.ACTION_DIAL, phoneNumberUri)

            startActivity(callIntent)

        }
        return view
    }
}