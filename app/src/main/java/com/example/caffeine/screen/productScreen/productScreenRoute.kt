package com.example.caffeine.screen.productScreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.caffeine.navigation.AppDestination

fun NavGraphBuilder.productScreenRoute(navController: NavController) {
    composable(
        route = "${AppDestination.ProductScreen.route}/{title}",
        arguments = listOf(navArgument("title") { type = NavType.StringType })
    ) {
        ProductScreen(navController)
    }
}
