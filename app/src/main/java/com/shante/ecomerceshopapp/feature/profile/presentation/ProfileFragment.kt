package com.shante.ecomerceshopapp.feature.profile.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shante.ecomerceshopapp.R
import com.shante.ecomerceshopapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

}