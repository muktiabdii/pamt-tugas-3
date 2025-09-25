package com.example.pamt3_app.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    viewModel: AuthViewModel,
    navController: NavController
) {
    val form = viewModel.formInput.value

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Register", style = MaterialTheme.typography.titleLarge)

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

        InputField(
            label = "Alamat",
            value = form.alamat,
            onValueChange = viewModel::updateAlamat
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            viewModel.register()
            navController.navigate("login")
        }) {
            Text("Register")
        }
    }
}


@Composable
fun InputField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        visualTransformation = if (isPassword) {
            androidx.compose.ui.text.input.PasswordVisualTransformation()
        } else {
            androidx.compose.ui.text.input.VisualTransformation.None
        }
    )
}
