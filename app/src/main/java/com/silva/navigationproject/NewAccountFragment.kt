package com.silva.navigationproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout

class NewAccountFragment: Fragment(R.layout.new_account_fragment) {
    private lateinit var inputEmail: TextInputLayout
    private lateinit var createButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inputEmail = view.findViewById(R.id.text_login_InputLayout)
        createButton = view.findViewById(R.id.create_new_account_button)
        setListeners()
    }

    private fun setListeners() {
        createButton.setOnClickListener{
            val input = inputEmail.editText!!.text.toString()
            if(!input.equals("")){
                val action = NewAccountFragmentDirections.actionNewAccountFragmentToHomeFragment(input)
                requireView().findNavController().navigate(action)
            }
        }
    }
}