//package com.example.e_bakti.ui.components.riwayatpenyakit
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.requiredHeight
//import androidx.compose.foundation.layout.width
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.example.e_bakti.ui.components.Navigation
//import kotlinx.coroutines.launch
//
//@Composable
//fun TambahRiwayatPenyakitPeserta(navController: NavController,
//                                 viewModel: RiwayatPenyakitViewModel = viewModel(),
//                                 kelompokId: String,
//                                 periode: String,
//                                 modifier: Modifier = Modifier
//) {
//    val uiState by viewModel.uiState.collectAsState()
//    val scope = rememberCoroutineScope()
//
//    val outerPadding = 32.dp
//    var inputText by remember { mutableStateOf("") }
//
//    LaunchedEffect(uiState.berhasil) {
//        if (uiState.berhasil) {
//            navController.navigateUp()
//        }
//    }
//
//    Box(
//        modifier = modifier
//            .fillMaxSize()
//            .background(color = Color.White)
//    ) {
//        Column(
//            modifier = Modifier
//                .requiredHeight(80.dp)
//                .fillMaxWidth()
//                .background(color = Color(0xFF009B4A)),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(
//                text = kelompokId,
//                color = Color.White,
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = "Periode $periode",
//                color = Color.White,
//                fontSize = 16.sp
//            )
//        }
//
//        Column(
//            modifier = Modifier
//                .padding(horizontal = 32.dp)
//                .padding(top = 100.dp)
//                .fillMaxSize(),
//            verticalArrangement = Arrangement.Top,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(
//                text = "Riwayat Penyakit Peserta",
//                style = MaterialTheme.typography.titleLarge,
//                modifier = Modifier.align(Alignment.CenterHorizontally)
//            )
//
//            Spacer(modifier = Modifier.height(25.dp))
//
//            OutlinedTextField(
//                value = uiState.namaPenyakit,
//                onValueChange = { viewModel.updateNamaPenyakit(it) },
//                label = { Text("Nama Penyakit") },
//                modifier = Modifier.fillMaxWidth(),
//                isError = uiState.error != null && uiState.namaPenyakit.isBlank()
//            )
//
//            Spacer(modifier = Modifier.height(20.dp))
//
//            OutlinedTextField(
//                value = uiState.deskripsi,
//                onValueChange = { viewModel.updateDeskripsi(it) },
//                label = { Text("Deskripsi") },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(150.dp),
//                isError = uiState.error != null && uiState.deskripsi.isBlank()
//            )
//
//            if (uiState.error != null) {
//                Text(
//                    text = uiState.error!!,
//                    color = MaterialTheme.colorScheme.error,
//                    modifier = Modifier.padding(top = 8.dp)
//                )
//            }
//
//            Spacer(modifier = Modifier.weight(1f))
//
//            Button(
//                onClick = {
//                    scope.launch {
//                        viewModel.tambahRiwayatPenyakit(kelompokId, periode)
//                    }
//                },
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF009B4A)),
//                modifier = Modifier
//                    .width(130.dp)
//                    .height(36.dp)
//            ) {
//                Text("Tambah")
//            }
//
//            Spacer(modifier = Modifier.height(50.dp))
//            Navigation(navController, modifier = Modifier)
//        }
//    }
//}
//
//@Preview
//@Composable
//private fun TambahRiwayatPenyakitPesertaPreview(){
//    val navController = rememberNavController()
//    TambahRiwayatPenyakitPeserta(navController = navController)
//}