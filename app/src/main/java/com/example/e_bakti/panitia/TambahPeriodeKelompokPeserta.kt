package com.example.e_bakti.panitia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun TambahPeriodeKelompokPeserta(navController: NavController, modifier: Modifier = Modifier) {
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
                text = "Periode Baru",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Periode",
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
                        text = "Masukkan Nama Periode",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Start Periode",
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
                        text = "Masukkan Periode",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "End Periode",
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
                        text = "Masukkan Periode",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
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
private fun TambahPeriodeKelompokPesertaPreview() {
    val navController = rememberNavController()
    TambahPeriodeKelompokPeserta(navController = navController)
}