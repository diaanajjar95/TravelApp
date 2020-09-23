package com.example.travelapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_country.view.*

class CountryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val rootView = itemView.item_country_rootView
    private val name = itemView.item_country_name_tv
    private val city = itemView.item_country_city_tv
    private val numberOfDays = itemView.item_country_numberOfDays_tv
    private val price = itemView.item_country_price_tv
    private val ratingBar = itemView.item_country_ratingBar
    private val imageView = itemView.item_country_imageView

    fun bind(country: Country, listener: OnItemClickListener) {
        name.text = country.name
        city.text = country.city
        numberOfDays.text = country.numberOfDays
        price.text = country.price

        Glide.with(itemView).load(country.image).into(imageView)
        ratingBar.rating = country.rating.toFloat()

        rootView.setOnClickListener {
            listener.onItemClick(country, adapterPosition)
        }
    }

}