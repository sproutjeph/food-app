package com.example.foodapp.di

import com.example.foodapp.common.Constants
import com.example.foodapp.features.fetch_menu_items.data.remote.StoveApi
import com.example.foodapp.features.fetch_menu_items.data.repository.MenuDataRepositoryImpl
import com.example.foodapp.features.fetch_menu_items.domain.MenuDataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideStoveApi(): StoveApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StoveApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMenuDataRepository(api:StoveApi): MenuDataRepository {
        return MenuDataRepositoryImpl(api)
    }
}