package com.example.foodapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodapp.R
import com.example.foodapp.ui.components.FoodAppTopAppBar
import com.example.foodapp.ui.navigation.FoodAppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            FoodAppTopAppBar(
                title = R.string.empty,
                navController = navController,
                isMainScreen = false
            )
        }
    ) { contentPadding->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface),
            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.stove_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))


            Text(
               text = stringResource(id = R.string.creeate_account),
               style = MaterialTheme.typography.titleLarge

           )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = "",
                onValueChange ={},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email, contentDescription = null)
                },
                label = {
                    Text(text = "Email")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = "",
                onValueChange ={},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Phone, contentDescription = null)
                },
                label = {
                    Text(text = "Phone Number")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = "",
                onValueChange ={},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
                },
                label = {
                    Text(text = "Name")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                          navController.navigate(FoodAppScreens.HomeScreen.name)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "Sign up")
            }

            Row(
                modifier = Modifier
                    .padding(horizontal =  16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(modifier = Modifier.weight(1f))
                Text(
                    text = stringResource(id = R.string.or_continue),
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(horizontal = 5.dp)

                )

                Divider(modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                AuthPro(imageId = R.drawable.google_logo)
                AuthPro(imageId = R.drawable.fb_logo)
                AuthPro(imageId = R.drawable.apple_log)

            }
            Spacer(modifier = Modifier.height(16.dp))
            Row() {
                Text(text = "already have an account")
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Sign in",
                    color = MaterialTheme.colorScheme.primary
                )
            }



        }

    }
}

@Composable
fun AuthPro(
    imageId: Int,
) {
    Box(
        modifier = Modifier
    ){
        Image(
            painter = painterResource(id = imageId),
            contentDescription =  stringResource(id =  R.string.google_text),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .border(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.tertiaryContainer,
                    shape = RoundedCornerShape(4.dp)
                )
                .padding(8.dp)

        )
    }
}