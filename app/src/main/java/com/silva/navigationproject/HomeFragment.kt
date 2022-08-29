package com.silva.navigationproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class HomeFragment: Fragment(R.layout.home_fragment) {
    private val args: HomeFragmentArgs by navArgs()
    private lateinit var emailDesc: TextView
    private lateinit var updateButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        emailDesc = view.findViewById(R.id.loged_in_desc)
        updateButton = view.findViewById(R.id.update_profile_button)
        emailDesc.text = "Hola "+args.email+", necesitamos que actualices tu perfil"
        setListeners()
    }

    private fun setListeners() {
        updateButton.setOnClickListener{
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(args.email)
            requireView().findNavController().navigate(action)
        }
    }

}