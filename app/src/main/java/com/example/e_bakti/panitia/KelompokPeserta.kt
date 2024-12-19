package com.example.e_bakti.panitia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KelompokPeserta(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp
    var selectedPeriode by remember { mutableStateOf("") } // State untuk pilihan periode
    var selectedKelompok by remember { mutableStateOf("") } // State untuk pilihan kelompok
    val searchResults = listOf(
        "Kelompok 1" to listOf("Mentor 1", "Mentor 2"),
        "Kelompok 2" to listOf("Mentor 1", "Mentor 2"),
        "Kelompok 3" to listOf("Mentor 1", "Mentor 2"),
        "Kelompok 4" to listOf("Mentor 1", "Mentor 2")
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        // Header
        Column(
            modifier = Modifier
                .requiredHeight(80.dp)
                .fillMaxWidth()
                .background(color = Color(0xFF009B4A)),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "KELOMPOK PESERTA",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }

        // Content Section
        Column(
            modifier = Modifier
                .padding(horizontal = outerPadding)
                .padding(top = 100.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            // Combo Box: Cari Periode
            ComboBoxExample(
                label = "Cari Periode",
                options = listOf("2021", "2022", "2023"),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Combo Box: Pilih Kelompok
            ComboBoxExample(
                label = "Pilih Kelompok",
                options = listOf("Kelompok A", "Kelompok B", "Kelompok C"),
                modifier = Modifier.fillMaxWidth(),
//                 onSelectionChange = { selectedKelompok = it } // Perbarui pilihan kelompok
            )
            Spacer(modifier = Modifier.height(20.dp))
            // Search Results
            if (selectedPeriode.isNotEmpty() && selectedKelompok.isNotEmpty()) {
                Text(
                    text = "Search Results",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(vertical = 8.dp)
                )

                Column(modifier = Modifier.fillMaxWidth()) {
                    searchResults.forEach { (group, mentors) ->
                        Card(
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                                .background(Color(0xFFFFFDD0)),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(
                                    text = group,
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF009B4A)
                                    )
                                )
                                mentors.forEach { mentor ->
                                    Text(
                                        text = mentor,
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Black
                                        )
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                TextButton(onClick = {
                                    navController.navigate("detailKelompokPeserta") // Navigasi ke DetailKelompokPeserta
                                }) {
                                    Text(
                                        text = "See more",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Blue
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        // Footer with Button
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Navigation(navController, modifier = Modifier)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComboBoxExample(label: String, options: List<String>, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    var showCard by remember { mutableStateOf(false) } // Untuk menampilkan Card
    var selectedOption by remember { mutableStateOf(label) } // Default text
    val optionList = remember { mutableStateListOf(*options.toTypedArray()) } // Daftar opsi yang dapat dimodifikasi

    Column(modifier = modifier) {
        // Combo Box
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
                showCard = false // Sembunyikan card saat combo box dibuka
            }
        ) {
            OutlinedTextField(
                value = selectedOption,
                onValueChange = { },
                readOnly = true,
                label = { Text(label) },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                modifier = modifier
                    .menuAnchor()
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(0xFFFFFDD0),
                    unfocusedBorderColor = Color.Gray,
                    focusedBorderColor = Color.Black
                )
            )

        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text("Tampilkan Daftar") },
                onClick = {
                    expanded = false
                    showCard = true // Tampilkan card saat opsi dipilih
                    }
                )
            }
        }
        // Card untuk menampilkan daftar opsi
        if (showCard) {
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.cardElevation(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    optionList.forEachIndexed { index, option ->
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                        ) {
                            Text(
                                text = option,
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            TextButton(
                                onClick = {
                                    optionList.removeAt(index) // Hapus opsi dari daftar
                                }
                            ) {
                                Text(
                                    text = "Hapus",
                                    color = Color.Red,
                                    style = TextStyle(fontSize = 14.sp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    TextButton(
                        onClick = {
                            // Tambahkan opsi baru (contoh hardcoded)
                            optionList.add("Opsi Baru")
                        }
                    ) {
                        Text(
                            text = "+ Add new",
                            color = Color.Gray,
                            style = TextStyle(fontSize = 14.sp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun KelompokPesertaPreview() {
    val navController = rememberNavController()
    KelompokPeserta(navController = navController)
}
