package com.example.caffeine.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.caffeine.model.coffeeList

@Composable
fun CoffeeSlider() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val paddingValue = screenWidth * 0.23f
    LazyRow(
        contentPadding = PaddingValues(horizontal = paddingValue)
    ) {
        items(coffeeList) { coffee ->
            CoffeeItem(coffee)
        }
    }
}