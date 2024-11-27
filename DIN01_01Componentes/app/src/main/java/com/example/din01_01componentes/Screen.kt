package com.example.din01_01componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val textBoxContent = rememberSaveable { mutableStateOf("") }
    val isSwitchActive = rememberSaveable { mutableStateOf(false) }

    val checkBoxList = rememberSaveable {
        mutableListOf(
            CheckBoxData("Objetivo 1", mutableStateOf(false)),
            CheckBoxData("Objetivo 2", mutableStateOf(false)),
            CheckBoxData("Objetivo 3", mutableStateOf(false))
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().padding(10.dp)
    ) {
        checkBoxList.forEach { item ->
            TextCheckBox(item.text, item.isChecked)
        }

        Spacer(modifier = Modifier.height(15.dp))

        TextBox(textBoxContent.value)

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {

            Enabler(
                isSwitchActive.value,
                onSwitchChange = {
                    isSwitchActive.value = it
                    if (!it) {
                        textBoxContent.value = ""
                    }
                }
            )

            Spacer(modifier = Modifier.width(10.dp))

            NuclearButton(
                onClick = {
                    if (isSwitchActive.value) {
                        val firstChecked = checkBoxList.find { it.isChecked.value }
                        textBoxContent.value = firstChecked?.text?: ""
                    } else {
                        textBoxContent.value = ""
                    }
                },
                enabled = false
            )
        }


    }

}