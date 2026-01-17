package com.example.ek_navigationcomponent.Fragmentos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ek_navigationcomponent.R

class InicioFragment : Fragment(R.layout.fragment_inicio) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etTexto = view.findViewById<EditText>(R.id.etTexto)
        val etNumero = view.findViewById<EditText>(R.id.etNumero)
        val btn = view.findViewById<Button>(R.id.btnASegunda)

        btn.setOnClickListener {
            val texto = etTexto.text.toString().trim()
            val numeroStr = etNumero.text.toString().trim()

            if (texto.isBlank() || numeroStr.isBlank()) {
                Toast.makeText(requireContext(), "Rellena todos los campos",
                    Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val bundle = bundleOf(
                "texto" to texto,
                "numero" to numeroStr.toInt()
            )

            findNavController().navigate(
                R.id.action_inicioFragment_to_segundoFragment,
                bundle
            )
        }
    }
}