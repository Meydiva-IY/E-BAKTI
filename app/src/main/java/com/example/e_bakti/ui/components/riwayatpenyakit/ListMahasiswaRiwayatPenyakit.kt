package com.example.e_bakti.ui.components.riwayatpenyakit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R
import com.example.e_bakti.ui.components.Navigation

data class MahasiswaData(
    val nama: String,
    val nim: String,
    val jurusan: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListMahasiswaRiwayatPenyakit(
    navController: NavController,
    modifier: Modifier = Modifier,
    onMahasiswaSelected: (List<MahasiswaData>) -> Unit = {}
) {
    val dummyData = listOf(
        MahasiswaData("Sarah Johnson", "13220045", "Teknik Informatika"),
        MahasiswaData("Michael Chen", "13220032", "Teknik Elektro"),
        MahasiswaData("Alex Martinez", "13220078", "Teknik Sipil"),
        MahasiswaData("Emily Davis", "13220091", "Teknik Mesin")
    )

    var selectedMahasiswa = remember { mutableStateListOf<MahasiswaData>() }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff009B4A))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
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
                    text = "Pilih Mahasiswa",
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
                    .weight(1f)
                    .clip(RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp))
                    .background(color = Color.White)
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

                    // Info Banner
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xffFDFAE4))
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.infologo),
                            contentDescription = "Info Icon",
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Pilih Mahasiswa",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }

                    // Table Header
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFE8F5E9))
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Pilih",
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            modifier = Modifier.weight(0.8f)
                        )
                        Text(
                            text = "Nama/NIM",
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            modifier = Modifier.weight(2f)
                        )
                        Text(
                            text = "Jurusan",
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            modifier = Modifier.weight(1.5f)
                        )
                    }

                    // List Content
                    LazyColumn {
                        items(dummyData) { mahasiswa ->
                            MahasiswaItem(
                                mahasiswa = mahasiswa,
                                isSelected = selectedMahasiswa.contains(mahasiswa),
                                onCheckedChange = { checked ->
                                    if (checked) {
                                        selectedMahasiswa.add(mahasiswa)
                                    } else {
                                        selectedMahasiswa.remove(mahasiswa)
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }

        // Bottom Button and Navigation
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 80.dp)
        ) {
            Button(
                onClick = {
                    onMahasiswaSelected(selectedMahasiswa.toList())
                    navController.navigate("KelompokRiwayatPenyakit")
                },
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .height(48.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF009B4A)),
                shape = RoundedCornerShape(8.dp),
                enabled = selectedMahasiswa.isNotEmpty()
            ) {
                Text(
                    text = "Tambah Mahasiswa (${selectedMahasiswa.size})",
                    fontSize = 16.sp
                )
            }
        }

        Box(
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Navigation(navController = navController)
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
private fun MahasiswaItem(
    mahasiswa: MahasiswaData,
    isSelected: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isSelected,
            onCheckedChange = onCheckedChange,
            modifier = Modifier.weight(0.8f)
        )
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Text(
                text = mahasiswa.nama,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Text(
                text = mahasiswa.nim,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            )
        }
        Text(
            text = mahasiswa.jurusan,
            style = TextStyle(fontSize = 14.sp),
            modifier = Modifier.weight(1.5f)
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ListMahasiswaRiwayatPenyakitPreview() {
    val navController = rememberNavController()
    ListMahasiswaRiwayatPenyakit(navController = navController)
}