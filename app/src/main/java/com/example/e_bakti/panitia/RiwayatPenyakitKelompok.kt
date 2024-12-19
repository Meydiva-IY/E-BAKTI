package com.example.e_bakti.panitia

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
import androidx.compose.foundation.lazy.LazyColumn
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


@Composable
fun RiwayatPenyakitKelompok(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column (modifier = Modifier
            .requiredHeight(120.dp)
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
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                // Header Row
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Gray)
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "No", modifier = Modifier.weight(1f), color = Color.White)
                        Text(text = "Name", modifier = Modifier.weight(3f), color = Color.White)
                        Text(text = "Riwayat", modifier = Modifier.weight(2f), color = Color.White)
                    }
                }
//                // Data Rows
//                items(students) { student ->
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(8.dp),
//                        horizontalArrangement = Arrangement.SpaceBetween
//                    ) {
//                        Text(text = student.no.toString(), modifier = Modifier.weight(1f))
//                        Column(modifier = Modifier.weight(3f)) {
//                            Text(text = student.name, fontWeight = FontWeight.Bold)
//                            Text(text = student.nim, fontSize = 12.sp, color = Color.Gray)
//                        }
//                        Text(text = student.riwayat, modifier = Modifier.weight(2f))
//                    }
//                }
//            }
//        }



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
private fun RiwayatPenyakitKelompokPreview() {
    val navController = rememberNavController()
    RiwayatPenyakitKelompok(navController = navController)
}