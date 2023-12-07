package com.unifip.appacademia.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unifip.appacademia.R


@Composable
fun TelaLoginAdm() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        AppTela()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTela() {
    Image(painter = painterResource(id = R.drawable.login_back),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
    )
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(painter = painterResource(R.drawable.ic_user),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .offset(0.dp, 0.dp)
        )

        Text(
            text = "Login",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                color = Color.Yellow
            ), modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                .offset(y = 50.dp)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth() // Defina a largura desejada
                .height(480.dp) // Defina a altura desejada
                .padding(16.dp)
                .offset(y = 80.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(color = Color(0x804B4747))
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Transparent)
            ) {
                OutlinedTextField (
                    value = "",
                    label = { Text("Email",
                        style = TextStyle(
                            fontSize = 20.sp,
                            color = Color.White)) },
                    onValueChange = {},
                    modifier = Modifier
                        .padding(16.dp)
                        .padding(top = 50.dp)
                        .fillMaxWidth()
                        .border(3.dp, color = Color(0xB2E4E0E0), shape = RoundedCornerShape(8.dp))
                        .background(Color.Transparent),
                )
                OutlinedTextField(
                    value = "",
                    label = { Text("Senha",
                        style = TextStyle(
                            fontSize = 20.sp,
                            color = Color.White)) },
                    onValueChange = {},
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .border(3.dp, color = Color(0xB2E4E0E0), shape = RoundedCornerShape(8.dp))
                )

                Text(
                    text = "Esqueceu a senha?",
                    style = TextStyle(Color.White),
                    modifier = Modifier
                        .offset(x = (180).dp)
                )

                Button(
                    onClick = {  }, modifier = Modifier
                        .offset(x = (70).dp, y = (80).dp)
                        .size(width = 200.dp, height = 50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black)
                ) {
                    Text("Login",
                        style = TextStyle(fontSize = 18.sp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun AppTelaPreview() {
    AppTela()
}