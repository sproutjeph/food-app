package com.example.foodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodapp.ui.navigation.FoodAppNavigation
import com.example.foodapp.ui.screens.RegisterLoginScreen
import com.example.foodapp.ui.theme.FoodAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodApp {
                FoodAppNavigation()
            }
        }
    }
}

@Composable
fun FoodApp(content:@Composable ()-> Unit) {
    FoodAppTheme {
        content()
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodAppTheme {
    }
}