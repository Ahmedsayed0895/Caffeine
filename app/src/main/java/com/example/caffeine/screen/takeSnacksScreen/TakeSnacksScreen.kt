package com.example.caffeine.screen.takeSnacksScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.caffeine.component.ExitHeader
import com.example.caffeine.component.SnackSlider
import com.example.caffeine.model.coffeeList
import com.example.caffeine.navigation.AppDestination
import com.example.caffeine.ui.theme.Urbanist


@Composable
fun TakeSnacksScreen(
    navController: NavController
) {
    val currentCoffeeTitle = remember { mutableStateOf(coffeeList.first().title) }

    TakeSnacksContent(
        onSelectionChanged = {
            currentCoffeeTitle.value = it
        },
        onButtonClick = {
            navController.navigate("${AppDestination.ProductScreen.route}/${currentCoffeeTitle.value}")
        },
        onExitClick = {
            navController.popBackStack(
                route = AppDestination.StartScreen.route,
                inclusive = false
            )
        }
    )
}

@Composable
fun TakeSnacksContent(
    onButtonClick: () -> Unit,
    onSelectionChanged: (String) -> Unit,
    onExitClick: () -> Unit,
) {
    Scaffold(
        containerColor = Color.White
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
                .padding(vertical = 16.dp),


            ) {
            ExitHeader(
                bottomSpace = 16.dp,
                modifier = Modifier.padding(horizontal = 16.dp),
                onClick = onExitClick
            )
            Text(
                text = "Take your snack",
                color = Color(0xDE1F1F1F),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .background(Color.Transparent),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Urbanist
            )

            SnackSlider()

        }

    }
}


