package com.example.projectappenglish.models

data class Fruits(
    val image: Int,
    val soundEs: Int,
    val soundEn: Int
)

data class FruitsP(
    val image: Int,
    val soundEn: Int,
    val correctAnswer: String,
    val option: List<String>
)