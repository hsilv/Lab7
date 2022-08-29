package com.silva.navigationproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class LoginFragment: Fragment (R.layout.login_fragment) {
    private lateinit var createAccountButton: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createAccountButton = view.findViewById(R.id.create_account_button)
        setListeners()
    }
    fun setListeners(){
        createAccountButton.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_loginFragment_to_newAccountFragment)
        }
    }
}