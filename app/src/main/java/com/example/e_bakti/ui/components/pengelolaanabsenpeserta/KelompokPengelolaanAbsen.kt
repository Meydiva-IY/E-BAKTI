package com.example.e_bakti.ui.components.pengelolaanabsenpeserta

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.ui.components.Navigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KelompokPengelolaanAbsen(navController: NavController, modifier: Modifier = Modifier) {
    val dummyData = listOf(
        AbsensiData("Sarah Johnson", "13220045", 8, 0, 1, 1),
        AbsensiData("Michael Chen", "13220032", 7, 1, 1, 1),
        AbsensiData("Alex Martinez", "13220078", 9, 0, 0, 1),
        AbsensiData("Emily Davis", "13220091", 6, 2, 1, 1),
        AbsensiData("Aisha Patel", "13220023", 8, 0, 2, 0),
        AbsensiData("James Wilson", "13220056", 7, 1, 0, 2),
        AbsensiData("Maria Garcia", "13220067", 9, 0, 1, 0),
        AbsensiData("David Kim", "13220089", 8, 1, 0, 1)
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

                    // Absensi Section
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Rekap Absensi",
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
                            text = "Nama/NIM",
                            modifier = Modifier.weight(2f),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "Hadir",
                            modifier = Modifier.weight(0.7f),
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "Absen",
                            modifier = Modifier.weight(0.7f),
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "S/I",
                            modifier = Modifier.weight(0.7f),
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "Edit",
                            modifier = Modifier.weight(0.7f),
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            textAlign = TextAlign.Center
                        )
                    }

                    // Table Content
                    LazyColumn {
                        items(dummyData) { data ->
                            AbsensiRow(data = data)
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
private fun AbsensiRow(data: AbsensiData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
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
        Box(
            modifier = Modifier.weight(0.7f),
            contentAlignment = Alignment.Center
        ) {
            AbsensiCount(data.hadir)
        }
        Box(
            modifier = Modifier.weight(0.7f),
            contentAlignment = Alignment.Center
        ) {
            AbsensiCount(data.alpha)
        }
        Box(
            modifier = Modifier.weight(0.7f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "${data.sakit}/${data.izin}",
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(
                        when {
                            data.sakit + data.izin == 0 -> Color(0xFFE8F5E9)
                            data.sakit + data.izin > 2 -> Color(0xFFFFEBEE)
                            else -> Color(0xFFF5F5F5)
                        }
                    )
                    .padding(horizontal = 8.dp, vertical = 4.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                ),
                textAlign = TextAlign.Center
            )
        }
        Box(
            modifier = Modifier.weight(0.7f),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                onClick = { /* Handle edit */ }
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Edit",
                    tint = Color(0xFF009B4A)
                )
            }
        }
    }
}

@Composable
private fun AbsensiCount(count: Int) {
    val backgroundColor = when {
        count == 0 -> Color(0xFFE8F5E9)
        count > 2 -> Color(0xFFFFEBEE)
        else -> Color(0xFFF5F5F5)
    }

    Text(
        text = count.toString(),
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .background(backgroundColor)
            .padding(horizontal = 8.dp, vertical = 4.dp),
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        ),
        textAlign = TextAlign.Center
    )
}

data class AbsensiData(
    val nama: String,
    val nim: String,
    val hadir: Int,
    val alpha: Int,
    val sakit: Int,
    val izin: Int
)

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun KelompokPengelolaanAbsenPreview() {
    val navController = rememberNavController()
    KelompokPengelolaanAbsen(navController = navController)
}