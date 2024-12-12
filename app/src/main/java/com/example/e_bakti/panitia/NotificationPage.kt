package com.example.e_bakti.panitia
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

@Composable
fun Notifpage(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .requiredWidth(width = 363.dp)
                .requiredHeight(height = 88.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.footerlog),
                contentDescription = "Hijau header",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "NOTIFICATION",
                color = Color.White,
                style = TextStyle(
                        fontSize = 25.sp),
                modifier = Modifier.align(Alignment.Center)
            )

        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 90.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .clip (shape = RoundedCornerShape(10.dp))
                .requiredWidth(296.dp)
                .requiredHeight(120.dp)
                .background(color = Color(0xFFFDFAE4))

            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                ){
                    Text(
                        text = "Challenge Baru",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Challenge 1: Buatlah video perkenalan kampus dengan durasi min 5 menit. upload di instragram dan gunakan cap..",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .clip (shape = RoundedCornerShape(10.dp))
                .requiredWidth(296.dp)
                .requiredHeight(120.dp)
                .background(color = Color(0xFFFDFAE4))

            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                ){
                    Text(
                        text = "Challenge Baru",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Challenge 2: Buatlah video perkenalan kampus dengan durasi min 5 menit. upload di instragram dan gunakan cap..",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }


            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .clip (shape = RoundedCornerShape(10.dp))
                .requiredWidth(296.dp)
                .requiredHeight(120.dp)
                .background(color = Color(0xFFFDFAE4))
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                ){
                    Text(
                        text = "Tugas Baru",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Tugas 2: Buatlah ringkasan perkenalan kampus serta UMKM format pdf...",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .clip (shape = RoundedCornerShape(10.dp))
                .requiredWidth(296.dp)
                .requiredHeight(120.dp)
                .background(color = Color(0xFFFDFAE4))
            ){
                Column (
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                ){
                    Text(
                        text = "Absensi baru telah dibuat",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Absensi Bakti berhasil dibuat ",
                        color = Color(0xFF337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(top = 5.dp)
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
private fun NotifPagePreview() {
    val navController = rememberNavController()
    Notifpage(navController = navController)
}