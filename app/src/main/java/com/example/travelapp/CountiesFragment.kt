package com.example.travelapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_counties.*

class CountiesFragment : Fragment(), OnItemClickListener {

    // const
    private val TAG = "CountiesFragment"

    // vars
    private val adapter = RecyclerAdapter(CountiesDataSource.createCountriesList())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counties, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        countries_rc.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = this@CountiesFragment.adapter
        }
        adapter.setOnItemClickListener(this)
    }

    override fun onItemClick(country: Country, position: Int) {
        Log.d(TAG, "item Clicked : ${country.name} + position : $position")
        val bundle = bundleOf("country" to country)
        findNavController().navigate(R.id.action_countiesFragment_to_countryDetailsFragment, bundle)
    }

}