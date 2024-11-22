package com.example.e_bakti.navbar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_bakti.R

@Composable
fun HomepagePanitiaBakti(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .background(color = Color(0xffe6e8da))
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 238.dp)
                .clip(shape = RoundedCornerShape(bottomStart = 54.dp, bottomEnd = 54.dp))
                .background(color = Color(0xff009b4a)))
        Text(
            text = "Halo, User",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 168.dp)
                .requiredWidth(width = 130.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 133.dp,
                    y = 194.dp)
                .requiredWidth(width = 95.dp)
                .requiredHeight(height = 25.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 95.dp)
                    .requiredHeight(height = 25.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = Color(0xffe6e8da)))
            Text(
                text = "Panitia Bakti",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 14.dp,
                        y = 6.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "I 2",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 148.dp,
                    y = 8.dp)
                .requiredWidth(width = 63.dp)
                .requiredHeight(height = 33.dp)
                .border(border = BorderStroke(0.dp, Color.Black)))
        DAvatars12(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 1.dp,
                    y = 62.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 742.dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 58.dp)
        ) {
            Column {
                // Box untuk navigasi
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 360.dp)
                        .requiredHeight(height = 58.dp)
                        .background(color = Color(0xff009b4a))
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.homeicon),
                        contentDescription = "Home",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 49.dp, y = 17.dp)
                            .requiredSize(size = 25.dp)
                            //.clickable { navController.navigate("home") } // Navigasi ke Home
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.notificationicon),
                        contentDescription = "Bell",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 168.dp, y = 17.dp)
                            .requiredSize(size = 25.dp)
                            //.clickable { navController.navigate("notifications") } // Navigasi ke Notifikasi
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.profilicon),
                        contentDescription = "User ",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 287.dp, y = 17.dp)
                            .requiredSize(size = 25.dp)
                            //.clickable { navController.navigate("profile") } // Navigasi ke Profil
                    )
                }

                // Konten lainnya di HomeScreen
                Text(text = "Welcome to Home Screen", modifier = Modifier.padding(16.dp))
            }
        }
        Button(
            onClick = {
                // Action untuk DATA PESERTA BAKTI
            },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp, y = 275.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 54.dp)
                .clip(shape = RoundedCornerShape(6.dp))
                .background(color = Color(0xff689581)), // Anda masih bisa menambahkan background jika diperlukan
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF009B4A)
            )
        ) {
            Text(
                text = "DATA PESERTA BAKTI",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Button(
            onClick = {
                // Action untuk CHALLENGE DAN TUGAS
            },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp, y = 349.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 54.dp)
                .clip(shape = RoundedCornerShape(6.dp))
                .background(color = Color(0xff689581)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF009B4A)
            )
        ) {
            Text(
                text = "CHALLENGE DAN TUGAS",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Button(
            onClick = {
                // Action untuk PENILAIAN PESERTA
            },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp, y = 423.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 54.dp)
                .clip(shape = RoundedCornerShape(6.dp))
                .background(color = Color(0xff689581)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF009B4A)
            )
        ) {
            Text(
                text = "PENILAIAN PESERTA",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Image(
            painter = painterResource(id = R.drawable.profileiconhitam),
            contentDescription = "User",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 62.dp,
                    y = 282.dp)
                .requiredSize(size = 40.dp))
        Image(
            painter = painterResource(id = R.drawable.documenticon),
            contentDescription = "File text",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 62.dp,
                    y = 356.dp)
                .requiredSize(size = 40.dp))
        Image(
            painter = painterResource(id = R.drawable.eyeicon),
            contentDescription = "Eye",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 62.dp,
                    y = 430.dp)
                .requiredSize(size = 40.dp))
    }
}

@Composable
fun DAvatars12(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredSize(size = 100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Avatars / 3d_avatar_12",
            modifier = Modifier
                .fillMaxSize())
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HomepagePanitiaBaktiPreview() {
    HomepagePanitiaBakti(Modifier)
}