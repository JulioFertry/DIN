package com.example.din01_02login.logic

import androidx.compose.runtime.mutableStateOf


class LoginViewModel {

    var email = mutableStateOf("")
    var password = mutableStateOf("")
    private var isLoginSuccessful = mutableStateOf(false)
    private var loginErrorMessage = mutableStateOf("")

    private val validUsername = "Juan123"
    private val validPassword = "cocodrilo"


    fun onLoginClick() {
        if (email.value == validUsername && password.value == validPassword) {
            isLoginSuccessful.value = true
            loginErrorMessage.value = ""
        } else {
            isLoginSuccessful.value = false
            loginErrorMessage.value = "Usuario o contraseña incorrectos"
            onClear()
        }
    }


    private fun onClear() {
        email.value = ""
        password.value = ""
        loginErrorMessage.value = ""
    }
}