package com.example.e_bakti.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R

@Composable
fun HomepagePanitiaBakti(navController: NavController, modifier: Modifier = Modifier) {

    val outerPadding = 32.dp

    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        // Gambar latar belakang
        Image(
            painter = painterResource(id = R.drawable.universitasandalas),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.footerlog),
                contentDescription = "Hijau header",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Selamat datang, \nUser",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 25.sp),
                    modifier = Modifier
                )
                Image(
                    painter = painterResource(id = R.drawable.graduationfromuniversity),
                    contentDescription = "logo universitas",
                    modifier = Modifier
                        .size(150.dp),
                    contentScale = ContentScale.Crop
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = outerPadding),
            ){
                Spacer(modifier = Modifier.height(25.dp))
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(77.14.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fluentcolorbuildingpeople16),
                            contentDescription = "Data Peserta Bakti ",
                            modifier = Modifier
                                .size(40.dp)
                        )
                        Spacer(modifier = Modifier.width(100.dp))
                        Text(
                            text = "DATA PESERTA BAKTI",
                            color = Color(0xff337557),
                            style = TextStyle(
                                fontSize = 20.sp
                            ),
                            modifier = Modifier
                        )
                        Spacer(modifier = Modifier.width(30.dp))

                    }

                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(77.14.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fluentcolordocumentfolder16),
                            contentDescription = "Data Peserta Bakti ",
                            modifier = Modifier
                                .size(40.dp)
                        )
                        Spacer(modifier = Modifier.width(100.dp))
                        Text(
                            text = "CHALLENGE DAN TUGAS",
                            color = Color(0xff337557),
                            style = TextStyle(
                                fontSize = 20.sp
                            ),
                            modifier = Modifier
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(77.14.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fluentcolorclipboardtextedit32),
                            contentDescription = "Data Peserta Bakti ",
                            modifier = Modifier
                                .size(40.dp)
                        )
                        Spacer(modifier = Modifier.width(100.dp))
                        Text(
                            text = "EVALUASI AKHIR",
                            color = Color(0xff337557),
                            style = TextStyle(
                                fontSize = 20.sp
                            ),
                            modifier = Modifier
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                    }
                }

            }

        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = outerPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ){
            Row(horizontalArrangement = Arrangement.Center,
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo2),
                    contentDescription = "Logo Header",
                    modifier = Modifier
                        .requiredWidth(90.dp)
                        .requiredHeight(90.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .requiredWidth(50.dp)
                        .requiredHeight(50.dp)
                        .align(Alignment.CenterVertically)
                )
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
fun HomepagePanitiaBaktiPreview() {
    val navController = rememberNavController()
    HomepagePanitiaBakti(navController = navController)
}

