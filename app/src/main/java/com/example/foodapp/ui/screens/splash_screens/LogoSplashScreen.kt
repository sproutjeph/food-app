package com.example.foodapp.ui.screens.splash_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.foodapp.R
import com.example.foodapp.ui.navigation.FoodAppScreens
import kotlinx.coroutines.delay

@Composable
fun LogoSplashScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {

    LaunchedEffect(Unit){
        delay(2000L)
        navController.navigate(FoodAppScreens.WelcomeSplashScreen.name)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Spacer(modifier = Modifier.weight(0.5f))

        Text(
            text = "Stove Ordering App",
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold


        )

        Spacer(modifier  = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.stove_logo),
            contentDescription = "Stove Logo",
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary),
            modifier = Modifier



        )

        Spacer(modifier = Modifier.weight(0.5f))

        CircularProgressIndicator(modifier = modifier
            .padding(16.dp)
            .padding(bottom = 50.dp),
            color = MaterialTheme.colorScheme.primary)

    }

}


