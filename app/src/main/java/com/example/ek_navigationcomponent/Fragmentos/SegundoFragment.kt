package com.example.ek_navigationcomponent.Fragmentos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ek_navigationcomponent.R

class SegundoFragment : Fragment(R.layout.fragment_segundo) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvTexto = view.findViewById<TextView>(R.id.tvCurso)
        val tvNumero = view.findViewById<TextView>(R.id.tvNumero)
        val btnFinal = view.findViewById<Button>(R.id.btnFinal)

        val texto = arguments?.getString("texto") ?: ""
        val numero = arguments?.getInt("numero") ?: 0

        tvTexto.text = "El texto es: $texto"
        tvNumero.text = "El número es: $numero"

        btnFinal.setOnClickListener {
            findNavController().navigate(R.id.action_segundoFragment_to_finalFragment)
        }
    }
}
