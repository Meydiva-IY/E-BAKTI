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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.text.TextStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .padding(top = 372.dp)
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 17.dp)
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Header Image",
                    modifier = Modifier
                        .requiredWidth(86.dp)
                        .requiredHeight(43.dp)
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color(0xFF009B4A))) {
                            append("Log in")
                        }
                        append(" to your account.")
                    },
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp)
                )

            }
            }



        /*
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

                    Text(
                        text = "Forgot password",
                        fontSize = 11.sp,
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(top = 19.dp)
                    )

                    Button(
                        onClick = { /* Handle login */ },
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
                            text = "Login",
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

 */

    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
