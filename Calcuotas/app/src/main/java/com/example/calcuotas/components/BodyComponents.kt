package com.example.calcuotas.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.KeyboardType


@Composable

fun spaceh(size: Dp = 5.dp){
    Spacer(modifier = Modifier.height(size))
}

@Composable
fun SpaceV(size: Dp = 5.dp) {
    Spacer(modifier = Modifier.width(size))
}

@Composable
fun MainTextField(value: String, onValueChange: (String) -> Unit, label: String){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {Text(text = label) },
        keyboardOptions = keyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
    )
}

@composable
fun MainButton(Text: String, onClick: () -> Unit){
    OutlinedTextField(
        value = text,
        onValueChange = { },
        label = { Text(text = text) },
        modifier = Modifier
    )
}