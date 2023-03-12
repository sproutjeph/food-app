package com.example.foodapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodapp.R
import com.example.foodapp.ui.components.FoodAppTopAppBar
import com.example.foodapp.ui.navigation.FoodAppScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterLoginScreen(
    navController: NavController
) {

    Scaffold(
        topBar ={
            FoodAppTopAppBar(
                title = R.string.register_text,
                navController = navController,
                isMainScreen = false
            )
        }
    ) {contentPadding->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {


                Image(
                    painter = painterResource(id = R.drawable.splash_screen_login),
                    contentDescription = "null",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(250.dp)
                        .fillMaxWidth()
                )

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.register_login_text),
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(8.dp))

                AuthItem(
                    imageId = R.drawable.fb_logo,
                    imageDes = R.string.facebook_image_text,
                    authProvider = R.string.facebook_text
                )
                AuthItem(
                    imageId = R.drawable.google_logo,
                    imageDes = R.string.google_image_text,
                    authProvider = R.string.google_text
                )
                AuthItem(
                    imageId = R.drawable.apple_log,
                    imageDes = R.string.apple_image_text,
                    authProvider = R.string.apple_text
                )

            }

            Row(
                modifier = Modifier
                    .padding(horizontal =  16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(modifier = Modifier.weight(1f))
                Text(
                    text = stringResource(id = R.string.or_text),
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(horizontal = 5.dp)

                )

                Divider(modifier = Modifier.weight(1f))
            }
    
            Button(
                onClick = { navController.navigate(FoodAppScreens.CreateAccountScreen.name) },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()

            ) {
                Text(
                    text = stringResource(id = R.string.signin_email)
                )
            }
            
            Row() {
                Text(text = "Don't have an account ")
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Sign up",
                    color = MaterialTheme.colorScheme.primary
                )
            }
            
            

        }

    }


    
}

//@Preview(showBackground = true)
@Composable
fun AuthItem(
    modifier: Modifier = Modifier,
    imageId: Int = R.drawable.fb_logo,
    imageDes: Int = R.string.facebook_image_text,
    authProvider: Int = R.string.facebook_text,
) {


            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .height(50.dp)
                    .clip(RoundedCornerShape(50))
                    .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(50)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                ),
            ) {
                Image(
                    painter = painterResource(id = imageId),
                    contentDescription = stringResource(id = imageDes),
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(50)),
                )


                Text(
                    text = stringResource(id = authProvider),
                    fontSize = MaterialTheme.typography.titleSmall.fontSize,
                    color = MaterialTheme.colorScheme.primary
                )
            }







}