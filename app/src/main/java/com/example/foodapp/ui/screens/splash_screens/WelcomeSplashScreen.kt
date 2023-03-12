package com.example.foodapp.ui.screens.splash_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodapp.R
import com.example.foodapp.ui.navigation.FoodAppScreens
import kotlinx.coroutines.delay

@Preview(showBackground = true)
@Composable
fun WelcomeSplashScreen(
    modifier: Modifier = Modifier
        .padding(16.dp)
        .background(MaterialTheme.colorScheme.surface),
    navController: NavController? = null

) {
    val isDarkTheme = isSystemInDarkTheme()

    LaunchedEffect(Unit){
        delay(2000L)
        navController?.navigate(FoodAppScreens.OrderSplashScreen.name)
    }

    Box(
        modifier =Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.splash_screen),
            contentDescription = "null",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(
                text = "Welcome to \uD83D\uDC4B",
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.displaySmall.fontSize,
                color = if(isDarkTheme) MaterialTheme.colorScheme.primary else Color(0xFFFFB957)
            )

            Text(
                text = "Stove Ordering App",
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.displaySmall.fontSize,
                color = if(isDarkTheme) MaterialTheme.colorScheme.primary else Color(0xFFFFB957)
            )
            Spacer(modifier = Modifier.height(12.dp))


        }

        Text(
            text = stringResource(id = R.string.welcome_splash_screen_text),
            textAlign = TextAlign.Center,
            color = if(isDarkTheme) MaterialTheme.colorScheme.onSurface else Color(0xFFBDBDBD),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp)

        )


    }

}

