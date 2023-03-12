package com.example.foodapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodapp.R
import com.example.foodapp.ui.screens.CreateAccountScreen
import com.example.foodapp.ui.screens.HomeScreen
import com.example.foodapp.ui.screens.RegisterLoginScreen
import com.example.foodapp.ui.screens.components.SplashScreenCommon
import com.example.foodapp.ui.screens.splash_screens.LogoSplashScreen
import com.example.foodapp.ui.screens.splash_screens.WelcomeSplashScreen

@Composable
fun FoodAppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = FoodAppScreens.LogoSplashScreen.name
    ){
        composable(FoodAppScreens.LogoSplashScreen.name){
            LogoSplashScreen(navController = navController)
        }

        composable(FoodAppScreens.WelcomeSplashScreen.name){
            WelcomeSplashScreen(navController = navController)
        }
        composable(FoodAppScreens.OrderSplashScreen.name){
            SplashScreenCommon(
                imageId = R.drawable.splash_screen_order,
                imageDes = R.string.order_image_des,
                title = R.string.order_splash_screen_title,
                description = R.string.order_splash_screen_text,

            ){
                navController.navigate(FoodAppScreens.PaymentSplashScreen.name)
            }
        }
        composable(FoodAppScreens.PaymentSplashScreen.name){
            SplashScreenCommon(
                imageId = R.drawable.splash_screen_payment,
                imageDes = R.string.payment_image_des,
                title = R.string.payment_splash_screen_title,
                description = R.string.payment_splash_screen_text,
            ){
                navController.navigate(FoodAppScreens.DeliverySplashScreen.name)
            }
        }

        composable(FoodAppScreens.DeliverySplashScreen.name){
            SplashScreenCommon(
                imageId = R.drawable.splash_screen_delivery,
                imageDes = R.string.delivery_image_des,
                title = R.string.delivery_splash_screen_title,
                description = R.string.delivery_splash_screen_text,
                buttonText = R.string.login_button_text
            ){
                navController.navigate(FoodAppScreens.RegisterLonginScreen.name)
            }
        }

        composable(FoodAppScreens.RegisterLonginScreen.name){
            RegisterLoginScreen(navController = navController)
        }

        composable(FoodAppScreens.CreateAccountScreen.name){
            CreateAccountScreen(navController = navController)
        }

        composable(FoodAppScreens.HomeScreen.name){
            HomeScreen(navController = navController)
        }

    }
}