package com.example.e_bakti.panitia
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R

@Composable
fun Notifpage(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {
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


        }
        Text(
            text = "NOTIFICATION",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 104.dp,
                    y = 27.dp))
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 118.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 106.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 106.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 28.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 28.dp)
                            .clip(shape = RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Challenge baru",
                        color = Color(0xff337557),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 97.dp,
                                y = 5.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 28.dp)
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 78.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 78.dp)
                            .clip(shape = RoundedCornerShape(bottomStart = 6.dp, bottomEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Challenge 1: Buatlah video perkenalan kampus dengan durasi min 5 menit. upload di instragram dan gunakan cap..",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 11.dp)
                            .requiredWidth(width = 278.dp))
                }
                Icon(
                    painter = painterResource(id = R.drawable.chevronleft),
                    contentDescription = "Chevron right",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 271.dp,
                            y = 3.dp)
                        .requiredSize(size = 22.dp)
                        .rotate(degrees = -180f))
            }
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 106.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 28.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 28.dp)
                            .clip(shape = RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Challenge baru",
                        color = Color(0xff337557),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 97.dp,
                                y = 5.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 28.dp)
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 78.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 78.dp)
                            .clip(shape = RoundedCornerShape(bottomStart = 6.dp, bottomEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Challenge 2: Buatlah video perkenalan kampus dengan durasi min 5 menit. upload di instragram dan gunakan cap..",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 11.dp)
                            .requiredWidth(width = 278.dp))
                }
                Icon(
                    painter = painterResource(id = R.drawable.chevronleft),
                    contentDescription = "Chevron left",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 271.dp,
                            y = 3.dp)
                        .requiredSize(size = 22.dp)
                        .rotate(degrees = -180f))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 360.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 106.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 106.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 28.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 28.dp)
                            .clip(shape = RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Tugas baru",
                        color = Color(0xff337557),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 110.dp,
                                y = 5.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 28.dp)
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 78.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 78.dp)
                            .clip(shape = RoundedCornerShape(bottomStart = 6.dp, bottomEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Challenge 2: Buatlah video perkenalan kampus dengan durasi min 5 menit. upload di instragram dan gunakan cap..",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 11.dp)
                            .requiredWidth(width = 278.dp))
                }
                Icon(
                    painter = painterResource(id = R.drawable.chevronleft),
                    contentDescription = "Chevron left",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 271.dp,
                            y = 3.dp)
                        .requiredSize(size = 22.dp)
                        .rotate(degrees = -180f))
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 481.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 106.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 106.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 28.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 28.dp)
                            .clip(shape = RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Absensi baru telah dibuat",
                        color = Color(0xff337557),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 62.dp,
                                y = 5.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 28.dp)
                        .requiredWidth(width = 296.dp)
                        .requiredHeight(height = 78.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 296.dp)
                            .requiredHeight(height = 78.dp)
                            .clip(shape = RoundedCornerShape(bottomStart = 6.dp, bottomEnd = 6.dp))
                            .background(color = Color(0xfffdfae4)))
                    Text(
                        text = "Absensi Bakti hari ke 3 sudah dibuat",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 11.dp)
                            .requiredWidth(width = 278.dp))
                }
                Icon(
                    painter = painterResource(id = R.drawable.chevronleft),
                    contentDescription = "Chevron left",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 271.dp,
                            y = 3.dp)
                        .requiredSize(size = 22.dp)
                        .rotate(degrees = -180f))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 739.9635009765625.dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 60.dp)
        ) {
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
            Image(
                painter = painterResource(id = R.drawable.homepageicon),
                contentDescription = "Home",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 288.dp,
                        y = 16.0364990234375.dp)
                    .requiredWidth(width = 24.dp)
                    .requiredHeight(height = 26.dp))
            Image(
                painter = painterResource(id = R.drawable.notificon),
                contentDescription = "Group",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 169.dp,
                        y = 17.0364990234375.dp)
                    .requiredWidth(width = 23.dp)
                    .requiredHeight(height = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.profileicon),
                contentDescription = "Group",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 45.dp,
                        y = 17.0364990234375.dp)
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp))
        }
    }
}


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun NotifPagePreview() {
    val navController = rememberNavController()
    Notifpage(navController = navController)
}