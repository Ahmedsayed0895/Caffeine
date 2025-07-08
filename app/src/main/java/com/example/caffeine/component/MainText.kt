package com.example.caffeine.component

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.R
import com.example.caffeine.ui.theme.Sniglet


@Composable
fun MainText() {
    val infiniteTransition = rememberInfiniteTransition()
    val fadeValue = infiniteTransition.animateFloat(
        initialValue = 0.3f,
        targetValue = 1f,
        label = "fadeValue",
        animationSpec = infiniteRepeatable(
            animation = tween(1000),
            repeatMode = RepeatMode.Reverse
        ),
    )
    Box(
        modifier = Modifier
            .padding(bottom = 32.dp)
            .width(188.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hocus \nPocus " +
                    "\nI Need Coffee \nto Focus",
            fontFamily = Sniglet,
            fontSize = 32.sp,
            fontWeight = FontWeight.W400,
            lineHeight = 50.sp,
            letterSpacing = 0.25.sp,
            color = Color(0xFF1f1f1f),
            textAlign = TextAlign.Center,
        )
        Icon(
            painter = painterResource(R.drawable.star),
            contentDescription = "star",
            tint = Color(0xFF1f1f1f),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .alpha(fadeValue.value)
        )
        Icon(
            painter = painterResource(R.drawable.star),
            contentDescription = "star",
            tint = Color(0xFF1f1f1f),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .alpha(fadeValue.value)
        )
        Icon(
            painter = painterResource(R.drawable.star),
            contentDescription = "star",
            tint = Color(0xFF1f1f1f),
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset(y = -26.dp)
                .alpha(fadeValue.value)
        )
    }
}