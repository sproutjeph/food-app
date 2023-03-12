package com.example.foodapp.features.fetch_menu_items.presentation.menu_data

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodapp.common.Resource
import com.example.foodapp.features.fetch_menu_items.use_case.GetMenuData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MenuDataViewModel @Inject constructor(
    private val getMenuDataUseCase: GetMenuData,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = mutableStateOf(MenuDataState())
    val state: State<MenuDataState> = _state

    init{
         getMenuData()
    }

    private fun getMenuData(){
        getMenuDataUseCase().onEach {result ->

            when(result){
                is Resource.Success ->{
                    _state.value = MenuDataState(
                        menuData = result.data
                    )
                }

                is Resource.Error -> {
                    _state.value = MenuDataState(
                        error = result.message ?: "An unexpected error occurred "
                    )
                }

                is Resource.Loading -> {
                    _state.value = MenuDataState(
                        isLoading = true
                    )
                }
            }

        }.launchIn(viewModelScope)

    }
}