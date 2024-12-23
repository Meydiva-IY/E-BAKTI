package com.example.e_bakti.panitia.tugas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.*
import androidx.compose.material.icons.outlined.AddAPhoto
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material.icons.outlined.Title
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.panitia.Navigation
import java.time.LocalTime

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TugasBaru(navController: NavController, modifier: Modifier = Modifier) {
    var judul by remember { mutableStateOf("") }
    var deskripsi by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff009B4A))
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Header
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Text(
                    text = "Tugas Baru",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            // Content
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color.White,
                shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 24.dp, vertical = 32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Upload Photo Circle
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .border(
                                width = 2.dp,
                                color = Color(0xFF009B4A),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.AddAPhoto,
                            contentDescription = "Upload Foto",
                            tint = Color(0xFF009B4A),
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Text(
                        text = "Upload Foto",
                        color = Color(0xFF009B4A),
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 8.dp)
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    // Judul Tugas
                    OutlinedTextField(
                        value = judul,
                        onValueChange = { judul = it },
                        placeholder = { Text("Judul Tugas") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color.LightGray,
                            focusedBorderColor = Color(0xFF009B4A)
                        ),
                        leadingIcon = {
                            Icon(
                                Icons.Outlined.Title,
                                contentDescription = null,
                                tint = Color(0xFF009B4A)
                            )
                        }
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Deskripsi Tugas
                    OutlinedTextField(
                        value = deskripsi,
                        onValueChange = { deskripsi = it },
                        placeholder = { Text("Deskripsi Tugas") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color.LightGray,
                            focusedBorderColor = Color(0xFF009B4A)
                        ),
                        leadingIcon = {
                            Icon(
                                Icons.Outlined.Description,
                                contentDescription = null,
                                tint = Color(0xFF009B4A)
                            )
                        }
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "Deadline",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Date and Time Buttons
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        OutlinedButton(
                            onClick = { /* Handle date picker */ },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFF009B4A)
                            )
                        ) {
                            Icon(
                                Icons.Outlined.CalendarToday,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Pilih Tanggal")
                        }

                        OutlinedButton(
                            onClick = { /* Handle time picker */ },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFF009B4A)
                            )
                        ) {
                            Icon(
                                Icons.Outlined.Schedule,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Pilih Waktu")
                        }
                    }

                    Spacer(modifier = Modifier.height(32.dp))

                    // Submit Button
                    Button(
                        onClick = {
                            // Handle submit data
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF009B4A)
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "Submit",
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(56.dp)) // Space for navigation
        }
        // Navigation at bottom
        Box(
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Navigation(navController = navController, modifier = Modifier)
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun TugasBaruPreview() {
    val navController = rememberNavController()
    TugasBaru(navController = navController)
}