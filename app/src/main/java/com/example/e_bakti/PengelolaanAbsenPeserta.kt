package com.example.e_bakti
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PengelolaanAbsenPesertaBakti(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .background(color = Color(0xffe6e8da))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = (-1).dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 376.dp)
                .background(color = Color(0xff009b4a)))
        Text(
            text = "PENGELOLAAN ABSEN",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 69.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 127.dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 615.dp)
                .clip(shape = RoundedCornerShape(topStart = 54.dp, topEnd = 54.dp))
                .background(color = Color(0xffe6e8da)))
        Icon(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "User",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 321.dp,
                    y = 20.dp)
                .requiredSize(size = 20.dp))
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
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 33.dp,
                    y = 231.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xff689581)))
            Text(
                text = "Kelompok 1",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 106.dp,
                        y = 20.dp)
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 33.dp,
                    y = 311.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xff689581)))
            Text(
                text = "Kelompok 2",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 106.dp,
                        y = 20.dp)
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 33.dp,
                    y = 391.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xff689581)))
            Text(
                text = "Kelompok 3",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 106.dp,
                        y = 20.dp)
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 33.dp,
                    y = 471.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xff689581)))
            Text(
                text = "Kelompok 4",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 106.dp,
                        y = 20.dp)
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 33.dp,
                    y = 551.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xff689581)))
            Text(
                text = "Kelompok 5",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 106.dp,
                        y = 20.dp)
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 33.dp,
                    y = 631.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xff689581)))
            Text(
                text = "Kelompok 6",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 106.dp,
                        y = 20.dp)
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 33.dp,
                    y = 707.dp)
                .requiredWidth(width = 296.dp)
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 296.dp)
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xff689581)))
            Text(
                text = "Kelompok 7",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 106.dp,
                        y = 20.dp)
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 117.dp,
                    y = 150.dp)
                .requiredWidth(width = 150.dp)
                .requiredHeight(height = 30.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 282.dp,
                    y = 149.dp)
                .requiredWidth(width = 42.dp)
                .requiredHeight(height = 31.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 42.dp)
                    .requiredHeight(height = 31.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 42.dp)
                        .requiredHeight(height = 31.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xff009b4a)))
            }
            Image(
                painter = painterResource(id = R.drawable.searchicon),
                contentDescription = "Search",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 8.dp,
                        y = 2.dp)
                    .requiredSize(size = 26.dp))
        }
        Text(
            text = "Nama :",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 38.dp,
                    y = 154.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 742.dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 58.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 58.dp)
                    .background(color = Color(0xff009b4a)))
            Icon(
                painter = painterResource(id = R.drawable.homeicon),
                contentDescription = "Home",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 49.dp,
                        y = 17.dp)
                    .requiredSize(size = 25.dp))
            Icon(
                painter = painterResource(id = R.drawable.notificationicon),
                contentDescription = "Bell",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 168.dp,
                        y = 17.dp)
                    .requiredSize(size = 25.dp))
            Icon(
                painter = painterResource(id = R.drawable.profileiconhitamkecil),
                contentDescription = "User",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 287.dp,
                        y = 17.dp)
                    .requiredSize(size = 25.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.searchicon),
            contentDescription = "Vector 201",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 204.dp)
                .requiredWidth(width = 358.dp)
                .border(border = BorderStroke(1.dp, Color.Black)))
        Icon(
            painter = painterResource(id = R.drawable.chevronleft),
            contentDescription = "Chevron left",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 22.dp,
                    y = 20.dp)
                .requiredSize(size = 22.dp))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun PengelolaanAbsenPesertaBaktiPreview() {
    PengelolaanAbsenPesertaBakti(Modifier)
}