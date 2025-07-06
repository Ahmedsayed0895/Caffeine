package com.example.caffeine.screen.startScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
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
            )
            Image(
                painter = painterResource(R.drawable.shadow),
                contentDescription = "shadow",
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


