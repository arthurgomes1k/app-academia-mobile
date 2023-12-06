package com.unifip.appacademia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.unifip.appacademia.ui.theme.AppAcademiaTheme
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
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
            )
            Text(
                text = "cadastro de alunos",
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        Card(
            modifier = Modifier
                .align(Alignment.Center)
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
                    text = "Alunos",
                    style = style,
                    topLeft = Offset(
                        x = center.x - 350,
                        y = center.y - 160
                    )
                )
            }
        }
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