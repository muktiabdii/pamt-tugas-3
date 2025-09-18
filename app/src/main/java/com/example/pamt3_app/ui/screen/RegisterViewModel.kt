package com.example.pamt3_app.ui.screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
    var nimInput = mutableStateOf("")
    var namaInput = mutableStateOf("")
    var emailInput = mutableStateOf("")
    var alamatInput = mutableStateOf("")

    var nim = mutableStateOf("")
    var nama = mutableStateOf("")
    var email = mutableStateOf("")
    var alamat = mutableStateOf("")

    fun register() {
        nim.value = nimInput.value
        nama.value = namaInput.value
        email.value = emailInput.value
        alamat.value = alamatInput.value
    }
}
