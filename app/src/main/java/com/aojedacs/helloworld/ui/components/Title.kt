package com.aojedacs.helloworld.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Title (text:String = "Inserte Titulo", modifier: Modifier = Modifier){

    Text(
        text=text,
        modifier=modifier
    )
}

@Preview(showBackground = true)
@Composable
fun TitlePreview(){
    Title("Titulo de la aplicacion")
}

