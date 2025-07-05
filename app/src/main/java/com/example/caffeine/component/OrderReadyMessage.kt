package com.example.caffeine.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.R
import com.example.caffeine.extension.dropShadow
import com.example.caffeine.ui.theme.Urbanist


@Composable
fun OrderReadyMessage() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally,
        modifier = Modifier.width(270.dp)
    ) {

        Box(
            Modifier
                .padding(bottom = 24.dp)
                .dropShadow(
                    shape = CircleShape,
                    color = Color(0x80B94B23),
                    blur = 16.dp,
                    offsetY = 6.dp,
                )
                .size(56.dp)
                .clip(CircleShape)
                .background(Color(0xFF7C351B))
                .padding(horizontal = 10.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.tick),
                contentDescription = "Product Image",
                tint = Color(0xDEFFFFFF),
            )
        }
        Text(
            text = "Your coffee is ready,\nEnjoy",
            color = Color(0xDE1F1F1F),
            fontSize = 22.sp,
            fontFamily = Urbanist,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            letterSpacing = 0.25.sp,
        )
    }
}