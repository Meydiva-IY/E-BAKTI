package com.example.e_bakti.ui.components.challenge

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
fun DetailChallenge(navController: NavController, modifier: Modifier = Modifier) {
    var selectedStatus by remember { mutableStateOf("All") }
    val statusOptions = listOf("All", "Submitted", "Not Submitted", "Graded")

    // Sample data for the table
    val pesertaList = listOf(
        PesertaData("John Doe", "13220001", "Kelompok A", "Submitted"),
        PesertaData("Jane Smith", "13220002", "Kelompok B", "Graded"),
        PesertaData("Bob Johnson", "13220003", "Kelompok A", "Not Submitted"),
        // Add more sample data as needed
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
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Detail Challenge",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
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
                        .padding(24.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    // Challenge Header with Actions
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Challenge 1",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            IconButton(onClick = { /* Handle edit */ }) {
                                Icon(
                                    imageVector = Icons.Default.Edit,
                                    contentDescription = "Edit",
                                    tint = Color(0xff009B4A)
                                )
                            }
                            IconButton(onClick = { /* Handle delete */ }) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Delete",
                                    tint = Color.Red
                                )
                            }
                        }
                    }

                    // Deadline
                    Text(
                        text = "Deadline: 6 Juni 2025 pukul 11.59",
                        style = TextStyle(fontSize = 14.sp, color = Color.Gray)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Challenge Description
                    Text(
                        text = "Deskripsi Challenge",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                        style = TextStyle(fontSize = 14.sp),
                        modifier = Modifier.padding(vertical = 8.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    HorizontalDivider(color = Color.LightGray)
                    Spacer(modifier = Modifier.height(16.dp))

                    // Status Filter
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Daftar Peserta",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.FilterList,
                                contentDescription = "Filter",
                                tint = Color(0xff009B4A),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            ExposedDropdownMenuBox(
                                expanded = false,
                                onExpandedChange = { },
                            ) {
                                OutlinedTextField(
                                    value = selectedStatus,
                                    onValueChange = {},
                                    readOnly = true,
                                    textStyle = TextStyle(fontSize = 14.sp),
                                    modifier = Modifier
                                        .menuAnchor()
                                        .width(130.dp),
                                    trailingIcon = {
                                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = false)
                                    },
                                    colors = OutlinedTextFieldDefaults.colors(
                                        unfocusedBorderColor = Color(0xff009B4A),
                                        focusedBorderColor = Color(0xff009B4A)
                                    )
                                )
                                ExposedDropdownMenu(
                                    expanded = false,
                                    onDismissRequest = { }
                                ) {
                                    statusOptions.forEach { option ->
                                        DropdownMenuItem(
                                            text = { Text(option) },
                                            onClick = { selectedStatus = option }
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

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
                            modifier = Modifier.weight(1f),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "Kelompok",
                            modifier = Modifier.width(100.dp),
                            style = TextStyle(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            text = "Status",
                            modifier = Modifier.width(100.dp),
                            style = TextStyle(fontWeight = FontWeight.Medium),
                            textAlign = TextAlign.Center
                        )
                    }

                    // Table Content
                    LazyColumn {
                        itemsIndexed(pesertaList) { index, peserta ->
                            TableRow(
                                index = index + 1,
                                peserta = peserta,
                                onRowClick = {
                                    // Navigate to DetailChallengePeserta
                                    navController.navigate("detail_challenge_peserta")
                                }
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
private fun TableRow(
    index: Int,
    peserta: PesertaData,
    onRowClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onRowClick)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = index.toString(),
            modifier = Modifier.width(32.dp),
            style = TextStyle(fontSize = 14.sp)
        )
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = peserta.nama,
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium)
            )
            Text(
                text = peserta.nim,
                style = TextStyle(fontSize = 12.sp, color = Color.Gray)
            )
        }
        Text(
            text = peserta.kelompok,
            modifier = Modifier.width(100.dp),
            style = TextStyle(fontSize = 14.sp)
        )
        Box(
            modifier = Modifier.width(100.dp),
            contentAlignment = Alignment.Center
        ) {
            StatusChip(status = peserta.status)
        }
    }
}

@Composable
private fun StatusChip(status: String, modifier: Modifier = Modifier) {
    val (backgroundColor, textColor) = when (status) {
        "Submitted" -> Color(0xFFE3F2FD) to Color(0xFF1976D2)
        "Graded" -> Color(0xFFE8F5E9) to Color(0xFF2E7D32)
        else -> Color(0xFFFFEBEE) to Color(0xFFD32F2F)
    }

    Text(
        text = when (status) {
            "Submitted" -> "Submitted"
            "Graded" -> "Graded"
            else -> "Not\nSubmitted"
        },
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(backgroundColor)
            .padding(horizontal = 8.dp, vertical = 4.dp),
        color = textColor,
        style = TextStyle(fontSize = 12.sp),
        textAlign = TextAlign.Center
    )
}

data class PesertaData(
    val nama: String,
    val nim: String,
    val kelompok: String,
    val status: String
)

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun DetailChallengePreview() {
    val navController = rememberNavController()
    DetailChallenge(navController = navController)
}