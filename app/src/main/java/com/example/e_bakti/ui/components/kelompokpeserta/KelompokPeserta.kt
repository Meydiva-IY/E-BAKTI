package com.example.e_bakti.ui.components.kelompokpeserta

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KelompokPeserta(navController: NavController, modifier: Modifier = Modifier) {
    var selectedPeriode by remember { mutableStateOf("") }
    var selectedKelompok by remember { mutableStateOf("") }
    var expandedPeriode by remember { mutableStateOf(false) }
    var expandedKelompok by remember { mutableStateOf(false) }
    var showPeriodeOptions by remember { mutableStateOf(false) }
    var showKelompokOptions by remember { mutableStateOf(false) }

    val periodeList = remember {
        mutableStateListOf("2024", "2023", "2022")
    }
    val kelompokList = remember {
        mutableStateListOf("Kelompok A", "Kelompok B", "Kelompok C")
    }

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
                    text = "Kelompok 1",
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
            ) {
                // Periode Selection
                Text(
                    text = "Pilih Periode",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF009B4A)
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                SelectionBox(
                    isExpanded = expandedPeriode,
                    onExpandedChange = {
                        expandedPeriode = it
                        showPeriodeOptions = !showPeriodeOptions
                        expandedKelompok = false
                        showKelompokOptions = false
                    },
                    selectedValue = selectedPeriode,
                    placeholder = "Pilih Periode",
                    options = periodeList,
                    showOptions = showPeriodeOptions,
                    onOptionSelected = {
                        selectedPeriode = it
                        showPeriodeOptions = false
                    },
                    onAddNew = {
                        navController.navigate("tambah_periode")
                    }
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Kelompok Selection
                Text(
                    text = "Pilih Kelompok",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF009B4A)
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                SelectionBox(
                    isExpanded = expandedKelompok,
                    onExpandedChange = {
                        expandedKelompok = it
                        showKelompokOptions = !showKelompokOptions
                        expandedPeriode = false
                        showPeriodeOptions = false
                    },
                    selectedValue = selectedKelompok,
                    placeholder = "Pilih Kelompok",
                    options = kelompokList,
                    showOptions = showKelompokOptions,
                    onOptionSelected = {
                        selectedKelompok = it
                        showKelompokOptions = false
                    },
                    onAddNew = {
                        navController.navigate("tambah_kelompok")
                    }
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Results Section
                if (selectedPeriode.isNotEmpty() && selectedKelompok.isNotEmpty()) {
                    KelompokCard(
                        kelompok = selectedKelompok,
                        periode = selectedPeriode,
                        onClick = {
                            navController.navigate("detail_kelompok_peserta")
                        }
                    )
                }
            }

            // Navigation at bottom
            Navigation(navController = navController, modifier = Modifier)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SelectionBox(
    isExpanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    selectedValue: String,
    placeholder: String,
    options: List<String>,
    showOptions: Boolean,
    onOptionSelected: (String) -> Unit,
    onAddNew: () -> Unit
) {
    Column {
        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = onExpandedChange
        ) {
                OutlinedTextField(
                value = selectedValue,
                onValueChange = {},
                readOnly = true,
                placeholder = {
                    Text(placeholder, fontSize = 14.sp)
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF009B4A),
                    unfocusedBorderColor = Color.LightGray
                ),
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            )

            ExposedDropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { onExpandedChange(false) }
            ) {
                DropdownMenuItem(
                    text = { Text("Tampilkan Daftar") },
                    onClick = { onExpandedChange(false) }
                )
            }
        }

        if (showOptions) {
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFDFAE4)
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    options.forEach { option ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onOptionSelected(option) }
                                .padding(vertical = 8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = option,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium
                            )
                            Icon(
                                imageVector = Icons.Default.ChevronRight,
                                contentDescription = null,
                                tint = Color(0xFF009B4A)
                            )
                        }
                    }

                    TextButton(
                        onClick = onAddNew,
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            tint = Color(0xFF009B4A)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Tambah Baru",
                            color = Color(0xFF009B4A)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun KelompokCard(
    kelompok: String,
    periode: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFDFAE4)
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = kelompok,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF009B4A)
            )
            Text(
                text = "Periode $periode",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Lihat Detail",
                    fontSize = 14.sp,
                    color = Color(0xFF009B4A)
                )
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = null,
                    tint = Color(0xFF009B4A)
                )
            }
        }
    }
}
@Composable
@Preview
private fun KelompokPesertaPreview() {
    val navController = rememberNavController()
    KelompokPeserta(navController = navController)
}