package com.example.instagram_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.instagram_clone.ui.theme.theme.Instagram_CloneTheme
import com.example.instagram_clone.ui.theme.view.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Instagram_CloneTheme {
                HomeScreen()
            }
        }
    }
}

