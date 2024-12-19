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
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R
import kotlin.math.round

@Composable
fun DetailKelompokPeserta(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column (modifier = Modifier
            .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .requiredHeight(80.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFF009B4A)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Kelompok ",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 25.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Periode",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
            }
            Box(
                modifier = Modifier
                    .requiredHeight(100.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(10.dp))
            ) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = outerPadding, vertical = 20.dp)
                ) {
                    Row(

                    ) {
                        Text(
                            text = "Mentor 1 :",
                            style = TextStyle(
                                fontSize = 15.sp
                            ),
                            color = Color(0xff337557),
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Nama Mentor 1",
                            style = TextStyle(
                                fontSize = 15.sp
                            ),
                            color = Color.Black,
                            maxLines = 2
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Row(

                    ) {
                        Text(
                            text = "Mentor 2 :",
                            style = TextStyle(
                                fontSize = 15.sp
                            ),
                            color = Color(0xff337557)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Nama Mentor 2",
                            style = TextStyle(
                                fontSize = 15.sp
                            ),
                            color = Color.Black,
                            maxLines = 2
                        )
                    }

                }

            }
            //chatgpt: List of Participants
            LazyColumn() {
                item {
                    Row (modifier = Modifier
                        .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center

                    ){
                        Text(
                            text = "Peserta Bakti",
                            style = TextStyle(
                                fontSize = 20.sp, fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color(0xFFEEEEEE))
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "No",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "Nama",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.weight(2f)
                        )
                        Text(
                            text = "Nim",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "Jurusan",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
                items(10) { index ->
                    // Table Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "${1 + index}",
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "Daniel Grant",
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier.weight(2f)
                        )
                        Text(
                            text = "Male",
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "${(index % 5) + 1}",
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }

        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Button(
            onClick = {
                // Tindakan saat tombol ditekan
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff009B4A)),
            modifier = Modifier
                .padding(horizontal = 32.dp) // Padding luar untuk posisi
                .requiredHeight(45.dp) // Tinggi tombol
                .requiredWidth(100.dp) // Lebar tombol yang lebih kecil
                .align(Alignment.End), // Tombol berada di posisi kanan bawah
            shape = RoundedCornerShape(8.dp) // Sudut tombol melengkung
        ) {
            Text(
                text = "+ Peserta",
                style = TextStyle(
                    fontSize = 12.sp, // Ukuran teks lebih kecil agar sesuai dengan ukuran tombol
                    color = Color.White, // Warna teks kontras dengan warna tombol
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.fillMaxWidth() // Pastikan teks memenuhi lebar tombol
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Navigation(navController, modifier = Modifier)
    }

}


@Preview()
@Composable
private fun DetailKelompokPesertaPreview() {
    val navController = rememberNavController()
    DetailKelompokPeserta(navController = navController)
}