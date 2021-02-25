package io.zerod.francev.data;

import io.zerod.francev.R
import io.zerod.francev.model.City

public class DataSource {
    fun loadCities(): List<City> {
        return listOf<City>(
            City(R.string.lille_name, R.string.lille_description, R.drawable.lille_bg_image),
            City(R.string.toulouse_name, R.string.toulouse_description, R.drawable.toulouse_bg_image)
        )
    }
}
