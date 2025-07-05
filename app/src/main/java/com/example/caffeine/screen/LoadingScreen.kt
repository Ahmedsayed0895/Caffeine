package com.example.caffeine.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.caffeine.R
import com.example.caffeine.component.CupSize
import com.example.caffeine.component.TimerText
import com.example.caffeine.ui.theme.Urbanist

@Composable
fun LoadingScreen(
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
            CupSize()
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(R.drawable.loading_line),
                contentDescription = "Product Image",
                modifier = Modifier
                    .padding(bottom = 32.dp)

            )
            Text(
                text = "Almost Done",
                fontFamily = Urbanist,
                color = Color(0xDE1F1F1F),
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = "Your coffee will be finish in",
                fontFamily = Urbanist,
                color = Color(0x991F1F1F),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            TimerText()


        }

    }
}




