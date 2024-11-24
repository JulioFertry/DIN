package com.example.din01_01componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TextCheckBox(text: String, isChecked: MutableState<Boolean>) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(10.dp).clickable { isChecked.value = !isChecked.value }
    ) {
        Checkbox(
            checked = isChecked.value,
            onCheckedChange = {isChecked.value = it}
        )

        Spacer(modifier = Modifier.width(5.dp))
        Text(text = text)
    }
}


@Composable
fun TextBox(text: String) {
    TextField(
        value = text,
        onValueChange = {},
        readOnly = true,
        modifier = Modifier.fillMaxWidth().padding(5.dp)
    )
}


@Composable
fun NuclearButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.red),
            contentColor = colorResource(id = R.color.white)
        ),
        modifier = Modifier.size(100.dp)
    ) {
        Text(
            text = "SHOW",
            style = TextStyle(
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}


@Composable
fun Enabler(
    isActive: Boolean,
    onSwitchChange: (Boolean) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(10.dp)
    ) {
        Switch(
            checked = isActive,
            onCheckedChange = { onSwitchChange(it) },
            colors = SwitchDefaults.colors(
                checkedThumbColor = colorResource(id = R.color.green),
                checkedTrackColor = colorResource(id = R.color.lightGreen),
                uncheckedThumbColor = colorResource(id = R.color.black),
                uncheckedTrackColor = colorResource(id = R.color.white)
            ),
            modifier = Modifier.size(100.dp)
        )
    }

}