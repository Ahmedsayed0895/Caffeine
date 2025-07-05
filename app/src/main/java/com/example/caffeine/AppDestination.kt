package com.example.caffeine

sealed class AppDestination(val route: String) {
    object StartScreen : AppDestination("StartScreen")
    object CoffeeSelectionScreen : AppDestination("CoffeeSelectionScreen")
    object ProductScreen : AppDestination("ProductScreen")
    object LoadingScreen : AppDestination("LoadingScreen")
    object OrderDoneScreen : AppDestination("OrderDoneScreen")
}