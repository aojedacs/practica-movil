package com.aojedacs.helloworld.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Contact(name:String, phone:String){
    Column() {
        Text(name)
        Text(phone)
        
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewContact(){
    Row() {
        Contact("Angel", "6121256894")
        Contact("Juan", "6124895687")
        Contact("Sofia", "6124758965")
    }

}