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
    var gender by remember { mutableStateOf("") }
    var tgllahir by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var departement by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
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
                .fillMaxSize()
                .padding(top = 280.dp)
                .clip(RoundedCornerShape(30.dp))
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
                // Name Field
                Text(
                    text = "Fullname",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )

                Spacer(modifier = Modifier.height(15.dp))

                // Gender Field
                Text(
                    text = "Gender",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = gender,
                    onValueChange = { gender = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )

                Spacer(modifier = Modifier.height(15.dp))

                // Tgl Lahir Field
                Text(
                    text = "Date of Birth",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = tgllahir,
                    onValueChange = { tgllahir = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )

                Spacer(modifier = Modifier.height(15.dp))
                // Student ID Field
                Text(
                    text = "Student ID",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = nim,
                    onValueChange = { nim = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                // Departement Field
                Text(
                    text = "Departement",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = departement,
                    onValueChange = { departement = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                // Address Field
                Text(
                    text = "Address",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = address,
                    onValueChange = { address = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                // Email Field
                Text(
                    text = "Email",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                // Confirm Password Field
                Text(
                    text = "Password",
                    color = Color.Black,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.align(Alignment.Start)
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
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
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
//bagian bawah
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

                TextButton(onClick = { navController.navigate("login") }) {
                    Text(
                        text = "Already have an account? Login",
                        color = Color.Black,
                        style = TextStyle(fontSize = 15.sp)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
            }
        }
        if (scrollState.value == scrollState.maxValue) {
            Image(
                painter = painterResource(id = R.drawable.footerlogin),
                contentDescription = "Footer",
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .requiredHeight(100.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPesertaPreview() {
    // Provide a mock NavController for preview
    val navController = rememberNavController()
    RegisterPeserta(navController)
}