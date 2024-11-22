package com.example.e_bakti

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .background(Color.White)
            .width(360.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.bakti),
                contentDescription = "Header Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(0.98f),
                contentScale = ContentScale.Fit
            )

            Column(
                modifier = Modifier
                    .offset(y = (-60).dp)
                    .clip(RoundedCornerShape(25.dp))
                    .background(Color(0xFFE6E8DA))
                    .shadow(18.dp)
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 33.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .width(76.dp)
                            .aspectRatio(1.9f),
                        contentScale = ContentScale.Fit
                    )

                    Text(
                        text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xFF009B4A))) {
                                append("Register")
                            }
                            append(" a new account.")
                        },
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 16.dp)
                    )

                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Name") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 40.dp)
                            .height(41.dp)
                            .shadow(4.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color(0xFF689581)
                        )
                    )

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 34.dp)
                            .height(41.dp)
                            .shadow(4.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color(0xFF689581)
                        )
                    )

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 34.dp)
                            .height(41.dp)
                            .shadow(4.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color(0xFF689581)
                        )
                    )

                    OutlinedTextField(
                        value = confirmPassword,
                        onValueChange = { confirmPassword = it },
                        label = { Text("Confirm Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 34.dp)
                            .height(41.dp)
                            .shadow(4.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color(0xFF689581)
                        )
                    )

                    Button(
                        onClick = { /* Handle registration */ },
                        modifier = Modifier
                            .width(135.dp)
                            .padding(top = 24.dp)
                            .shadow(4.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF009B4A)
                        )
                    ) {
                        Text(
                            text = "Register",
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.footerlogin),
                    contentDescription = "Footer Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 28.dp)
                        .aspectRatio(4.74f),
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen()
}