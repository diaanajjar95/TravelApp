package com.example.travelapp

class CountiesDataSource {

    companion object {

        fun createCountriesList(): ArrayList<Country> {
            val countriesList = ArrayList<Country>()

            countriesList.add(
                Country(
                    name = "Palestine",
                    city = "Jerusalem",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.palestine,
                    rating = 4,
                    imageBackground = R.drawable.palestine1
                )
            )

            countriesList.add(
                Country(
                    name = "Jordan",
                    city = "Petra",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.jordan,
                    rating = 4,
                    imageBackground = R.drawable.jordan1
                )
            )

            countriesList.add(
                Country(
                    name = "Germany",
                    city = "Berlin",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.germany,
                    rating = 4,
                    imageBackground = R.drawable.germany1
                )
            )

            countriesList.add(
                Country(
                    name = "Italy",
                    city = "Rome",
                    numberOfDays = "4 Days ",
                    price = "$ 469",
                    image = R.drawable.italy,
                    rating = 3,
                    imageBackground = R.drawable.italy1
                )
            )


            countriesList.add(
                Country(
                    name = "Palestine",
                    city = "Jerusalem",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.palestine,
                    rating = 4,
                    imageBackground = R.drawable.palestine1
                )
            )

            countriesList.add(
                Country(
                    name = "Jordan",
                    city = "Petra",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.jordan,
                    rating = 4,
                    imageBackground = R.drawable.jordan1
                )
            )

            countriesList.add(
                Country(
                    name = "Germany",
                    city = "Berlin",
                    numberOfDays = "5 Days ",
                    price = "JD 222",
                    image = R.drawable.germany,
                    rating = 4,
                    imageBackground = R.drawable.germany1
                )
            )

            countriesList.add(
                Country(
                    name = "Italy",
                    city = "Rome",
                    numberOfDays = "4 Days ",
                    price = "$ 469",
                    image = R.drawable.italy,
                    rating = 3,
                    imageBackground = R.drawable.italy1
                )
            )

            return countriesList
        }

    }

}