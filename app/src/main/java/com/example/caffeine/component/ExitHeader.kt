package com.example.caffeine.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.caffeine.R
import com.example.caffeine.ui.theme.darkestBrown
import com.example.caffeine.ui.theme.primaryWhite


@Composable
fun ExitHeader(
    modifier: Modifier = Modifier,
    bottomSpace: Dp
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = bottomSpace),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(shape = CircleShape)
                .clickable {}
                .background(primaryWhite),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.cancel),
                contentDescription = "back",
                tint = darkestBrown,
                modifier = Modifier.size(24.dp)
            )
        }

    }
}