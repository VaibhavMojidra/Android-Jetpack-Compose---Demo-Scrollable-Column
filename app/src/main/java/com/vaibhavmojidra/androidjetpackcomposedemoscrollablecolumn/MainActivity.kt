package com.vaibhavmojidra.androidjetpackcomposedemoscrollablecolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vaibhavmojidra.androidjetpackcomposedemoscrollablecolumn.ui.theme.AndroidJetpackComposeDemoScrollableColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeDemoScrollableColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    scrollDColumnDemo()
                }
            }
        }
    }
}

@Composable
fun scrollDColumnDemo(){
    val scrollState= rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..100){
            Text("List Item $i",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(10.dp)
            )
            Divider(color = Color.DarkGray, thickness = 1.dp)
        }
    }
}