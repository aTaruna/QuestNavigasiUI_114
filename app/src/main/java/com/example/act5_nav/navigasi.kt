package com.example.act5_nav

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi{
    FormulirQue,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirQue.name,
            modifier = modifier.padding(isiRuang)) {
            composable(route = Navigasi.FormulirQue.name) {
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    OnBackBtnClick = {
                        cancelAndBackToFormulirQue(navController)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirQue(navController: NavHostController) {
    navController.popBackStack(Navigasi.FormulirQue.name, false)
}