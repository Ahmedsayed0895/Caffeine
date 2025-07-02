package com.example.caffeine.component

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.caffeine.model.coffeeList

@Composable
fun CoffeeSlider() {
    LazyRow {
        items(coffeeList) { coffee ->
            CoffeeItem(coffee)
        }
    }
}