package com.example.din01_02login.loginComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.din01_02login.R


@Composable
fun Footer(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 20.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            PasswordReset()

            Spacer(modifier = Modifier.width(15.dp))
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(colorResource(id = R.color.elementsColor))
            )
            Spacer(modifier = Modifier.width(15.dp))

            SignUp()
        }
    }

}


@Composable
fun PasswordReset() {
    Text(
        text = "Password reset",
        style = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            color = colorResource(id = R.color.elementsColor)
        ),
        modifier = Modifier.clickable {  }
    )
}


@Composable
fun SignUp() {
    Text(
        text = "Sign up now",
        style = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            color = colorResource(id = R.color.elementsColor)
        ),
        modifier = Modifier.clickable {  }
    )
}