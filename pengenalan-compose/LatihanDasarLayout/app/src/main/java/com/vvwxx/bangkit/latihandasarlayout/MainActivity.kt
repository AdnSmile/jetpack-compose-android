package com.vvwxx.bangkit.latihandasarlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vvwxx.bangkit.latihandasarlayout.ui.theme.LatihanDasarLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanDasarLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ButtonWithText(text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(colorResource(R.color.purple_500)),
        modifier = modifier.padding(4.dp)
    ) {
        Text(text, textAlign = TextAlign.Center)
    }
}

@Composable
fun Weight() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row {
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("1", Modifier.weight(1f))
        }

        Row {
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("2", Modifier.weight(2f))
            ButtonWithText("1", Modifier.weight(1f))
        }

        Row {
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("2", Modifier.weight(2f))
            ButtonWithText("3", Modifier.weight(3f))
        }
    }
}

@Composable
fun WeightFill() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row {
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("3 fill true", Modifier.weight(weight = 3f, fill = true))
        }

        Row {
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("2", Modifier.weight(2f))
            ButtonWithText("3 fill false", Modifier.weight(3f, false))
        }
    }
}

@Composable
fun WeightOne() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),) {
        Row {
            ButtonWithText("1", Modifier.weight(1f))
            ButtonWithText("0")
            ButtonWithText("0")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LatihanDasarLayoutTheme {
        Weight()
    }
}

@Preview(showBackground = true)
@Composable
fun FillPreview() {
    LatihanDasarLayoutTheme {
        WeightFill()
    }
}

@Preview(showBackground = true)
@Composable
fun WeightOnePreview() {
    LatihanDasarLayoutTheme {
        WeightOne()
    }
}