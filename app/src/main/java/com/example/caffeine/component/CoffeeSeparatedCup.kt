package com.example.caffeine.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.caffeine.R

@Composable
fun CoffeeSeparatedCup() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter

    ) {
        Image(
            painter = painterResource(R.drawable.big_cup),
            contentDescription = "Product Image",
            modifier = Modifier.padding(top = 30.dp),

            )
        Image(
            painter = painterResource(R.drawable.cup_cover),
            contentDescription = "Product Image",
            modifier = Modifier.padding(top = 20.dp),

            )
    }
}