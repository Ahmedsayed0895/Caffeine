package com.example.caffeine.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.caffeine.extension.dropShadow

@Composable
fun SnackCard(image: Int, index: Int, onClick: (Int) -> Unit) {

    Box(
        modifier = Modifier
            .padding(8.dp)
            .dropShadow(
                color = Color(0x1F000000),
                offsetY = 4.dp,
                blur = 12.dp,
                shape = RoundedCornerShape(24.dp)
            )
            .clip(RoundedCornerShape(24.dp))
            .clickable { onClick(image) }
            .background(Color(0xFFF5F5F5))
            .padding(70.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
        )
    }
}

