package com.example.e_bakti.panitia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R

@Composable
fun Navigation(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeight(60.04.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xff009b4a)),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.homepageicon),
                contentDescription = "Homepage Icon",
                modifier = Modifier
                    .requiredWidth(28.85.dp)
                    .requiredHeight(25.13.dp)
                    .clickable {
                        navController.navigate("homepage") // Ganti dengan route yang sesuai
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.notificon),
                contentDescription = "Notification Icon",
                modifier = Modifier
                    .requiredWidth(28.85.dp)
                    .requiredHeight(25.13.dp)
                    .clickable {
                        navController.navigate("notifications") // Ganti dengan route yang sesuai
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.profileicon),
                contentDescription = "Profile Icon",
                modifier = Modifier
                    .requiredWidth(28.85.dp)
                    .requiredHeight(25.13.dp)
                    .clickable {
                        navController.navigate("profile") // Ganti dengan route yang sesuai
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavigationPreview() {
    val navController = rememberNavController()
    Navigation(navController)
}