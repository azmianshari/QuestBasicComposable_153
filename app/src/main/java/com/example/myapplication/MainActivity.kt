package com.example.myapplication

import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicColumn(modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 0.dp)
    ) {
        Text(
            "Login",
            fontSize = 100.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Ini adalah halaman login")

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "",
            fontSize = 50.sp,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.padding(20.dp))


        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Text("Nama",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal)
        Spacer(modifier = Modifier.padding(0.dp))
        Text("Muhammad Azmi Anshari",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red)

        Spacer(modifier = Modifier.padding(0.dp))

        Text("20220140153",
            fontSize = 30.sp,)

        Spacer(modifier = Modifier.padding(0.dp))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
