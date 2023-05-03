package com.example.calorietrackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.calorietrackerapp.ui.theme.CalorieTrackerAppTheme
import com.example.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalorieTrackerAppTheme {
                // A surface container using the 'background' color from the theme
                WelcomeScreen()
            }
        }
    }
}

