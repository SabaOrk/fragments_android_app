package com.example.fragmentssabaorkoshneli.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentssabaorkoshneli.R

class ThirdFragment: Fragment(R.layout.fragment_third) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val lastName = arguments?.getString("last_name")
        val gpa = arguments?.getDouble("gpa")

        // Use the retrieved values as needed
        // For example, update TextViews with the values
        val nameTextView = view.findViewById<TextView>(R.id.ThirdFragmentFirstNameTV)
        val lastNameTextView = view.findViewById<TextView>(R.id.ThirdFragmentLastNameTV)
        val gpaTextView = view.findViewById<TextView>(R.id.ThirdFragmentGPATV)

        nameTextView.text = name
        lastNameTextView.text = lastName
        gpaTextView.text = gpa.toString()
    }

}