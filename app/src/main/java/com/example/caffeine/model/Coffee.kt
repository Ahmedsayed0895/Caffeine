package com.example.caffeine.model

import com.example.caffeine.R

data class Coffee(
    val title: String,
    val image: Int,
)

val coffeeList = listOf(
    Coffee("Espresso", R.drawable.espreesso),
    Coffee("Macchiato", R.drawable.macchiato),
    Coffee("Latte", R.drawable.latte),
    Coffee("Black", R.drawable.cofee_black),
)