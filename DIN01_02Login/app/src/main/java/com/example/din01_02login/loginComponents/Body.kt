package com.example.din01_02login.loginComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.din01_02login.R


@Composable
fun Body(modifier: Modifier) {
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var isLoginEnabled by rememberSaveable { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Logo()
        Spacer(modifier = Modifier.size(30.dp))

        Email(email) {
            email = it
        }
        Spacer(modifier = Modifier.size(16.dp))

        Password(password) {
            password = it
        }
        Spacer(modifier = Modifier.size(30.dp))

        LoginButton(isLoginEnabled)
        Spacer(modifier = Modifier.size(16.dp))

        LoginDivider()
        Spacer(modifier = Modifier.size(16.dp))

        SocialLogin()

    }

}


@Composable
fun Logo() {
    Row {
        Image(
            painter = painterResource(id = R.drawable.goglogo),
            contentDescription = "Logo de GOG",
            modifier = Modifier.size(70.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "LOG IN",
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 35.sp,
                color = colorResource(id = R.color.elementsColor)
            ),
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .scale(1f, 1.25f)
        )
    }

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


@Composable
fun LoginButton(loginEnabled: Boolean) {
    Button(
        shape = RoundedCornerShape(5.dp),
        onClick = {},
        enabled = loginEnabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.log_InButtonColor),
            contentColor = colorResource(id = R.color.white)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "LOG IN NOW",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        )
    }

}


@Composable
fun LoginDivider() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalDivider(
            Modifier
                .background(colorResource(id = R.color.elementsColor))
                .height(1.dp)
                .weight(1f)
        )

        Text(
            text = "OR CONTINUE WITH",
            modifier = Modifier.padding(horizontal = 18.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            color = colorResource(id = R.color.elementsColor)
        )

        HorizontalDivider(
            Modifier
                .background(colorResource(id = R.color.elementsColor))
                .height(1.dp)
                .weight(1f)
        )
    }

}


@Composable
fun SocialLogin() {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        GoogleButton()
        Spacer(modifier = Modifier.width(16.dp))
        DiscordButton()
    }

}


@Composable
fun GoogleButton() {
    Button(
        shape = RoundedCornerShape(5.dp),
        onClick = {},
        enabled = true,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.white),
            contentColor = colorResource(id = R.color.black)
        ),
        modifier = Modifier
            .height(56.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.googlelogo),
                contentDescription = "Logo de google",
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "GOOGLE",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            )
        }
    }

}


@Composable
fun DiscordButton() {
    Button(
        shape = RoundedCornerShape(5.dp),
        onClick = {},
        enabled = true,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.discordButtonColor),
            contentColor = colorResource(id = R.color.white)
        ),
        modifier = Modifier
            .height(56.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.discordlogo),
                contentDescription = "Logo de discord",
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "DISCORD",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            )
        }
    }

}