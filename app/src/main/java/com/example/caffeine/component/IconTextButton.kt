package com.example.caffeine.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.extension.dropShadow
import com.example.caffeine.ui.theme.Urbanist


@Composable
fun IconTextButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter,
    onClick: () -> Unit = {},
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Color(0xFF1f1f1f)),
        contentPadding = ButtonDefaults.TextButtonWithIconContentPadding,
        modifier = modifier
            .dropShadow(
                blur = 12.dp,
                shape = ButtonDefaults.shape,
                color = Color(0x3D000000),
                offsetY = 6.dp
            )

    ) {
        Row(
            modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = text,
                color = Color(0xDEFFFFFF),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Urbanist,
                modifier = Modifier.padding(end = 8.dp),
            )
            Icon(
                painter = icon,
                contentDescription = "shadow",
                tint = Color(0xDEFFFFFF),
            )
        }

    }
}