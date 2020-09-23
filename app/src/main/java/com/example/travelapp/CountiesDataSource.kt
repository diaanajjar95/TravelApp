package com.example.travelapp

class CountiesDataSource {

    companion object {

        fun createCountriesList(): ArrayList<Country> {
            val countriesList = ArrayList<Country>()

            countriesList.add(
                Country(
                    name = "Jordan",
                    city = "Petra",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.jordan,
                    rating = 4
                )
            )

            countriesList.add(
                Country(
                    name = "Italy",
                    city = "Rome",
                    numberOfDays = "4 Days ",
                    price = "$ 469",
                    image = R.drawable.italy,
                    rating = 3
                )
            )

            countriesList.add(
                Country(
                    name = "Jordan",
                    city = "Petra",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.jordan,
                    rating = 4
                )
            )

            countriesList.add(
                Country(
                    name = "Italy",
                    city = "Rome",
                    numberOfDays = "4 Days ",
                    price = "$ 469",
                    image = R.drawable.italy,
                    rating = 3
                )
            )

            countriesList.add(
                Country(
                    name = "Jordan",
                    city = "Petra",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.jordan,
                    rating = 4
                )
            )

            countriesList.add(
                Country(
                    name = "Italy",
                    city = "Rome",
                    numberOfDays = "4 Days ",
                    price = "$ 469",
                    image = R.drawable.italy,
                    rating = 3
                )
            )

            countriesList.add(
                Country(
                    name = "Jordan",
                    city = "Petra",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.jordan,
                    rating = 4
                )
            )

            return countriesList
        }

    }

}