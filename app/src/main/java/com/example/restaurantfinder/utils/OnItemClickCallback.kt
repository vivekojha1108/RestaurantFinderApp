package com.example.restaurantfinder.utils

import com.example.restaurantfinder.model.ModelMain


interface OnItemClickCallback {
    fun onItemMainClicked(modelMainHorizontal: ModelMain?)
}