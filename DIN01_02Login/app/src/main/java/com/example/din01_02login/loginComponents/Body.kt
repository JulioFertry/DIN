package com.example.din01_02login.loginComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.din01_02login.R


@Composable
fun Body(modifier: Modifier) {
    var email by rememberSaveable { mutableStateOf( "") }
    var password by rememberSaveable { mutableStateOf( "") }

    Column(modifier = Modifier) {
        ImageLogo()
        Spacer(modifier = Modifier.size(16.dp))

        Email(email) {
            email = it
        }
        Spacer(modifier = Modifier.size(4.dp))

        Password(password) {
            password = it
        }

    }

}


@Composable
fun ImageLogo() {
    Image(
        painter = painterResource(id = R.drawable.goglogo),
        contentDescription = "Logo",
        modifier = Modifier.size(70.dp)
    )
}


@Composable
fun Email(email: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = email,
        onValueChange = {onTextChanged(it)}
    )
}


@Composable
fun Password(password: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = password,
        onValueChange = {onTextChanged(it)}
    )
}