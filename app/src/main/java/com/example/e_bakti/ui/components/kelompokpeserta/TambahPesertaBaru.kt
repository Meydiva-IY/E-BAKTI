package com.example.e_bakti.ui.components.kelompokpeserta

import android.app.DatePickerDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.ui.components.Navigation
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TambahPesertaBaru(navController: NavController, modifier: Modifier = Modifier) {
    // State for form fields
    var nama by remember { mutableStateOf("") }
    var selectedDate by remember { mutableStateOf("") }
    var selectedGender by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var departemen by remember { mutableStateOf("") }

    // State for dropdown
    var expandedGender by remember { mutableStateOf(false) }
    val genderOptions = listOf("Laki - Laki", "Perempuan")

    // Context for DatePicker
    val context = LocalContext.current

    // State for validation
    var showErrorDialog by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }

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
                    text = "Tambah Peserta",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
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
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Form Fields
                    FormTextField(
                        label = "Nama Lengkap",
                        value = nama,
                        onValueChange = { nama = it },
                        placeholder = "Masukkan nama lengkap"
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Date of Birth
                    Text(
                        text = "Tanggal Lahir",
                        color = Color(0xFF009B4A),
                        style = TextStyle(fontSize = 15.sp),
                        modifier = Modifier.align(Alignment.Start)
                    )
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                val calendar = Calendar.getInstance()
                                DatePickerDialog(
                                    context,
                                    { _, year, month, dayOfMonth ->
                                        selectedDate = String.format("%02d/%02d/%d", dayOfMonth, month + 1, year)
                                    },
                                    calendar.get(Calendar.YEAR),
                                    calendar.get(Calendar.MONTH),
                                    calendar.get(Calendar.DAY_OF_MONTH)
                                ).show()
                            },
                        value = selectedDate,
                        onValueChange = { },
                        readOnly = true,
                        placeholder = {
                            Text("Pilih tanggal lahir", fontSize = 14.sp)
                        },
                        trailingIcon = {
                            Icon(
                                Icons.Default.CalendarToday,
                                contentDescription = "Select Date",
                                tint = Color(0xFF009B4A)
                            )
                        },
                        shape = RoundedCornerShape(16.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Gender Dropdown
                    Text(
                        text = "Gender",
                        color = Color(0xFF009B4A),
                        style = TextStyle(fontSize = 15.sp),
                        modifier = Modifier.align(Alignment.Start)
                    )
                    ExposedDropdownMenuBox(
                        expanded = expandedGender,
                        onExpandedChange = { expandedGender = !expandedGender },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = selectedGender,
                            onValueChange = {},
                            readOnly = true,
                            placeholder = {
                                Text("Pilih gender", fontSize = 14.sp)
                            },
                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedGender)
                            },
                            shape = RoundedCornerShape(16.dp),
                            modifier = Modifier
                                .menuAnchor()
                                .fillMaxWidth()
                        )
                        ExposedDropdownMenu(
                            expanded = expandedGender,
                            onDismissRequest = { expandedGender = false }
                        ) {
                            genderOptions.forEach { option ->
                                DropdownMenuItem(
                                    text = { Text(option) },
                                    onClick = {
                                        selectedGender = option
                                        expandedGender = false
                                    }
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    FormTextField(
                        label = "Alamat",
                        value = alamat,
                        onValueChange = { alamat = it },
                        placeholder = "Masukkan alamat"
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    FormTextField(
                        label = "Email",
                        value = email,
                        onValueChange = { email = it },
                        placeholder = "Masukkan email"
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    FormTextField(
                        label = "NIM",
                        value = nim,
                        onValueChange = { nim = it },
                        placeholder = "Masukkan NIM"
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    FormTextField(
                        label = "Departemen",
                        value = departemen,
                        onValueChange = { departemen = it },
                        placeholder = "Masukkan departemen"
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    // Submit Button
                    Button(
                        onClick = {
                            when {
                                nama.isBlank() -> errorMessage = "Nama tidak boleh kosong"
                                selectedDate.isBlank() -> errorMessage = "Tanggal lahir harus dipilih"
                                selectedGender.isBlank() -> errorMessage = "Gender harus dipilih"
                                alamat.isBlank() -> errorMessage = "Alamat tidak boleh kosong"
                                email.isBlank() -> errorMessage = "Email tidak boleh kosong"
                                nim.isBlank() -> errorMessage = "NIM tidak boleh kosong"
                                departemen.isBlank() -> errorMessage = "Departemen tidak boleh kosong"
                                else -> {
                                    // TODO: Handle successful submission
                                    navController.popBackStack()
                                }
                            }
                            if (errorMessage.isNotEmpty()) {
                                showErrorDialog = true
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF009B4A)
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = "Tambah Peserta",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
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
private fun FormTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String
) {
    Column {
        Text(
            text = label,
            color = Color(0xFF009B4A),
            style = TextStyle(fontSize = 15.sp),
            modifier = Modifier.padding(bottom = 4.dp)
        )
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = {
                Text(placeholder, fontSize = 14.sp)
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            singleLine = true
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun TambahPesertaBaruPreview() {
    val navController = rememberNavController()
    TambahPesertaBaru(navController = navController)
}