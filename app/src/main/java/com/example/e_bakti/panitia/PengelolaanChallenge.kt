package com.example.e_bakti.panitia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_bakti.R

@Composable
fun PengelolaanChallenge(navController: NavController, modifier: Modifier = Modifier) {
    val outerPadding = 32.dp

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
                text = "PENGELOLAAN CHALLENGE",
                color = Color.White,
                style = TextStyle(
                    fontSize = 22.sp),
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
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(56.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "+     ",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 30.sp),
                        modifier = Modifier
                    )
                    Text(
                        text = "CHALLENGE BARU",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 20.sp)
                    )
                }
            }
        }
        Box(modifier = Modifier
            .requiredWidth(360.dp)
            .requiredHeight(600.dp)
            .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(color = Color(0xfffdfae4))
            .align(Alignment.BottomCenter)
        ){
            Column(modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 30.dp)
            ) {
                Text(
                    text = "Challange 1",
                    style = TextStyle(
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Row (

                ){
                    Image(
                        painter = painterResource(id = R.drawable.fluentcolorbuildingpeople16),
                        contentDescription = "Data Peserta Bakti ",
                        modifier = Modifier
                            .requiredWidth(80.dp)
                            .requiredHeight(80.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(

                    ) {
                        Text(
                            text = "Judul Challange\n1",
                            style = TextStyle(
                                    fontSize = 20.sp
                                    ),
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Deskripsi Tugas...",
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Column (modifier = Modifier.requiredHeight(80.dp)){
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(35.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(35.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {

                        }

                    }


                }
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = "Challange 1",
                    style = TextStyle(
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row (

                ){
                    Image(
                        painter = painterResource(id = R.drawable.fluentcolorbuildingpeople16),
                        contentDescription = "Data Peserta Bakti ",
                        modifier = Modifier
                            .requiredWidth(80.dp)
                            .requiredHeight(80.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(

                    ) {
                        Text(
                            text = "Judul Challange\n1",
                            style = TextStyle(
                                fontSize = 20.sp
                            ),
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Deskripsi Tugas...",
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Column (modifier = Modifier.requiredHeight(80.dp)){
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(35.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(35.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {

                        }

                    }


                }
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = "Challange 1",
                    style = TextStyle(
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row (

                ){
                    Image(
                        painter = painterResource(id = R.drawable.fluentcolorbuildingpeople16),
                        contentDescription = "Data Peserta Bakti ",
                        modifier = Modifier
                            .requiredWidth(80.dp)
                            .requiredHeight(80.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(

                    ) {
                        Text(
                            text = "Judul Challange\n1",
                            style = TextStyle(
                                fontSize = 20.sp
                            ),
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Deskripsi Tugas...",
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Column (modifier = Modifier.requiredHeight(80.dp)){
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(35.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(35.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {

                        }

                    }


                }


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
private fun PengelolaanChallengePreview() {
    val navController = rememberNavController()
    PengelolaanChallenge(navController = navController)
}