package com.example.caffeine.screen.coffeeSelectionScreen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CoffeeSelectionScreenViewModel() : ViewModel() {
    private val _state = MutableStateFlow(CoffeeSelectionScreenUiState())
    val state = _state.asStateFlow()

}