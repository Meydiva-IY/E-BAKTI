package com.example.e_bakti.panitia

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.focusModifier
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChallangeBaru(navController: NavController, modifier: Modifier = Modifier) {
    val inputText = remember { mutableStateOf("") }
    val outerPadding = 32.dp

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff009B4A))
    ) {
        Column (modifier = Modifier
            .requiredHeight(80.dp)
            .fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "RIWAYAT PENYAKIT",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column(modifier = Modifier
            .requiredWidth(360.dp)
            .requiredHeight(700.dp)
            .clip(RoundedCornerShape(55.dp))
            .background(color = Color.White)
            .align(Alignment.BottomCenter)
        ){
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(outerPadding),
                horizontalAlignment = Alignment.Start


            ){
                Image(
                    painter = painterResource(id = R.drawable.bakti),
                    contentDescription = "foto challange",
                    modifier = Modifier
                        .requiredHeight(100.dp)
                        .requiredWidth(100.dp)
                        .align(Alignment.CenterHorizontally),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Upload Photo",
                    style = TextStyle(
                        fontSize = 10.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Judul Challange",
                    style = TextStyle(
                        fontSize = 15.sp
                    )
                )
                OutlinedTextField(
                    value = inputText.value, // Menggunakan state yang benar
                    onValueChange = { inputText.value = it }, // Mengupdate state
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(40.dp)
                        .align(Alignment.Start),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color.White
                    )
                )

                Spacer(modifier = Modifier.height(15.dp))
                Text (
                    text = "DESKRIPSI CHALLENGE",
                    style = TextStyle(
                        fontSize = 15.sp
                    )
                )
                Spacer(modifier = Modifier.height(5.dp))
                OutlinedTextField(
                    value = inputText.value,
                    onValueChange = { inputText.value = it },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(170.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "DEADLINE",
                    style = TextStyle(
                        fontSize = 20.sp
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row (

                ){
                    Button(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xffFDFAE4)),
                        modifier = Modifier
                            .requiredHeight(35.dp)
                            .requiredWidth(130.dp)
                    ) {
                        Text(
                            text = "Waktu",
                            style = TextStyle(),
                            color = Color.Black
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Button(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xffFDFAE4)),
                        modifier = Modifier
                            .requiredHeight(35.dp)
                            .requiredWidth(130.dp)
                    ) {
                        Text(
                            text = "Waktu",
                            style = TextStyle(),
                            color = Color.Black
                        )
                    }
                }
                Spacer (modifier = Modifier.height(20.dp))
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffFDFAE4)),
                    modifier = Modifier
                        .requiredHeight(35.dp)
                        .requiredWidth(130.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = "SUBMIT",
                        color = Color.Black
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


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ChallangeBaruPreview() {
    val navController = rememberNavController()
    ChallangeBaru(navController = navController)
}