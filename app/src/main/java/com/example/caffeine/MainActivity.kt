package com.example.caffeine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.caffeine.screen.CoffeeSelectionScreen
import com.example.caffeine.screen.LoadingScreen
import com.example.caffeine.screen.OrderDoneScreen
import com.example.caffeine.screen.StartScreen
import com.example.caffeine.ui.theme.CaffeineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            CaffeineTheme {
                NavHost(
                    navController = navController,
                    startDestination = AppDestination.StartScreen.route
                ) {
                    composable(AppDestination.StartScreen.route) {
                        StartScreen(navController)
                    }
                    composable(AppDestination.CoffeeSelectionScreen.route) {
                        CoffeeSelectionScreen(navController)
                    }
                    composable(AppDestination.LoadingScreen.route) {
                        LoadingScreen(navController)
                    }
                    composable(AppDestination.OrderDoneScreen.route) {
                        OrderDoneScreen(navController)
                    }
                }


            }
        }
    }
}
