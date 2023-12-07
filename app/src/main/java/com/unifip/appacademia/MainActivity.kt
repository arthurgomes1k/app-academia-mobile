package com.unifip.appacademia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.unifip.appacademia.ui.theme.AppAcademiaTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppAcademiaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun Retangulo(modifier: Modifier, texto : String) {
    Card(
        modifier = modifier
            .offset(0.dp, -220.dp)
            .size(350.dp, 185.dp),
        border = BorderStroke(2.dp,Color.Yellow)
    ) {

        val textMeasurer = rememberTextMeasurer()
        val textPlaceholderMeasurement = remember { textMeasurer.measure(text = "\n" ) }
        val style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )

        Canvas(
            modifier = Modifier
                .size(350.dp, 185.dp)
                .background(Color.White)
        ) {

            drawRoundRect(
                Color.White,
                cornerRadius = CornerRadius(20f, 20f),
                topLeft = Offset(10f, 10f),
                size = size
            )

            drawText(
                textMeasurer = textMeasurer,
                text = texto,
                style = style,
                topLeft = Offset(
                    x = center.x - 380,
                    y = center.y - 160
                )
            )
        }
    }

}

@Composable
fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDEDEDE))
    ) {

        Column() {
            Text(
                text = "Alunos",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                ), modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                    .offset(y = 40.dp)
            )
            Text(
                text = "cadastro de alunos",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .offset(y = 40.dp)
            )
        }

        Retangulo(Modifier.align(Alignment.Center), "Alunos")

        Image(
            painter = painterResource(id = R.drawable.alunos),
            contentDescription = null,
            modifier = Modifier
                .size(180.dp)
                .offset(180.dp, 115.dp)
        )

        Button(
            onClick = {  }, modifier = Modifier
                .align(Alignment.Center)
                .offset(x = (-90).dp, y = (-160).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = Color.Black)
        ) {
            Text("Abrir",
                style = TextStyle(fontSize = 18.sp)
            )
        }

        Column() {
            Text(
                text = "Financeiro",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                ), modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                    .offset(y = 340.dp)
            )
            Text(
                text = "Matrículas e inscrições",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .offset(y = 340.dp)
            )
        }

        Retangulo(Modifier.align(BiasAlignment(0f, 0.9f)), "Financeiro")

        Image(
            painter = painterResource(id = R.drawable.financeiro),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .offset(200.dp, 440.dp)
        )

        Button(
            onClick = {  }, modifier = Modifier
                .align(Alignment.Center)
                .offset(x = (-90).dp, y = (130).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = Color.Black)
        ) {
            Text("Abrir",
                style = TextStyle(fontSize = 18.sp)
            )
        }

        Column() {
            Text(
                text = "Funcionários",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                ), modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                    .offset(y = 640.dp)
            )
            Text(
                text = "Cadastro de personais",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .offset(y = 640.dp)
            )
        }

        Retangulo(Modifier.align(BiasAlignment(0f, 1.8f)), "Funcionários")

        Image(
            painter = painterResource(id = R.drawable.funcion),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .offset(200.dp, 730.dp)
        )

        Button(
            onClick = {  }, modifier = Modifier
                .align(Alignment.Center)
                .offset(x = (-90).dp, y = (420).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = Color.Black)
        ) {
            Text("Abrir",
                style = TextStyle(fontSize = 18.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppAcademiaTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            App()
        }
    }
}