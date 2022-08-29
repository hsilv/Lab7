package com.silva.navigationproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout

class LoginFragment: Fragment (R.layout.login_fragment) {
    private lateinit var createAccountButton: TextView
    private lateinit var loginButton: Button
    private lateinit var emailInput: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createAccountButton = view.findViewById(R.id.create_account_button)
        loginButton = view.findViewById(R.id.login_button)
        emailInput = view.findViewById(R.id.text_login_InputLayout)
        setListeners()
    }
    fun setListeners(){
        createAccountButton.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_loginFragment_to_newAccountFragment)
        }
        loginButton.setOnClickListener{
            val email = emailInput.editText!!.text.toString()
            if(email.equals("jcdurini@uvg.edu.gt")){
                val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(email)
                requireView().findNavController().navigate(action)
            }else{
                val toast = Toast.makeText(context, "El correo no existe", Toast.LENGTH_LONG)
                toast.show()

            }
        }
    }
}