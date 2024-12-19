package com.example.e_bakti.panitia


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun TambahKelompokBaruKelompokPeserta(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp
    var inputText by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column (modifier = Modifier
            .requiredHeight(80.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF009B4A)),
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "KELOMPOK PESERTA",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column(
            modifier = Modifier
                .padding(horizontal = outerPadding)
                .padding(top = 100.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Kelompok Baru",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Kelompok",
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
                        text = "Masukkan No Kelompok",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff009B4A)),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(50.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Tambah Mentor 1",
                    color = Color.White

                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff009B4A)),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(50.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Tambah Mentor 2",
                    color = Color.White

                )
            }
//            Spacer(modifier = Modifier.height(20.dp))
//            Text(
//                text = "Mentor 1",
//                color = Color(0xFF009B4A),
//                style = TextStyle(
//                    fontSize = 15.sp
//                ),
//                modifier = Modifier
//                    .align(Alignment.Start)
//            )
//            OutlinedTextField(
//                modifier = Modifier
//                    .requiredHeight(40.dp)
//                    .fillMaxWidth(),
//                value = inputText,
//                onValueChange = { inputText = it },
//                label = {
//                    Text(
//                        text = "Masukkan Nama Mentor",
//                        style = TextStyle(
//                            fontSize = 14.sp)
//                    )
//                },
//                singleLine = true,
//                shape = RoundedCornerShape(16.dp)
//            )
        }


        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,

            ){
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff009B4A)),
                modifier = Modifier
                    .requiredWidth(130.dp)
                    .requiredHeight(36.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Tambah",
                    color = Color.White

                )

            }
            Spacer (modifier = Modifier.height(50.dp))
            Navigation(navController, modifier = Modifier)

        }

    }
}


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun TambahKelompokBaruKelompokPesertaPreview() {
    val navController = rememberNavController()
    TambahKelompokBaruKelompokPeserta(navController = navController)
}