package com.example.caffeine.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.caffeine.screen.coffeeSelectionScreen.CoffeeSelectionScreen
import com.example.caffeine.screen.loadingScreen.LoadingScreen
import com.example.caffeine.screen.orderDoneScreen.OrderDoneScreen
import com.example.caffeine.screen.productScreen.productScreenRoute
import com.example.caffeine.screen.snackProductScreen.SnackProductScreen
import com.example.caffeine.screen.startScreen.StartScreen

@Composable
fun NavGraph(navController: NavHostController) {
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
        productScreenRoute(navController)
        composable(
            route = AppDestination.LoadingScreen.route,
        ) {
            LoadingScreen(navController)
        }
        composable(AppDestination.OrderDoneScreen.route) {
            OrderDoneScreen(navController)
        }
        composable(AppDestination.SnackProductScreen.route) {
            SnackProductScreen(navController)
        }

    }
}