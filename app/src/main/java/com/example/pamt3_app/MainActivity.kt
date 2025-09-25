package com.example.pamt3_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pamt3_app.ui.screen.RegisterScreen
import com.example.pamt3_app.ui.screen.LoginScreen
import com.example.pamt3_app.ui.screen.DetailScreen
import com.example.pamt3_app.ui.screen.AuthViewModel
import com.example.pamt3_app.ui.theme.Pamt3appTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val authViewModel: AuthViewModel = viewModel()

            Pamt3appTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    NavHost(
                        navController = navController,
                        startDestination = "register"
                    ) {
                        composable("register") {
                            RegisterScreen(
                                viewModel = authViewModel,
                                navController = navController
                            )
                        }
                        composable("login") {
                            LoginScreen(
                                viewModel = authViewModel,
                                navController = navController
                            )
                        }
                        composable("detail") {
                            DetailScreen(
                                viewModel = authViewModel
                            )
                        }
                    }
                }
            }
        }
    }
}
