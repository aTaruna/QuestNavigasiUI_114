package com.example.act5_nav.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick:()->Unit
){
    Scaffold (modifier = Modifier,
        {
            TopAppBar(

            )
        }
}