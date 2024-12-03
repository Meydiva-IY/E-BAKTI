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
                .requiredWidth(296.dp)
                .requiredHeight(120.dp)
                .background(color = Color(0xFFFDFAE4))
                .clip (shape = RoundedCornerShape(10.dp))
            ){

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .requiredWidth(296.dp)
                .requiredHeight(120.dp)
                .background(color = Color(0xFFFDFAE4))
                .clip (shape = RoundedCornerShape(10.dp))
            ){

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .requiredWidth(296.dp)
                .requiredHeight(120.dp)
                .background(color = Color(0xFFFDFAE4))
                .clip (shape = RoundedCornerShape(10.dp))
            ){

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