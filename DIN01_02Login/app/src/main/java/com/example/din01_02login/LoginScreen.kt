package com.example.din01_02login

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.din01_02login.logic.LoginViewModel
import com.example.din01_02login.loginComponents.Body
import com.example.din01_02login.loginComponents.Footer
import com.example.din01_02login.loginComponents.Header


@Composable
fun LoginScreen() {
    val loginViewModel = LoginViewModel()

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