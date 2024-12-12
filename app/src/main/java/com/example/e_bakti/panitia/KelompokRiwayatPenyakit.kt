package com.example.e_bakti.panitia

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun KelompokRiwayatPenyakit(navController: NavController, modifier: Modifier = Modifier) {

}
@Preview
@Composable
private fun KelompokRiwayatPenyakitPreview(){
    val navController = rememberNavController()
    KelompokRiwayatPenyakit(navController = navController)
}
