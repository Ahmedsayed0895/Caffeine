package com.example.caffeine.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.model.Coffee


@Composable
fun CoffeeItem(coffee: Coffee) {
    Column(
        horizontalAlignment = CenterHorizontally,
    ) {
        Image(
            painter = painterResource(coffee.image),
            contentDescription = coffee.title,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = coffee.title,
            color = Color(0xFF1f1f1f),
            fontSize = 32.sp,
            fontWeight = FontWeight.W700,
        )
    }
}