package com.example.e_bakti

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.verticalScroll
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterPeserta(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    // Create a scroll state
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bakti),
            contentDescription = "Header Image",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .padding(top = 280.dp)
                .fillMaxSize()
                .background(Color.White)
                .verticalScroll(scrollState) // Make the column scrollable
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .requiredWidth(86.dp)
                    .requiredHeight(43.dp)
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color(0xFF009B4A))) {
                        append("Register")
                    }
                    append(" your account.")
                },
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp, vertical = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(30.dp))

                // Name Field
                Text(
                    text = "Name Lengkap",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text(text = "Name Lengkap") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )

                Spacer(modifier = Modifier.height(30.dp))

                // Phone Number Field
                Text(
                    text = "Phone Number",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    label = { Text(text = "Phone Number") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )

                Spacer(modifier = Modifier.height(30.dp))

                // Password Field
                Text(
                    text = "Password",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Password") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )

                Spacer(modifier = Modifier.height(30.dp))

                // Confirm Password Field
                Text(
                    text = "Confirm Password",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = confirmPassword,
                    onValueChange = { confirmPassword = it },
                    label = { Text(text = "Confirm Password") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )

                Spacer(modifier = Modifier.height(25.dp))

                Button(
                    onClick = {
                        // Handle registration logic here
                        // After successful registration, navigate to login
                        navController.navigate("login")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF009B4A)),
                    modifier = Modifier
                        .requiredWidth(154.5.dp)
                        .requiredHeight(40.dp)
                        .align(Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Register",
                        color = Color.White,
                        style = TextStyle(fontSize = 15.sp)
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                TextButton(onClick = { navController.navigate("login") }) {
                    Text(
                        text = "Already have an account? Login",
                        color = Color.Black,
                        style = TextStyle(fontSize = 15.sp)
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.footerlogin),
            contentDescription = "Footer",
            modifier = Modifier
                .requiredHeight(100.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPesertaPreview() {
    // Provide a mock NavController for preview
    val navController = rememberNavController()
    RegisterPeserta(navController)
}