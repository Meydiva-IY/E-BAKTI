package com.example.e_bakti.panitia.kelompokpeserta

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.panitia.Navigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailKelompokPeserta(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff009B4A))
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Header
            Column(
                modifier = Modifier
                    .requiredHeight(80.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Kelompok A",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Periode 2024",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }

            // Main Content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(680.dp)
                    .clip(RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp))
                    .background(color = Color.White)
                    .align(Alignment.BottomCenter)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp)
                ) {
                    // Mentor Card
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFE8F5E9)
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 2.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(
                                text = "Informasi Mentor",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color(0xFF009B4A)
                                ),
                                modifier = Modifier.padding(bottom = 12.dp)
                            )
                            MentorItem(
                                label = "Mentor 1",
                                name = "Dr. John Doe, S.T., M.T."
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            MentorItem(
                                label = "Mentor 2",
                                name = "Jane Smith, S.T., M.Eng."
                            )
                        }
                    }

                    // Daftar Peserta Section
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Daftar Peserta",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        FloatingActionButton(
                            onClick = { /* Handle add participant */ },
                            containerColor = Color(0xFF009B4A),
                            contentColor = Color.White,
                            modifier = Modifier.size(40.dp)
                        ) {
                            Icon(
                                Icons.Default.Add,
                                contentDescription = "Tambah Peserta",
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }

                    // Table Header
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFE8F5E9))
                            .padding(horizontal = 12.dp, vertical = 8.dp)
                    ) {
                        Text(
                            text = "No",
                            modifier = Modifier.width(32.dp),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "Nama",
                            modifier = Modifier.weight(1.5f),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "NIM",
                            modifier = Modifier.weight(1f),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "Jurusan",
                            modifier = Modifier.width(100.dp),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                    }

                    // Table Content
                    LazyColumn {
                        items(10) { index ->
                            TableRow(
                                index = index + 1,
                                nama = "Daniel Smith",
                                nim = "13220${"%03d".format(index + 1)}",
                                jurusan = "Teknik Elektro"
                            )
                        }
                    }
                }
            }

            // Navigation at bottom
            Box(
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Navigation(navController = navController, modifier = Modifier)
            }
        }
    }
}

@Composable
private fun MentorItem(
    label: String,
    name: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Outlined.Person,
            contentDescription = null,
            tint = Color(0xFF009B4A),
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = label,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            )
            Text(
                text = name,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}

@Composable
private fun TableRow(
    index: Int,
    nama: String,
    nim: String,
    jurusan: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = index.toString(),
            modifier = Modifier.width(32.dp),
            style = TextStyle(fontSize = 14.sp)
        )
        Column(
            modifier = Modifier.weight(1.5f)
        ) {
            Text(
                text = nama,
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium)
            )
        }
        Text(
            text = nim,
            modifier = Modifier.weight(1f),
            style = TextStyle(fontSize = 14.sp)
        )
        Text(
            text = jurusan,
            modifier = Modifier.width(100.dp),
            style = TextStyle(fontSize = 14.sp),
            maxLines = 1
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun DetailKelompokPesertaPreview() {
    val navController = rememberNavController()
    DetailKelompokPeserta(navController = navController)
}