package com.example.e_bakti.mahasiswa

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R
import com.example.e_bakti.panitia.Navigation


@Composable
fun EditProfileScreen(navController: NavController) {
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

            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Name",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Name",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Student ID",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Nim",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Group",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Kelompok",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Departement",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Jurusan",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Address",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Row {
                        Text(
                            text = "Alamat",
                            style = TextStyle(
                                fontSize = 14.sp)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painter = painterResource(R.drawable.editlogo),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .requiredHeight(16.dp)
                                .requiredWidth(16.dp)
                        )
                    }
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Mobile Number",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label =
                {
                    Row {
                        Text(
                            text = "Alamat",
                            style = TextStyle(
                                fontSize = 14.sp)
                    )
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painter = painterResource(R.drawable.editlogo),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .requiredHeight(16.dp)
                                .requiredWidth(16.dp)
                        )
                    }
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff009B4A)),
                modifier = Modifier
                    .requiredWidth(135.dp)
                    .requiredHeight(40.dp),
                shape = RoundedCornerShape(8.dp)
            ){
                Column()
                {
                    Text(
                        text = "Edit Profile",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 15.sp
                        )
                    )
                }

            }

        }
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,

            ){
            Navigation(navController, modifier = Modifier)

        }


    }
}


@Preview(showBackground = true)
@Composable
fun EditProfileScreenPreview() {
    val navController = rememberNavController()
    EditProfileScreen (navController = navController)
}

