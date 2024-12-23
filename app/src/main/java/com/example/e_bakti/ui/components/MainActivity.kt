package com.example.e_bakti.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.ui.components.kelompokpeserta.DetailKelompokPeserta
import com.example.e_bakti.ui.components.kelompokpeserta.KelompokPeserta
import com.example.e_bakti.ui.theme.EBAKTITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EBAKTITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigator()
                }
            }
        }
    }
}

@Composable
fun AppNavigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splashpage") {
        composable("splashpage") { SplashScreen(navController) }
        composable("login") { LoginScreen(navController) } // Pass navController to LoginScreen
        composable("register") { RegisterPeserta(navController) } // Added RegisterPeserta route
        composable("homepagePanitia") { HomepagePanitiaBakti(navController) }
        composable("notifications") { Notifpage(navController) }
        composable ("forgotPass") { LupaPasswordPage(navController) }
        composable("kelompokPeserta") { KelompokPeserta(navController) }
        composable("detailKelompokPeserta") { DetailKelompokPeserta(navController) }

        }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EBAKTITheme {
        AppNavigator()
    }
}