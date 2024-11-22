package com.example.e_bakti

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun Splash(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 402.dp)
            .requiredHeight(height = 874.dp)
            .background(color = Color(0xfffdfae4))
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 70.dp,
                    y = 250.dp)
                .requiredWidth(width = 262.dp)
                .requiredHeight(height = 138.dp)
                .border(border = BorderStroke(0.dp, Color.White)))
        Text(
            text = "E-Bakti",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 146.dp,
                    y = 388.dp)
                .requiredWidth(width = 109.dp))
    }
}

@Preview(widthDp = 402, heightDp = 874)
@Composable
private fun SplashPreview() {
    Splash(Modifier)
}