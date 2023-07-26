package com.vsaldivarm.readerapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.firestore.FirebaseFirestore
import com.vsaldivarm.readerapp.ui.theme.ReaderAppTheme
import dagger.hilt.android.AndroidEntryPoint
import java.util.HashMap

@AndroidEntryPoint //it will receive all DI
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReaderAppTheme {

            }
        }
    }
}

@Composable
fun ReaderApp() {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize().padding(top = 46.dp),
        color = MaterialTheme.colorScheme.background
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ReaderAppTheme {
        //Greeting("Android")
    }
}