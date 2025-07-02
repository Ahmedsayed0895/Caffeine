package com.example.caffeine.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.caffeine.R
import com.example.caffeine.component.CoffeeSlider
import com.example.caffeine.component.Header
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.component.WelcomeMessage

@Composable
fun CoffeeSelectionScreen() {
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
            Header(bottomSpace = 16.dp, modifier = Modifier.padding(horizontal = 16.dp))
            WelcomeMessage()
            CoffeeSlider()
            Spacer(modifier = Modifier.weight(1f))
            IconTextButton(
                text = "Continue",
                icon = painterResource(R.drawable.arrow_right)
            )

        }

    }
}


