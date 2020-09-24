package com.example.travelapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Country(
    val name: String,
    val city: String,
    val numberOfDays: String,
    val price: String,
    val rating: Int,
    val image: Int, // because the images located in drawable files not an url's from internet
    val imageBackground: Int // because the images located in drawable files not an url's from internet
) : Parcelable