package com.shante.ecomerceshopapp.feature.mycart.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shante.ecomerceshopapp.R
import com.shante.ecomerceshopapp.databinding.FragmentMyCartBinding

class MyCartFragment : Fragment() {

    private lateinit var binding: FragmentMyCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMyCartBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

}