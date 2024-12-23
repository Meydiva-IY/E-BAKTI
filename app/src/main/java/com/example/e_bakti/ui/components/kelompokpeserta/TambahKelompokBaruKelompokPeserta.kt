package com.example.e_bakti.ui.components.kelompokpeserta

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
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

data class MentorData(
    var nama: String = "",
    var nim: String = ""
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TambahKelompokBaruKelompokPeserta(navController: NavController, modifier: Modifier = Modifier) {
    var nomorKelompok by remember { mutableStateOf("") }
    var showMentor1Fields by remember { mutableStateOf(false) }
    var showMentor2Fields by remember { mutableStateOf(false) }
    var mentor1 by remember { mutableStateOf(MentorData()) }
    var mentor2 by remember { mutableStateOf(MentorData()) }
    var showErrorDialog by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff009B4A))
    ) {
        Column(
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
                    text = "Tambah Kelompok",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Main Content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clip(RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp))
                    .background(color = Color.White)
                    .padding(24.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                // Nomor Kelompok
                Text(
                    text = "Nomor Kelompok",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF009B4A)
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                OutlinedTextField(
                    value = nomorKelompok,
                    onValueChange = { nomorKelompok = it },
                    placeholder = { Text("Masukkan nomor kelompok") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF009B4A),
                        unfocusedBorderColor = Color.LightGray
                    )
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Mentor 1 Section
                if (!showMentor1Fields) {
                    Button(
                        onClick = { showMentor1Fields = true },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF009B4A)
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(Icons.Default.Person, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Tambah Mentor 1")
                    }
                } else {
                    MentorFields(
                        title = "Mentor 1",
                        mentor = mentor1,
                        onNamaChange = { mentor1 = mentor1.copy(nama = it) },
                        onNimChange = { mentor1 = mentor1.copy(nim = it) }
                    )
                }

                if (showMentor1Fields) {
                    Spacer(modifier = Modifier.height(24.dp))

                    // Mentor 2 Section
                    if (!showMentor2Fields) {
                        Button(
                            onClick = { showMentor2Fields = true },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF009B4A)
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Default.Person, contentDescription = null)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Tambah Mentor 2")
                        }
                    } else {
                        MentorFields(
                            title = "Mentor 2",
                            mentor = mentor2,
                            onNamaChange = { mentor2 = mentor2.copy(nama = it) },
                            onNimChange = { mentor2 = mentor2.copy(nim = it) }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                // Submit Button
                Button(
                    onClick = {
                        when {
                            nomorKelompok.isBlank() -> errorMessage = "Nomor kelompok tidak boleh kosong"
                            showMentor1Fields && (mentor1.nama.isBlank() || mentor1.nim.isBlank()) ->
                                errorMessage = "Data Mentor 1 harus lengkap"
                            showMentor2Fields && (mentor2.nama.isBlank() || mentor2.nim.isBlank()) ->
                                errorMessage = "Data Mentor 2 harus lengkap"
                            else -> {
                                // Handle successful submission
                                navController.popBackStack()
                            }
                        }
                        if (errorMessage.isNotEmpty()) {
                            showErrorDialog = true
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF009B4A)
                    ),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "Tambah Kelompok",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            // Navigation
            Navigation(navController = navController, modifier = Modifier)
        }
    }

    if (showErrorDialog) {
        AlertDialog(
            onDismissRequest = {
                showErrorDialog = false
                errorMessage = ""
            },
            title = { Text("Error") },
            text = { Text(errorMessage) },
            confirmButton = {
                TextButton(
                    onClick = {
                        showErrorDialog = false
                        errorMessage = ""
                    }
                ) {
                    Text("OK")
                }
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MentorFields(
    title: String,
    mentor: MentorData,
    onNamaChange: (String) -> Unit,
    onNimChange: (String) -> Unit
) {
    Column {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF009B4A)
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = mentor.nama,
            onValueChange = onNamaChange,
            placeholder = { Text("Nama mentor") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF009B4A),
                unfocusedBorderColor = Color.LightGray
            )
        )
        OutlinedTextField(
            value = mentor.nim,
            onValueChange = onNimChange,
            placeholder = { Text("NIM mentor") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF009B4A),
                unfocusedBorderColor = Color.LightGray
            )
        )
    }
}


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun TambahKelompokBaruKelompokPesertaPreview() {
    val navController = rememberNavController()
    TambahKelompokBaruKelompokPeserta(navController = navController)
}