package com.example.pamt3_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pamt3_app.ui.screen.RegisterScreen
import com.example.pamt3_app.ui.screen.RegisterViewModel
import com.example.pamt3_app.ui.theme.Pamt3appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pamt3appTheme {
                val viewModel = RegisterViewModel()
                RegisterScreen(viewModel = viewModel)
            }
        }
    }
}
