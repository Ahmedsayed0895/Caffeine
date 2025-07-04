package com.example.caffeine.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.ui.theme.Sniglet


@Composable
fun TimerText() {
    val coffeeText = buildAnnotatedString {
        append("CO ")
        withStyle(style = SpanStyle(color = Color(0x1F1F1F1F))) {
            append(":")
        }
        append(" FF ")
        withStyle(style = SpanStyle(color = Color(0x1F1F1F1F))) {
            append(":")
        }
        append(" EE")

    }
    Text(
        modifier = Modifier.padding(top = 12.dp),
        text = coffeeText,
        fontFamily = Sniglet,
        color = Color(0xFF7C351B),
        fontWeight = FontWeight.ExtraBold,
        fontSize = 32.sp
    )
}
