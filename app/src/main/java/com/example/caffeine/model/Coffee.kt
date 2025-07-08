package com.example.caffeine.model

import com.example.caffeine.R

data class Coffee(
    val title: String,
    val image: Int,
)

val coffeeList = listOf(
    Coffee("Black", R.drawable.cofee_black),
    Coffee("Latte", R.drawable.latte),
    Coffee("Macchiato", R.drawable.macchiato),
    Coffee("Espresso", R.drawable.espreesso),
)