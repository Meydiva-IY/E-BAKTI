package com.example.e_bakti.panitia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R
import com.example.e_bakti.panitia.Navigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EvaluasiAkhir(navController: NavController, modifier: Modifier = Modifier) {
    var deskripsi = remember { mutableStateOf("") }
    val outerPadding = 32.dp

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff009B4A))
    ) {
        Column (modifier = Modifier
            .requiredHeight(80.dp)
            .fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "EVALUASI AKHIR",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column(modifier = Modifier
            .requiredWidth(360.dp)
            .requiredHeight(700.dp)
            .clip(RoundedCornerShape(55.dp))
            .background(color = Color.White)
            .align(Alignment.BottomCenter)
        ){
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(outerPadding),
                horizontalAlignment = Alignment.Start


            ){
                Image(
                    painter = painterResource(R.drawable.imagelogoo),
                    contentDescription = "logo image ",
                    modifier = Modifier
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Nama",
                    style = TextStyle(
                        fontSize = 20.sp
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Nim ",
                    style = TextStyle(
                        fontSize = 10.sp
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
                HorizontalDivider(
                    modifier = modifier
                        .requiredWidth(width = 310.dp), color = Color.Black
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    modifier = Modifier
                        .requiredHeight(200.dp)
                        .fillMaxWidth(),
                    value = deskripsi.value, // Akses nilai dari mutableStateOf
                    onValueChange = { deskripsi.value = it }, // Perbarui nilai deskripsi
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp)
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
private fun EvaluasiAkhirPreview() {
    val navController = rememberNavController()
    EvaluasiAkhir(navController = navController)
}