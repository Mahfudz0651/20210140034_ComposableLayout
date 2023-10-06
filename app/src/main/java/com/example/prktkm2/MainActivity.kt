package com.example.prktkm2

import android.os.Bundle
import android.os.Message
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prktkm2.ui.theme.Prktkm2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prktkm2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TampilLayar(pesan = getString(R.string.greeting), dari = getString(R.string.name))
                }
            }
        }
    }
}
@Composable
fun TampilText(message:String, from:String, modifier: Modifier=Modifier){
    Column (verticalArrangement = Arrangement.Center,
        modifier = modifier){
        Text(
            color= Color.Blue,
            text = message,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )
        Text(
            color = Color.Red,
            text = from,
            fontSize = 60.sp,
                    modifier = Modifier
                        .padding(16.dp),
                        .align(alignment = Alignment.CenterHorizontally)

        )
    }

@Composable
fun TampilLayar(pesan: String, dari: String){
    val image = painterResource(R.drawable.bg)
    Box {
        Image(painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillHeight,
        modifier = Modifier.fillMaxSize())
    TampilText(
        message = pesan,
        from = dari,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Prktkm2Theme {
        Greeting("Android")

    }
    TampilLayar(pesan = "Selamat Datang", dari ="Di UMY" )
}
