package com.example.act5_nav.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.act5_nav.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()->Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenke), "Lainnya"),
        Pair(stringResource(id = R.string.alamat), "Jogja")
    )
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = {
                    Text(stringResource(id = R.string.tampil),
                        color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors
                    (containerColor = colorResource(id = R.color.teal_700))
            )
        }){isiRuang ->
            Column (modifier = Modifier.padding(isiRuang),
                verticalArrangement = Arrangement.SpaceBetween){
                Column (
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                    verticalArrangement = Arrangement
                        .spacedBy(dimensionResource(id = R.dimen.padding_small))
                ){
                    items.forEach { item->
                        Column {
                            Text(text = item.first.uppercase(),
                                fontSize = 16.sp)
                            Text(text = item.second)
                        }
                    }
                }
            }
        }
}