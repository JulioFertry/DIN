package com.example.din01_03fridge.navigation

sealed class AppScreen(val route: String) {
    data object MainScreen: AppScreen("MainScreen")
    data object OptionScreen: AppScreen("OptionScreen")
    data object OptionExampleScreen: AppScreen("OptionExampleScreen")
}