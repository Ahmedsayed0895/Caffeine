package com.example.caffeine.screen

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
import com.example.caffeine.R
import com.example.caffeine.component.Header
import com.example.caffeine.component.IconTextButton
import com.example.caffeine.component.MainText

@Composable
fun StartScreen() {
    Scaffold(
        containerColor = Color.White
    ) { contentPadding ->
        Column(
            modifier = Modifier.padding(contentPadding),
            horizontalAlignment = CenterHorizontally
        ) {
            Header()
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
            IconTextButton()



        }

    }
}


