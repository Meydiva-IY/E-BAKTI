package com.example.e_bakti.panitia.riwayatpenyakit

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
import com.example.e_bakti.panitia.Navigation
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.material3.Checkbox

@Composable
fun ListMahasiswaRiwayatPenyakit(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp
    val selectedRows = remember { mutableStateListOf<Int>() } // List untuk menyimpan indeks yang dipilih

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
            // List peserta
            LazyColumn {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(50.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color(0xffFDFAE4)),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.infologo),
                            contentDescription = "Data Peserta Bakti ",
                            modifier = Modifier
                                .requiredHeight(36.dp)
                                .requiredWidth(29.dp)
                        )
                        Text(
                            text = "Pilih Mahasiswa",
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
                            text = "",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "Nama",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.weight(3f)
                        )

                        Text(
                            text = "Jurusan",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.weight(3f)
                        )
                    }
                }
                items(10) { index ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Checkbox(
                            checked = selectedRows.contains(index),
                            onCheckedChange = { isChecked ->
                                if (isChecked) {
                                    selectedRows.add(index)
                                } else {
                                    selectedRows.remove(index)
                                }
                            },
                            modifier = Modifier
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                        )
                        Text(
                            text = "Daniel Grant\nNIM",
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier
                                .weight(3f)
                                .align(Alignment.CenterVertically),
                            maxLines = 2
                        )
                        Text(
                            text = "${(index % 5) + 1}",
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier
                                .weight(3f)
                                .align(Alignment.CenterVertically)
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
                .requiredWidth(186.dp), // Lebar tombol yang lebih kecil
            shape = RoundedCornerShape(8.dp) // Sudut tombol melengkung
        ) {
            Text(
                text = "Tambah",
                style = TextStyle(
                    fontSize = 15.sp, // Ukuran teks lebih kecil agar sesuai dengan ukuran tombol
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
    @Preview
    @Composable
    private fun ListMahasiswaRiwayatPenyakitPreview(){
        val navController = rememberNavController()
        ListMahasiswaRiwayatPenyakit(navController = navController)
    }