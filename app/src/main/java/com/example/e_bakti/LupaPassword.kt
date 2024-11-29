package com.example.e_bakti

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R
import com.example.e_bakti.panitia.HomepagePanitiaBakti

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LupaPasswordPage (navController: NavController, modifier: Modifier = Modifier) {
    var inputText by remember { mutableStateOf("") }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
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
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(25.dp))
                .background(color = Color.White)
                .requiredHeight(700.dp)
                .align(Alignment.BottomCenter)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 40.dp, vertical = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Header Image",
                    modifier = Modifier
                        .requiredWidth(90.dp)
                        .requiredHeight(45.dp)
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color(0xFF009B4A))) {
                            append("Forgot")
                        }
                        append(" password.")
                    },
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp)
                )
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
                    value = inputText,
                    onValueChange = { inputText = it },
                    label = { Text(text = "Phone Number") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Old Password",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                )
                OutlinedTextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    label = { Text(text = "Old Password") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "New Password",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                )
                OutlinedTextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    label = { Text(text = "New Password") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Confirm Password",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                )
                OutlinedTextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    label = { Text(text = "Confirm Password") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0xFF689581)
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    horizontalArrangement = Arrangement.Center

                ) {
                    Button(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5251E)),
                        modifier = Modifier
                            .requiredWidth(110.dp)
                            .requiredHeight(45.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column() {
                            Text(
                                text = "Cancel",
                                color = Color.White,
                                style = TextStyle(
                                    fontSize = 15.sp
                                )
                            )
                        }
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Button(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF009B4A)),
                        modifier = Modifier
                            .requiredWidth(110.dp)
                            .requiredHeight(45.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column() {
                            Text(
                                text = "Submit",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 15.sp
                                )
                            )
                        }

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
fun LupaPasswordPreview() {
    val navController = rememberNavController()
    LupaPasswordPage(navController = navController)
}