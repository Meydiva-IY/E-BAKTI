package com.example.e_bakti.panitia

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
import com.example.e_bakti.SplashScreen
import com.example.e_bakti.ui.theme.EBAKTITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EBAKTITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background // Pastikan warna latar belakang sesuai
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
        composable("homepage") { HomepagePanitiaBakti(navController) } // Pastikan untuk mengirim navController
        composable("notifications") { Notifpage(navController) } // Tambahkan rute lain sesuai kebutuhan
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EBAKTITheme {
        AppNavigator()
    }
}