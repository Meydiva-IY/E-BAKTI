package com.example.e_bakti.panitia.riwayatpenyakit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun RiwayatPenyakit(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp

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
                text = "RIWAYAT PENYAKIT",
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
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(40.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Cari Periode",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        painter = painterResource(id = R.drawable.searchicon),
                        contentDescription = "Data Peserta Bakti ",
                        modifier = Modifier
                            .size(15.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredHeight(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Kelompok 1",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredHeight(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Kelompok 2",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredHeight(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Kelompok 3",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredHeight(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Kelompok 4",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredHeight(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Kelompok 5",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredHeight(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Kelompok 6",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredHeight(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Kelompok 7",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
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


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun RiwayatPenyakitPreview() {
    val navController = rememberNavController()
    RiwayatPenyakit(navController = navController)
}