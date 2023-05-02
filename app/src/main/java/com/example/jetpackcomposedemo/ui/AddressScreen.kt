package com.example.jetpackcomposedemo.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposedemo.R
import com.example.jetpackcomposedemo.data.Address
import com.example.jetpackcomposedemo.data.AddressesData

@Preview
@Composable
fun AddressScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = "Our locations",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.helvetica_neue_bold))
                ),
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 12.dp, top = 20.dp),
            )
        }
        items(AddressesData.list.size) {
            AddressCard(AddressesData.list[it])
        }
    }
}

@Composable
private fun AddressCard(address: Address) {
    Card(
        shape = RoundedCornerShape(14.dp),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
        ) {
            Image(
                bitmap = ImageBitmap.imageResource(id = R.drawable.ic_location),
                contentDescription = "flower_card",
                modifier = Modifier.padding(end = 10.dp),
            )
            Text(
                text = address.name,
                style = TextStyle(
                    color = gray,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.helvetica_neue_medium))
                )
            )
        }
    }
}
