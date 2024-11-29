package com.example.e_bakti

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(name: String, email: String, profileImageResId: Int) {
    var inputText by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(painterResource(id = R.drawable.footerlog),
            contentDescription = null,
            modifier = Modifier
                .rotate(180f)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop)

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo2),
                contentDescription = "logo",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.CenterHorizontally)
                    .offset(x = (0).dp, y = (-1).dp),
            )
            Spacer(modifier = Modifier.height(5.dp))
            // Gambar Profil
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(70.dp)
                    .align(Alignment.CenterHorizontally)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nama Pengguna
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF009B4A),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )

            // Email Pengguna
            Text(
                text = email,
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(70.dp))

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredWidth(334.dp)
                    .requiredHeight(46.dp),
                shape = RoundedCornerShape(0.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "Account Type",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "Panitia Bakti",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                }
            }
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredWidth(334.dp)
                    .requiredHeight(46.dp),
                shape = RoundedCornerShape(0.dp)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "Account Name",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "Meydiva Intayeza",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                }
            }
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredWidth(334.dp)
                    .requiredHeight(46.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "Kelompok",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "1",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                }
            }
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffdfae4)),
                modifier = Modifier
                    .requiredWidth(334.dp)
                    .requiredHeight(46.dp),
                shape = RoundedCornerShape(0.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "Mobile Number",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "+62895602743359",
                        color = Color(0xff337557),
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                    )
                }
            }

        }

    }

}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(
        name = "John Doe",
        email = "john.doe@example.com",
        profileImageResId = R.drawable.logo // Ganti dengan id gambar profil yang sesuai
    )
}