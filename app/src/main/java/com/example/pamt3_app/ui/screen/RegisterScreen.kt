package com.example.pamt3_app.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pamt3_app.ui.common.InputField

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    viewModel: AuthViewModel,
    navController: NavController
) {
    val form = viewModel.registerForm.value

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Daftar", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(16.dp))

        InputField(
            label = "NIM",
            value = form.nim,
            onValueChange = viewModel::updateNim
        )

        InputField(
            label = "Nama",
            value = form.nama,
            onValueChange = viewModel::updateNama
        )

        InputField(
            label = "Email",
            value = form.email,
            onValueChange = viewModel::updateEmail
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            viewModel.simpanData()
            navController.navigate("detail")
        }) {
            Text("Simpan")
        }
    }
}
