package com.example.caffeine.screen.productScreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.EaseInOutCubic
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
import com.example.caffeine.navigation.AppDestination
import kotlinx.coroutines.launch

@Composable
fun ProductScreen(
    navController: NavController,
) {
    val currentSize = remember { mutableStateOf("M") }
    val currentCoffeeLevel = remember { mutableStateOf("Low") }
    val previousCoffeeLevel = remember { mutableStateOf("") }
    val buttonOffsetY = remember { Animatable(300f) }
    val buttonFade = remember { Animatable(0.2f) }
    val isVisible = remember { mutableStateOf(true) }
    val args: String? = navController.currentBackStackEntry?.arguments?.getString("title")
    val imageOffset = remember { Animatable(-1000f) }
    val coffeeScale = remember { Animatable(0f) }


    LaunchedEffect(currentCoffeeLevel.value) {
        val targetOffset = 100f
        val levelOrder = mapOf("Low" to 1, "Medium" to 2, "High" to 3)
        val currentLevelValue = levelOrder[currentCoffeeLevel.value] ?: 1
        val previousLevelValue = levelOrder[previousCoffeeLevel.value] ?: 0
        if (currentLevelValue > previousLevelValue || previousLevelValue == 0) {
            imageOffset.snapTo(-1000f)
            imageOffset.animateTo(
                targetValue = targetOffset,
                animationSpec = tween(durationMillis = 1000, easing = EaseInOutCubic)
            )
            launch {
                coffeeScale.animateTo(
                    targetValue = 1f,
                    animationSpec = tween(durationMillis = 1000, easing = EaseInOut)
                )
            }
        } else {
            imageOffset.snapTo(100f)
            imageOffset.animateTo(
                targetValue = -1000f,
                animationSpec = tween(durationMillis = 1000, easing = EaseInOutCubic)
            )
            launch {
                coffeeScale.animateTo(
                    targetValue = 1f,
                    animationSpec = tween(durationMillis = 1000, easing = EaseInOut)
                )
            }
        }
        previousCoffeeLevel.value = currentCoffeeLevel.value
    }



    LaunchedEffect(Unit) {
        buttonOffsetY.animateTo(
            targetValue = 0f,
            animationSpec = tween(
                durationMillis = 600,
                easing = EaseInOut,

                )
        )
        buttonFade.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 200,
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

            BackButtonHeader(
                bottomSpace = 16.dp,
                modifier = Modifier.padding(horizontal = 16.dp),
                title = checkNotNull(args)
            ) {
                navController.popBackStack()
            }


            CupSize(
                currentSize = currentSize.value,
                imageOffset = imageOffset.value,
            )
            SizeSelector(
                currentSize = currentSize.value,
                onClick = {
                    currentSize.value = it
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CoffeeSelector(
                currentCoffeeLevel = currentCoffeeLevel.value,
                onClick = {
                    currentCoffeeLevel.value = it

                }
            )
            Spacer(modifier = Modifier.weight(1f))
            AnimatedVisibility(
                visible = isVisible.value,
                exit = fadeOut(tween(durationMillis = 700))
            ) {
                IconTextButton(
                    text = "Continue",
                    icon = painterResource(R.drawable.arrow_right),
                    modifier = Modifier
                        .offset(y = buttonOffsetY.value.dp)
                        .alpha(buttonFade.value),
                    onClick = {
                        isVisible.value = false
                        navController.navigate("${AppDestination.LoadingScreen.route}/${currentSize.value}")
                    }
                )

            }

        }
    }

}



