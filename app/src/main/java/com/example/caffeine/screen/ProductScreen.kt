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
import androidx.navigation.NavController
import com.example.caffeine.R
import com.example.caffeine.component.BackButtonHeader
import com.example.caffeine.component.CoffeeSelector
import com.example.caffeine.component.CupSize
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.component.SizeSelector

@Composable
fun ProductScreen(
    navController: NavController,
) {
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
            BackButtonHeader(bottomSpace = 16.dp, modifier = Modifier.padding(horizontal = 16.dp)) {
                navController.popBackStack()
            }
            CupSize()
            SizeSelector()
            Spacer(modifier = Modifier.height(16.dp))
            CoffeeSelector()
            Spacer(modifier = Modifier.weight(1f))
            IconTextButton(
                text = "Continue",
                icon = painterResource(R.drawable.arrow_right)
            )

        }

    }
}




