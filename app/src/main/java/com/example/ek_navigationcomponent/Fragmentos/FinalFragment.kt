package com.example.ek_navigationcomponent.Fragmentos

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ek_navigationcomponent.R

class FinalFragment : Fragment(R.layout.fragment_final) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnInicio = view.findViewById<Button>(R.id.btnInicio)

        btnInicio.setOnClickListener {
            findNavController().navigate(R.id.action_finalFragment_to_inicioFragment)
        }
    }
}
