package com.example.caffeine.screen.loadingScreen

import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import com.example.caffeine.navigation.AppDestination
import com.example.caffeine.ui.theme.Urbanist
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

@Composable
fun LoadingScreen(
    navController: NavController,
) {
    val args: String? = navController.currentBackStackEntry?.arguments?.getString("currentSize")

    val transition = rememberInfiniteTransition()
    val offsetTransition = transition.animateFloat(
        initialValue = 0f,
        targetValue = 420f,
        animationSpec =
            infiniteRepeatable(
                animation = tween(
                    durationMillis = 4000,
                    easing = EaseOut
                ),
                repeatMode = RepeatMode.Reverse
            ),


        )
    LaunchedEffect(Unit) {
        delay(6000)
        withContext(Dispatchers.Main) {
            navController.navigate(AppDestination.OrderDoneScreen.route)
        }
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
            Spacer(
                modifier = Modifier.height(64.dp)
            )
            CupSize(
                currentSize = checkNotNull(args),
                imageOffset = 100f,
            )
            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(R.drawable.loading_line),
                    contentDescription = "Product Image",
                    modifier = Modifier
                        .padding(bottom = 32.dp)

                )
                Box(
                    modifier = Modifier
                        .offset(x = offsetTransition.value.dp)
                        .width(500.dp)
                        .height(50.dp)
                        .background(Color.White)
                ) {

                }
            }

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




