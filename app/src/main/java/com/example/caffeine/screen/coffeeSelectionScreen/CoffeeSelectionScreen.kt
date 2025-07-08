package com.example.caffeine.screen.coffeeSelectionScreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.caffeine.R
import com.example.caffeine.component.CoffeeSlider
import com.example.caffeine.component.Header
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.component.WelcomeMessage
import com.example.caffeine.model.coffeeList
import com.example.caffeine.navigation.AppDestination



@Composable
fun CoffeeSelectionScreen(
    navController: NavController

) {
    val currentCoffeeTitle = remember { mutableStateOf(coffeeList.first().title) }

    val isVisible = remember { mutableStateOf(true) }

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

            AnimatedVisibility(
                visible = isVisible.value,
                exit = slideOutHorizontally(tween(durationMillis = 700)) { -it }
            ) {
                Header(bottomSpace = 16.dp, modifier = Modifier.padding(horizontal = 16.dp))
            }
            WelcomeMessage()
            CoffeeSlider(onSelectionChanged = {
                currentCoffeeTitle.value = it
            })
            Spacer(modifier = Modifier.weight(1f))
            AnimatedVisibility(
                visible = isVisible.value,
                exit = slideOutHorizontally(tween(durationMillis = 700)) { -it }
            ) {
            IconTextButton(
                text = "Continue",
                icon = painterResource(R.drawable.arrow_right),
                onClick = {
                    isVisible.value = false
                    navController.navigate("${AppDestination.ProductScreen.route}/${currentCoffeeTitle.value}")
                }
            )
            }

        }

    }
}



