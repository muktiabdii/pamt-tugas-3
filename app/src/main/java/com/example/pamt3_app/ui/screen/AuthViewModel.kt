package com.example.pamt3_app.ui.screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

data class RegisterForm(
    val nim: String = "",
    val nama: String = "",
    val email: String = ""
)

data class LoginForm(
    val username: String = "",
    val password: String = ""
)

class AuthViewModel : ViewModel() {
    var registerForm = mutableStateOf(RegisterForm())
    var submittedData = mutableStateOf(RegisterForm())

    var loginForm = mutableStateOf(LoginForm())

    // register
    fun updateNim(newNim: String) {
        registerForm.value = registerForm.value.copy(nim = newNim)
    }

    fun updateNama(newNama: String) {
        registerForm.value = registerForm.value.copy(nama = newNama)
    }

    fun updateEmail(newEmail: String) {
        registerForm.value = registerForm.value.copy(email = newEmail)
    }

    fun simpanData() {
        submittedData.value = registerForm.value
    }

    // login
    fun updateUsername(newUsername: String) {
        loginForm.value = loginForm.value.copy(username = newUsername)
    }

    fun updatePassword(newPassword: String) {
        loginForm.value = loginForm.value.copy(password = newPassword)
    }
}
