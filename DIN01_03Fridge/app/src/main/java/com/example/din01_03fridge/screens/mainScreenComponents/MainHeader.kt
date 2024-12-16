package com.example.din01_03fridge.screens.mainScreenComponents

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.din01_03fridge.R


@Composable
fun Header(modifier: Modifier) {
    val activity = LocalContext.current as Activity
    Icon(
        imageVector = Icons.Default.Close,
        contentDescription = "cerrar login",
        tint = colorResource(id = R.color.black),
        modifier = Modifier
            .clickable { activity.finish() }
            .padding(
                top = 20.dp,
                end = 10.dp
            )
    )
}