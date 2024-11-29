package com.example.e_bakti.panitia/*package com.example.e_bakti

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
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
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

@Composable
fun HomepagePanitiaBakti(navController: NavController, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Gambar latar belakang
        Image(
            painter = painterResource(id = R.drawable.universitasandalas),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .blur(20.dp)
        )
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.logo2),
                contentDescription = "I 2",
                modifier = Modifier.size(144.dp, 30.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.graduationfromuniversity),
            contentDescription = "Graduation from university",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 165.dp,
                    y = 111.dp)
                .requiredWidth(width = 226.dp)
                .requiredHeight(height = 169.dp),
        )
        Text(
            text = "Selamat datang, \nUser",
            color = Color.Black,
            style = TextStyle(
                fontSize = 25.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-47).dp,
                    y = 173.dp)
                .requiredWidth(width = 192.dp)
                .requiredHeight(height = 58.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-3.1666259765625).dp,
                    y = (-1).dp)
                .requiredWidth(width = 363.dp)
                .requiredHeight(height = 88.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.footerlog),
                contentDescription = "Footer Log",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (-0.000030517578125).dp, y = 0.dp)
                    .fillMaxWidth() // Mengisi lebar yang tersedia
                    .height(88.dp) // Tetap menetapkan tinggi
                    .border(border = BorderStroke(1.dp, Color(0xff009b4a))),
                contentScale = ContentScale.Crop)

            DAvatars12(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 124.83332824707031.dp,
                        y = 21.dp))
        }

        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 37.dp,
                    y = 366.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 77.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 77.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 77.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xfffdfae4)))
                Text(
                    text = "Data Peserta \nBakti",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 16.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 135.dp,
                            y = 21.dp)
                        .requiredWidth(width = 121.dp))
                Image(
                    painter = painterResource(id = R.drawable.fluentcolorbuildingpeople16),
                    contentDescription = "fluent-color:building-people-16",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 55.dp,
                            y = 15.dp)
                        .requiredSize(size = 44.dp))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 37.dp,
                    y = 466.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 77.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 77.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rectangle),
                    contentDescription = "Rectangle 16",
                    modifier = Modifier
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 77.dp)
                        .clip(shape = RoundedCornerShape(6.dp)))
                Text(
                    text = "CHALLENGE\nDAN TUGAS",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 16.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 135.dp,
                            y = 21.dp))
                Image(
                    painter = painterResource(id = R.drawable.fluentcolordocumentfolder16),
                    contentDescription = "fluent-color:document-folder-16",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 56.dp,
                            y = 14.dp)
                        .requiredSize(size = 44.dp))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 38.dp,
                    y = 570.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 77.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 77.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rectangle),
                    contentDescription = "Rectangle 17",
                    modifier = Modifier
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 77.dp)
                        .clip(shape = RoundedCornerShape(6.dp)))
                Text(
                    text = "PENILAIAN\nPESERTA",
                    color = Color(0xff337557),
                    style = TextStyle(
                        fontSize = 16.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 134.dp,
                            y = 19.dp))
                Image(
                    painter = painterResource(id = R.drawable.fluentcolorclipboardtextedit32),
                    contentDescription = "fluent-color:clipboard-text-edit-32",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 54.dp,
                            y = 14.dp)
                        .requiredSize(size = 44.dp))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 286.dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 34.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 739.9635009765625.dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 60.dp)
        ) {
            NavigationBar() {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 360.dp)
                        .requiredHeight(height = 60.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 360.dp)
                            .requiredHeight(height = 60.dp)
                            .background(color = Color(0xff009b4a)))
                }
            }
            Image(
                painter = painterResource(id = R.drawable.homepageicon),
                contentDescription = "home",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 288.dp,
                        y = 16.0364990234375.dp)
                    .requiredWidth(width = 24.dp)
                    .requiredHeight(height = 26.dp))
            Image(
                painter = painterResource(id = R.drawable.notificon),
                contentDescription = "notif",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 169.dp,
                        y = 17.0364990234375.dp)
                    .requiredWidth(width = 23.dp)
                    .requiredHeight(height = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.profileicon),
                contentDescription = "profie",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 45.dp,
                        y = 17.0364990234375.dp)
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp))
        }
    }
}

@Composable
fun DAvatars12(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 50.dp)
            .requiredHeight(height = 49.dp)
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


 */