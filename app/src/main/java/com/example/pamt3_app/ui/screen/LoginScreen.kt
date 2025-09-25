package com.example.pamt3_app.ui.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: AuthViewModel,
    navController: NavController
) {
    val loginForm = viewModel.loginForm.value
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Login", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(16.dp))

        InputField(
            label = "Email",
            value = loginForm.email,
            onValueChange = viewModel::updateLoginEmail
        )

        InputField(
            label = "Password",
            value = loginForm.password,
            onValueChange = viewModel::updateLoginPassword,
            isPassword = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            viewModel.daftarAkun()
            Toast.makeText(context, "Akun berhasil didaftarkan", Toast.LENGTH_SHORT).show()
        }) {
            Text("Daftar")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = {
            if (viewModel.login()) {
                navController.navigate("detail")
            } else {
                Toast.makeText(context, "Login gagal, periksa email & password", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text("Login")
        }
    }
}
