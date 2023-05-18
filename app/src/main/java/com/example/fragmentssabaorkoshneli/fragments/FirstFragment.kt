package com.example.fragmentssabaorkoshneli.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragmentssabaorkoshneli.R
import com.example.fragmentssabaorkoshneli.R.id

class FirstFragment: Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the "Ok" button using its ID
        val okButton = view.findViewById<Button>(R.id.goToProfileFragment)
        val okButton2 = view.findViewById<Button>(R.id.goToListFragment)

        // Set a click listener on the "Ok" button
        okButton.setOnClickListener {
            // Navigate to the profile fragment
            val firstName = view.findViewById<EditText>(R.id.firstFragmentFirstNameET).text.toString()
            val lastName = view.findViewById<EditText>(R.id.firstFragmentLastNameET).text.toString()
            val gpa = view.findViewById<EditText>(R.id.firstFragmentGPAET).text.toString().toDouble()

            val bundle = Bundle().apply {
                putString("name", firstName)
                putString("last_name", lastName)
                putDouble("gpa", gpa)
            }

            // Navigate to the profile fragment with arguments
            findNavController().navigate(R.id.thirdFragment, bundle)
        }

        okButton.setOnLongClickListener {
            view.findViewById<EditText>(R.id.firstFragmentFirstNameET).text.clear()
            view.findViewById<EditText>(R.id.firstFragmentLastNameET).text.clear()
            view.findViewById<EditText>(R.id.firstFragmentGPAET).text.clear()
            true // Return true to consume the long-press event
        }

        okButton2.setOnClickListener{
            findNavController().navigate(R.id.secondFragment)
        }
    }

}