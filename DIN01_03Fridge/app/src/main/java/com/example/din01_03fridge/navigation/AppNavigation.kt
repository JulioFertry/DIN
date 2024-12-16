package com.example.din01_03fridge.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.din01_03fridge.screens.MainScreen
import com.example.din01_03fridge.screens.OptionScreen
import com.example.din01_03fridge.screens.OptionExampleScreen


@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navControlador = rememberNavController()
    NavHost(navController = navControlador, startDestination = AppScreen.MainScreen.route){

        composable(AppScreen.MainScreen.route){
            AppScreen.MainScreen
        }

        composable(AppScreen.OptionScreen.route,
            arguments = listOf(navArgument(name = "text") {type = NavType.StringType})
        ) {
            AppScreen.OptionScreen
        }

    }

}