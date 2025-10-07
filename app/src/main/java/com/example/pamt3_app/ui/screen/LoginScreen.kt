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
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: AuthViewModel,
    navController: NavController
) {
    val form = viewModel.loginForm.value

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
            label = "Username",
            value = form.username,
            onValueChange = viewModel::updateUsername
        )

        InputField(
            label = "Password",
            value = form.password,
            onValueChange = viewModel::updatePassword,
            isPassword = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("detail") }) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { navController.navigate("register") }) {
            Text("Daftar")
        }
    }
}
