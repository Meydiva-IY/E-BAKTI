package com.example.e_bakti.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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

//import com.example.e_bakti.data.model.FinalEvaluation
//import com.example.e_bakti.viewModel.EvaluasiViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EvaluasiAkhir(
    navController: NavController,
 //   viewModel: EvaluasiViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    modifier: Modifier = Modifier
) {
    var isLoading by remember { mutableStateOf(false) }
//    val evaluationData = viewModel.evaluationData.collectAsState()

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF009B4A))
    ) {
        // Header
        TopAppBar(
            title = {
                Text(
                    "EVALUASI AKHIR",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent
            )
        )

        // Main Content
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp)
                .clip(RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Student Info Section
                StudentInfoSection(/*evaluationData.value*/)

                Spacer(modifier = Modifier.height(24.dp))

                // Scores Section
                ScoresSection(/*evaluationData.value*/)

                Spacer(modifier = Modifier.height(24.dp))

                // Download Certificate Button
                Button(
                    onClick = {
 //                       viewModel.downloadCertificate()
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF009B4A)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    if (isLoading) {
                        CircularProgressIndicator(color = Color.White)
                    } else {
                        Text("Download Sertifikat", color = Color.White)
                    }
                }
            }
        }

        // Bottom Navigation
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        ) {
            Navigation(navController)
        }
    }
}

@Composable
private fun StudentInfoSection(/*data: FinalEvaluation?*/) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
//            InfoRow("Nama", data?.name ?: "-")
//            InfoRow("NIM", data?.studentId ?: "-")
//            InfoRow("Jurusan", data?.department ?: "-")
//            InfoRow("Periode", data?.period ?: "-")
//            InfoRow("Kelompok", data?.groupName ?: "-")
        }
    }
}

@Composable
private fun ScoresSection(/*data: FinalEvaluation?*/) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                "Nilai Akhir",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
//            ScoreRow("Kehadiran", data?.attendanceScore ?: 0f)
//            ScoreRow("Challenge", data?.challengeScore ?: 0f)
//            ScoreRow("Tugas", data?.taskScore ?: 0f)
//            Divider(modifier = Modifier.padding(vertical = 8.dp))
//            ScoreRow("Total", data?.totalScore ?: 0f, true)
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label, fontWeight = FontWeight.Medium)
        Text(value)
    }
}

@Composable
private fun ScoreRow(label: String, score: Float, isTotal: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            label,
            fontWeight = if (isTotal) FontWeight.Bold else FontWeight.Normal
        )
        Text(
            String.format("%.1f", score),
            fontWeight = if (isTotal) FontWeight.Bold else FontWeight.Normal
        )
    }
}
@Preview
@Composable
private fun EvaluasiAkhirPreview(){
    val navController = rememberNavController()
    EvaluasiAkhir (navController = navController)
}