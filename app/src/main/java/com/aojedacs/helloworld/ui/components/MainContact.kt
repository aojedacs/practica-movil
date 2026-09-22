package com.aojedacs.helloworld.ui.components

import android.graphics.fonts.Font
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainContact () {
    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,

    ) {
        Text(
            text = "Hola",
            color = Color(0xFFFF0000),
            fontSize = 20.sp ,
            fontWeight = FontWeight.Bold

        )
        Text("Elemento 1")
        Text("Elemento 1")
        Text("Elemento 1")
        Text("Elemento 1")
        Text("Elemento 1")
//        Row() {
//            Text("Campo de buscar")
//            Text("BOTON")
//        }
//        Contact("Angel", "6125598743")
//        Contact("Angel", "6125598743")
//        Contact("Angel", "6125598743")
//        Contact("Angel", "6125598743")
    }
}

@Preview(showBackground = true)
@Composable
fun MainContactPreview(){
    MainContact()
}