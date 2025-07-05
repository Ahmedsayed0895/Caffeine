package com.example.caffeine.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.caffeine.R
import com.example.caffeine.component.CoffeeSeparatedCup
import com.example.caffeine.component.CoffeeSwitchButton
import com.example.caffeine.component.ExitHeader
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.component.OrderReadyMessage

@Composable
fun OrderDoneScreen() {
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
            ExitHeader(bottomSpace = 16.dp, modifier = Modifier.padding(horizontal = 16.dp))
            OrderReadyMessage()
            CoffeeSeparatedCup()
            Spacer(modifier = Modifier.weight(1f))
            CoffeeSwitchButton()
            Spacer(modifier = Modifier.height(16.dp))
            IconTextButton(
                onClick = { },
                text = "Take snack",
                icon = painterResource(R.drawable.arrow_right)
            )
        }

    }
}






