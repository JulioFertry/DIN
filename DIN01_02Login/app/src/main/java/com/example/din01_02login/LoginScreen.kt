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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.din01_02login.loginComponents.Body
import com.example.din01_02login.loginComponents.Header


@Composable
fun LoginScreen() {
    Box(Modifier.fillMaxSize()) {

        Column {
            Box(
                Modifier
                    .background(color = colorResource(id = R.color.backgroundColor))
                    .fillMaxWidth(), contentAlignment = Alignment.TopEnd
            ) {
                Header(Modifier.padding(10.dp))
            }

            Box(
                Modifier
                    .weight(1f)
                    .background(color = colorResource(id = R.color.backgroundColor))
                    .fillMaxSize(), contentAlignment = Alignment.Center
            ) {
                Body(Modifier.padding(10.dp))
            }
        }

    }
}