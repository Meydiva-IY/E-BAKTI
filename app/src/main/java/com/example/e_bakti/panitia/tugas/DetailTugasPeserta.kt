package com.example.e_bakti.panitia.tugas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Folder
import com.example.e_bakti.panitia.Navigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailTugasPeserta(navController: NavController, modifier: Modifier = Modifier) {
    // State variables
    var nama by remember { mutableStateOf("John Doe") } // Example data
    var nim by remember { mutableStateOf("13220001") }
    var kelompok by remember { mutableStateOf("Kelompok A") }
    var periode by remember { mutableStateOf("2024") }
    var tautan by remember { mutableStateOf("https://example.com/submission") }
    var nilai by remember { mutableStateOf("") }
    var feedback by remember { mutableStateOf("") }

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
                    text = "Detail Tugas",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Main Content
            Column(
                modifier = Modifier
                    .requiredWidth(360.dp)
                    .requiredHeight(680.dp)
                    .clip(RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp))
                    .background(color = Color.White)
                    .align(Alignment.BottomCenter)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    // Directory Information
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFE8F5E9)
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Folder,
                                contentDescription = "Directory",
                                tint = Color(0xff009B4A)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(
                                    text = kelompok,
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = Color(0xff009B4A)
                                    )
                                )
                                Text(
                                    text = "Periode $periode",
                                    style = TextStyle(
                                        fontSize = 14.sp,
                                        color = Color.Gray
                                    )
                                )
                            }
                        }
                    }

                    // Tugas Information
                    Text(
                        text = "Tugas 1",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                    Text(
                        text = "Deadline 6 Juni 2025 pukul 11.59",
                        style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    HorizontalDivider(color = Color.LightGray)
                    Spacer(modifier = Modifier.height(16.dp))

                    // User Information
                    Text(
                        text = "Informasi Peserta",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    UserInfoItem("Nama", nama)
                    UserInfoItem("NIM", nim)

                    // Submission Section
                    Text(
                        text = "Submission",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                    )

                    // Document Card
                    OutlinedCard(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = CardDefaults.outlinedCardColors(
                            containerColor = Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Description,
                                contentDescription = "Document",
                                tint = Color(0xff009B4A)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Dokumen.pdf",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    color = Color(0xff009B4A)
                                )
                            )
                        }
                    }

                    UserInfoItem("Tautan", tautan)

                    Spacer(modifier = Modifier.height(16.dp))
                    HorizontalDivider(color = Color.LightGray)
                    Spacer(modifier = Modifier.height(16.dp))

                    // Penilaian Section
                    Text(
                        text = "Penilaian",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )

                    OutlinedTextField(
                        value = nilai,
                        onValueChange = { nilai = it },
                        label = { Text("Nilai") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        shape = RoundedCornerShape(8.dp)
                    )

                    OutlinedTextField(
                        value = feedback,
                        onValueChange = { feedback = it },
                        label = { Text("Feedback") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(vertical = 8.dp),
                        shape = RoundedCornerShape(8.dp)
                    )

                    // Submit Button
                    Button(
                        onClick = { /* TODO: Handle submission */ },
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(top = 16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff009B4A)
                        )
                    ) {
                        Text("Simpan Penilaian")
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
private fun UserInfoItem(label: String, value: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Text(
            text = label,
            style = TextStyle(
                fontSize = 12.sp,
                color = Color.Gray
            )
        )
        Text(
            text = value,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun DetailTugasPesertaPreview() {
    val navController = rememberNavController()
    DetailTugasPeserta(navController = navController)
}