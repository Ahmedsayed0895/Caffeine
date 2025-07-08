package com.example.caffeine.screen.startScreen

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.caffeine.R
import com.example.caffeine.component.Header
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.component.MainText
import com.example.caffeine.navigation.AppDestination

@Composable
fun StartScreen(
    navController: NavController
) {
    val infiniteTransition = rememberInfiniteTransition()
    val offsetValue = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = -30f,
        label = "offsetValue",
        animationSpec = infiniteRepeatable(
            animation = tween(1700),
            repeatMode = RepeatMode.Reverse
        )
    )
    val shadowValue = infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0.5f,
        label = "shadowValue",
        animationSpec = infiniteRepeatable(
            animation = tween(
                1700,
            ),
            repeatMode = RepeatMode.Reverse
        )
    )
    val shadowSize = infiniteTransition.animateFloat(
        initialValue = 0.85f,
        targetValue = 1f,
        label = "shadowValue",
        animationSpec = infiniteRepeatable(
            animation = tween(1700),
            repeatMode = RepeatMode.Reverse,
        )
    )
    Scaffold(
        containerColor = Color.White
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(16.dp),
            horizontalAlignment = CenterHorizontally
        ) {
            Header(bottomSpace = 24.dp)
            MainText()
            Image(
                painter = painterResource(R.drawable.coffee_ghost),
                contentDescription = "Coffee Ghost",
                modifier = Modifier.offset(y = offsetValue.value.dp)
            )
            Image(
                painter = painterResource(R.drawable.shadow),
                contentDescription = "shadow",
                modifier = Modifier
                    .alpha(shadowValue.value)
                    .scale(shadowSize.value)

            )
            Spacer(modifier = Modifier.weight(1f))
            IconTextButton(
                text = "bring my coffee",
                icon = painterResource(R.drawable.coffee),
                onClick = { navController.navigate(AppDestination.CoffeeSelectionScreen.route) }
            )



        }

    }
}


