package com.example.e_bakti

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

@Composable
fun HomepagePanitiaBaktitest(modifier: Modifier = Modifier) {

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
                    contentDescription = "Footer Log",
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
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(outerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ){
            // Tombol Login
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(77.14.dp)
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fluentcolorbuildingpeople16),
                        contentDescription = "Data Peserta Bakti ",
                        modifier = Modifier
                            .size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "DATA PESERTA \n" +
                                "BAKTI",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.width(30.dp))

                }

            }
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(77.14.dp)
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fluentcolordocumentfolder16),
                        contentDescription = "Data Peserta Bakti ",
                        modifier = Modifier
                            .size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "CHALLENGE DAN \n" +
                                "TUGAS",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                }
            }
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(77.14.dp)
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fluentcolorclipboardtextedit32),
                        contentDescription = "Data Peserta Bakti ",
                        modifier = Modifier
                            .size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "CHALLENGE DAN \n" +
                                "TUGAS",
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
}

@Preview(showBackground = true)
@Composable
fun HomepagePanitiaBaktitestPreview() {
    HomepagePanitiaBaktitest(Modifier)
}

