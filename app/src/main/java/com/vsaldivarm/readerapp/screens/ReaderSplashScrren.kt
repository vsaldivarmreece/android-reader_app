package com.vsaldivarm.readerapp.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vsaldivarm.readerapp.navigation.ReaderScreens
import kotlinx.coroutines.delay


@Composable
fun ReaderSplashScreen(navController: NavController) {
   val scale = remember {
      androidx.compose.animation.core.Animatable(0f)
   }
   //animation
   LaunchedEffect(key1 = true) {
      scale.animateTo(
         targetValue = 0.9f,
         animationSpec = tween(
            durationMillis = 800,
            easing = {
               OvershootInterpolator(8f)
                  .getInterpolation(it)
            })
      )
      delay(2000L)
      navController.navigate(ReaderScreens.LogInScreen.name)
   }

   Surface(
      modifier = Modifier
         .padding(20.dp)
         .size(330.dp)
         .scale(scale.value),
      shape = CircleShape,
      color = Color.White,
      border = BorderStroke(
         2.dp,
         Color.LightGray
      )
   ) {
      Column(
         modifier = Modifier.padding(1.dp),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
      ) {
         Text(
            text = "Reader", style = MaterialTheme.typography.displayLarge,
            color = Color.Red.copy(alpha = 0.5f)
         )
         Spacer(modifier = Modifier.height(15.dp))
         Text(
            text = "\"Change. Yourself \"",
            style = MaterialTheme.typography.titleLarge,
            color = Color.LightGray
         )
      }

   }

}