package com.example.foodapp.features.fetch_menu_items.use_case

import com.example.foodapp.common.Resource
import com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto.MenuData
import com.example.foodapp.features.fetch_menu_items.domain.MenuDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMenuData @Inject constructor(
    private val menuDataRepository: MenuDataRepository
) {
    operator fun invoke(): Flow<Resource<MenuData>> = flow {
        try{
            emit(Resource.Loading<MenuData>())
            val menuData = menuDataRepository.getMenuData()
            emit(Resource.Success<MenuData>(menuData))
        }catch (e: HttpException){
            emit(Resource.Error<MenuData>(e.localizedMessage ?: "An unexpected error occurred"))

        }catch (e: IOException){
            emit(Resource.Error<MenuData>("Couldn't Reach server. check you internet connection."))
        }
    }
}