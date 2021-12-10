package com.company.exercise4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class Fragment1 : Fragment() {

    private lateinit var nextActivityButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)

        nextActivityButton = view.findViewById(R.id.UrlButton)

        val googleLink = Uri.parse(getString(R.string.googleLink))
        val openBrowserIntent = Intent(Intent.ACTION_VIEW, googleLink)
        nextActivityButton.setOnClickListener { context?.startActivity(openBrowserIntent) }

        startActivity(openBrowserIntent)

        return view

    }
}