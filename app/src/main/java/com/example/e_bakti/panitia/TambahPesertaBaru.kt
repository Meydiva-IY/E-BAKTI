package com.example.e_bakti.panitia

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import android.app.DatePickerDialog
import androidx.compose.foundation.clickable
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import java.util.*

@Composable
fun TambahPesertaBaru(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp
    val context = LocalContext.current
    var selectedDate by remember { mutableStateOf("") }
    var inputText by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column (modifier = Modifier
            .requiredHeight(80.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF009B4A)),
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "KELOMPOK PESERTA",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column(
            modifier = Modifier
                .padding(horizontal = outerPadding)
                .padding(top = 100.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Periode Baru",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Full Name",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Masukkan Nama",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Date of Birth",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth()
                    .clickable {
                        val calendar = Calendar.getInstance()
                        val year = calendar.get(Calendar.YEAR)
                        val month = calendar.get(Calendar.MONTH)
                        val day = calendar.get(Calendar.DAY_OF_MONTH)

                        // Tampilkan DatePickerDialog
                        DatePickerDialog(
                            context,
                            { _, selectedYear, selectedMonth, selectedDay ->
                                val date = "$selectedDay/${selectedMonth + 1}/$selectedYear" // Format tanggal
                                selectedDate = date // Perbarui state tanggal yang dipilih
                            },
                            year,
                            month,
                            day
                        ).show()
                    },
                value = selectedDate, // Tampilkan tanggal yang dipilih
                onValueChange = { },
                label = {
                    Text(
                        text = "Tanggal/Bulan/Tahun",
                        style = TextStyle(
                            fontSize = 14.sp
                        )
                    )
                },
                enabled = false, // Nonaktifkan input manual
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Gender",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Laki/Perempuan",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Address",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Alamat",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Email",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Masukkan Email",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Student ID",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Masukkan NIM",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Departement",
                color = Color(0xFF009B4A),
                style = TextStyle(
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(Alignment.Start)
            )
            OutlinedTextField(
                modifier = Modifier
                    .requiredHeight(40.dp)
                    .fillMaxWidth(),
                value = inputText,
                onValueChange = { inputText = it },
                label = {
                    Text(
                        text = "Masukkan Departemen",
                        style = TextStyle(
                            fontSize = 14.sp)
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp)
            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff009B4A)),
                modifier = Modifier
                    .requiredWidth(130.dp)
                    .requiredHeight(36.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Tambah",
                    color = Color.White

                )

            }
        }


        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,

            ){
            Navigation(navController, modifier = Modifier)

        }

    }
}




@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun TambahPesertaBaruPreview() {
    val navController = rememberNavController()
    TambahPesertaBaru(navController = navController)
}