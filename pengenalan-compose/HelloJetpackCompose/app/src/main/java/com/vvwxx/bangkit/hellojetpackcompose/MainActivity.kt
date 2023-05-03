package com.vvwxx.bangkit.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vvwxx.bangkit.hellojetpackcompose.ui.theme.HelloJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Nessa")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(
        // untuk mengatur jarak komponen pada row
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.jetpack_compose),
            contentDescription = "Logo Jetpack Compose",
            modifier = Modifier.size(80.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column{
            Text(
                text = "Hello $name!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(text = "Welcome to Dicoding!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloJetpackComposeTheme {
        Greeting("Jetpack Compose")
    }
}