package com.example.e_bakti.ui.components.riwayatpenyakit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.ui.components.Navigation

data class PenyakitData(
    val nama: String,
    val nim: String,
    val penyakit: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KelompokRiwayatPenyakit(navController: NavController, modifier: Modifier = Modifier) {
    val dummyData = listOf(
        PenyakitData("Sarah Johnson", "13220045", "Asma"),
        PenyakitData("Michael Chen", "13220032", "Diabetes"),
        PenyakitData("Alex Martinez", "13220078", "Maag"),
        PenyakitData("Emily Davis", "13220091", "Alergi")
    )

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

                    // Riwayat Penyakit Section
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Daftar Riwayat Penyakit",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Button(
                            onClick = { /* Handle add */ },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF009B4A)
                            ),
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                Icons.Filled.Add,
                                contentDescription = "Tambah",
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Tambah")
                        }
                    }

                    // Table Header
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFE8F5E9))
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "No",
                            modifier = Modifier.weight(0.5f),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "Nama/NIM",
                            modifier = Modifier.weight(2f),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "Penyakit",
                            modifier = Modifier.weight(1f),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                    }

                    // Table Content
                    LazyColumn {
                        items(dummyData.mapIndexed { index, item -> index to item }) { (index, data) ->
                            PenyakitRow(index = index + 1, data = data)
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
private fun PenyakitRow(index: Int, data: PenyakitData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = index.toString(),
            modifier = Modifier.weight(0.5f),
            style = TextStyle(fontSize = 14.sp)
        )
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Text(
                text = data.nama,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Text(
                text = data.nim,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            )
        }
        Text(
            text = data.penyakit,
            modifier = Modifier.weight(1f),
            style = TextStyle(fontSize = 14.sp)
        )
        IconButton(
            onClick = { /* Handle edit */ },
            modifier = Modifier.weight(0.5f)
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit",
                tint = Color(0xFF009B4A)
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun KelompokRiwayatPenyakitPreview() {
    val navController = rememberNavController()
    KelompokRiwayatPenyakit(navController = navController)
}