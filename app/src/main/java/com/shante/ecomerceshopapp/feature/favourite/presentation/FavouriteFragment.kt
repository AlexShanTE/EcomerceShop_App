package com.shante.ecomerceshopapp.feature.favourite.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shante.ecomerceshopapp.R
import com.shante.ecomerceshopapp.databinding.FragmentFavouriteBinding

class FavouriteFragment : Fragment() {

    private lateinit var binding:FragmentFavouriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFavouriteBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

}