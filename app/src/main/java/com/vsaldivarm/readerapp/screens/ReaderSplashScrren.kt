package com.vsaldivarm.readerapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Preview
@Composable
fun ReaderSplashScreen(navController: NavController = NavController(context = LocalContext.current)){
   Surface(modifier = Modifier
      .padding(15.dp)
      .size(330.dp)
   , shape = CircleShape,
   color = Color.White,
      border = BorderStroke(2.dp,Color.LightGray)
   ) {
      Column(modifier = Modifier.padding(1.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center) {
         Text(text = "Reader", style = MaterialTheme.typography.displayLarge,
         color = Color.Red.copy(alpha = 0.5f))
         Spacer(modifier = Modifier.height(15.dp))
         Text(text = "\"Change. Yourself \"",
            style = MaterialTheme.typography.displaySmall,
            color = Color.LightGray
         )
      }

   }

}