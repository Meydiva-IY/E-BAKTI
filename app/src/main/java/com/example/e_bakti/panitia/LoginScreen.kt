package com.example.e_bakti.panitia

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.example.e_bakti.R

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
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .padding(top = 280.dp)
                .fillMaxSize()
                .background(Color.White)
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Header Image",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .requiredWidth(86.dp)
                    .requiredHeight(43.dp)
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color(0xFF009B4A))) {
                        append("Log in")
                    }
                    append(" to your account.")},
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
                )
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp, vertical = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Phone Number",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Phone Number") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Password",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Password") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Row (horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "Register",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 15.sp
                        ),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "Forgot Password?",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 15.sp
                        ),
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.height(25.dp))
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF009B4A)),
                    modifier = Modifier
                        .requiredWidth(154.5.dp)
                        .requiredHeight(40.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column() {
                        Text(
                            text = "Login",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 15.sp
                            )
                        )
                    }
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
fun LoginScreenPreview() {
    LoginScreen()
}
