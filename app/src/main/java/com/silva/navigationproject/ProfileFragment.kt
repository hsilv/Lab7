package com.silva.navigationproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputLayout

class ProfileFragment: Fragment (R.layout.profile_fragment){
    private val args: ProfileFragmentArgs by navArgs()
    private lateinit var textInputLayout: TextInputLayout
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textInputLayout = view.findViewById(R.id.email_input_layout)
        button = view.findViewById(R.id.update_final_button)
        textInputLayout.hint = args.email
        setListeners()
    }

    private fun setListeners() {
        button.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }
    }
}