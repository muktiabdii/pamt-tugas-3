package com.example.pamt3_app.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    viewModel: RegisterViewModel
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = "Register"
        )

        Text(
            modifier = Modifier.padding(bottom = 4.dp),
            text = viewModel.nim.value
        )
        Text(
            modifier = Modifier.padding(bottom = 12.dp),
            text = viewModel.nama.value
        )

        OutlinedTextField(
            modifier = Modifier.padding(bottom = 8.dp),
            value = viewModel.nimInput.value,
            onValueChange = { viewModel.nimInput.value = it },
            label = { Text("NIM") }
        )

        OutlinedTextField(
            modifier = Modifier.padding(bottom = 8.dp),
            value = viewModel.namaInput.value,
            onValueChange = { viewModel.namaInput.value = it },
            label = { Text("Nama") }
        )

        OutlinedTextField(
            modifier = Modifier.padding(bottom = 8.dp),
            value = viewModel.emailInput.value,
            onValueChange = { viewModel.emailInput.value = it },
            label = { Text("Email") }
        )

        OutlinedTextField(
            modifier = Modifier.padding(bottom = 8.dp),
            value = viewModel.alamatInput.value,
            onValueChange = { viewModel.alamatInput.value = it },
            label = { Text("Alamat") }
        )

        Button(
            modifier = Modifier.padding(top = 16.dp),
            onClick = { viewModel.register() }
        ) {
            Text("Register")
        }
    }
}
