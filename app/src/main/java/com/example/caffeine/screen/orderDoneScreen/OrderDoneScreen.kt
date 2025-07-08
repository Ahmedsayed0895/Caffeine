package com.example.caffeine.screen.orderDoneScreen

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.caffeine.R
import com.example.caffeine.component.CoffeeSeparatedCup
import com.example.caffeine.component.CoffeeSwitchButton
import com.example.caffeine.component.ExitHeader
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.component.OrderReadyMessage
import com.example.caffeine.navigation.AppDestination

@Composable
fun OrderDoneScreen(
    navController: NavController
) {
    val msgOffset = remember { Animatable(-1000f) }
    val buttonOffsetY = remember { Animatable(300f) }

    LaunchedEffect(Unit) {
        msgOffset.animateTo(
            targetValue = 0f,
            animationSpec = tween(
                1000
            )
        )
    }

    LaunchedEffect(Unit) {
        buttonOffsetY.animateTo(
            targetValue = 0f,
            animationSpec = tween(
                1000
            )
        )
    }
    Scaffold(
        containerColor = Color.White
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
                .padding(vertical = 16.dp),

            horizontalAlignment = CenterHorizontally,

            ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = msgOffset.value.dp),
                horizontalAlignment = CenterHorizontally
            ) {
                ExitHeader(
                    bottomSpace = 16.dp,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    onClick = {
                        navController.popBackStack(
                            route = AppDestination.StartScreen.route,
                            inclusive = false
                        )
                    }
                )
                OrderReadyMessage()
            }
            CoffeeSeparatedCup()
            Spacer(modifier = Modifier.weight(1f))
            CoffeeSwitchButton()
            Spacer(modifier = Modifier.height(16.dp))
            IconTextButton(
                onClick = {
                    navController.navigate(AppDestination.TakeSnacksScreen.route)
                },
                text = "Take snack",
                icon = painterResource(R.drawable.arrow_right),
                modifier = Modifier
                    .offset(y = buttonOffsetY.value.dp)
            )
        }

    }
}






