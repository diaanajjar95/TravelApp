package com.example.travelapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_country_details.*

class CountryDetailsFragment : Fragment() {

    // const
    private val TAG = "CountryDetailsFragment"

    // vars
    private lateinit var country: Country

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        country = arguments?.getParcelable("country")!!
        Log.d(TAG, "country : ${country.name}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // render data into views
        Glide.with(this).load(country.image).into(countryDetailsFragment_imageView)
        countryDetailsFragment_nameTv.text = country.name
        countryDetailsFragment__cityTv.text = country.city
        countryDetailsFragment_numberOfDaysAndPriceTv.text = "${country.numberOfDays} ${country.price}"
        countryDetailsFragment_tottalPriceTv.text = "For ${country.numberOfDays} = ${country.price}"

        backImageView.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}