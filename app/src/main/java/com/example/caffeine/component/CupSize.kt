package com.example.caffeine.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.caffeine.R


@Composable
fun CupSize() {
    Box(
        modifier = Modifier.size(width = 360.dp, height = 341.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.cup_back),
            contentDescription = "Product Image",
        )

        Image(
            painter = painterResource(R.drawable.cup_front),
            contentDescription = "Product Image",
        )
        Text(
            text = "300 ML",
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 48.dp),
            color = Color(0x99000000)
        )
    }
}