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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R
import com.example.e_bakti.panitia.LoginScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    var inputText by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .fillMaxWidth()
                .requiredHeight(height = 88.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.footerlog),
                contentDescription = "Hijau header",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "PROFILE",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp
                ),
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 90.dp, bottom = 25.dp)
                .padding(horizontal = 30.dp)
        ){
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(R.drawable.avatar),
                contentDescription = "Avatar",
                modifier = Modifier
                    .requiredWidth(80.dp)
                    .requiredHeight(80.dp)
            )
            Text(
                text = "Upload photo",
                color = Color.Black,
                style = TextStyle(

                )
            )

            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Name",
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
                label = { Text(text = "Name") },
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
                text = "Student ID",
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
                label = { Text(text = "Student ID") },
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
                text = "Name",
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
                label = { Text(text = "Name") },
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
                text = "Name",
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
                label = { Text(text = "Name") },
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
                text = "Name",
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
                label = { Text(text = "Name") },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(0xFF689581)
                )
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

