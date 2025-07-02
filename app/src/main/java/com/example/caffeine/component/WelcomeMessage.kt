package com.example.caffeine.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.ui.theme.Urbanist


@Composable
fun WelcomeMessage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, bottom = 50.dp),
        horizontalAlignment = Alignment.Start

    ) {
        Text(
            text = "Good Morning",
            color = Color(0xFFB3B3B3),
            fontSize = 36.sp,
            fontWeight = FontWeight.W700,
            fontFamily = Urbanist,
        )
        Text(
            text = "Hamsa ☀",
            color = Color(0xFF3B3B3B),
            fontSize = 36.sp,
            fontWeight = FontWeight.W700,
            fontFamily = Urbanist,
        )
        Text(
            text = "What would you like to drink today?",
            color = Color(0xFF3B3B3B),
            fontSize = 16.sp,
            fontWeight = FontWeight.W700,
            fontFamily = Urbanist,
        )
    }
}