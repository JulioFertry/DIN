package com.example.din01_03fridge.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import com.example.din01_03fridge.R
import com.example.din01_03fridge.screens.mainScreenComponents.Header
import com.example.din01_03fridge.screens.mainScreenComponents.Body


@Composable
fun MainScreen(navController: NavController) {
    MainBody(navController)
}


@Composable
fun MainBody(navController: NavController) {

    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier.fillMaxSize()
        ) {
            Box(
                Modifier
                    .background(color = colorResource(id = R.color.backgroundColor))
                    .fillMaxWidth(), contentAlignment = Alignment.TopEnd
            ) {
                Header(Modifier)
            }

            Box(
                Modifier
                    .weight(11f)
                    .background(color = colorResource(id = R.color.backgroundColor))
                    .fillMaxWidth(), contentAlignment = Alignment.Center
            ) {
                Body(
                    Modifier,
                    loginViewModel
                )
            }

            Box(
                Modifier
                    .background(color = colorResource(id = R.color.footerColor))
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.BottomCenter
            ) {
                Footer(Modifier)
            }
        }
    }

}