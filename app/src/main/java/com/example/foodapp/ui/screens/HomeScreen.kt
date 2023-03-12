package com.example.foodapp.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.foodapp.features.fetch_menu_items.presentation.menu_data.MenuDataViewModel

@Composable
fun HomeScreen(
    menuDataViewModel: MenuDataViewModel = hiltViewModel(),
    navController: NavController
) {

    val state = menuDataViewModel.state.value

    Column(modifier = Modifier){
        if(state.isLoading){
            CircularProgressIndicator()
        }else if(state.error.isNotEmpty()){
            Text(text = state.error)

        }else{
            Text(text = state.menuData?.menuItems?.size.toString())
            Log.d("DATA", "HomeScreen: ${state.menuData?.menuItems?.first()?.item_name}")
        }

    }
    
}