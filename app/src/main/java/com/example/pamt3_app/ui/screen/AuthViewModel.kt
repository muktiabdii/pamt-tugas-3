package com.example.pamt3_app.ui.screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

data class RegisterForm(
    val nim: String = "",
    val nama: String = "",
    val email: String = "",
    val alamat: String = ""
)

data class LoginForm(
    val email: String = "",
    val password: String = ""
)

class AuthViewModel : ViewModel() {
    var formInput = mutableStateOf(RegisterForm())
    var submittedData = mutableStateOf(RegisterForm())

    var loginForm = mutableStateOf(LoginForm())
    var registeredAccount = mutableStateOf(LoginForm())

    // register
    fun updateNim(newNim: String) {
        formInput.value = formInput.value.copy(nim = newNim)
    }

    fun updateNama(newNama: String) {
        formInput.value = formInput.value.copy(nama = newNama)
    }

    fun updateEmail(newEmail: String) {
        formInput.value = formInput.value.copy(email = newEmail)
    }

    fun updateAlamat(newAlamat: String) {
        formInput.value = formInput.value.copy(alamat = newAlamat)
    }

    fun register() {
        submittedData.value = formInput.value
    }

    // login
    fun updateLoginEmail(newEmail: String) {
        loginForm.value = loginForm.value.copy(email = newEmail)
    }

    fun updateLoginPassword(newPassword: String) {
        loginForm.value = loginForm.value.copy(password = newPassword)
    }

    fun daftarAkun() {
        registeredAccount.value = loginForm.value
    }

    fun login(): Boolean {
        return loginForm.value.email == registeredAccount.value.email &&
                loginForm.value.password == registeredAccount.value.password
    }
}
