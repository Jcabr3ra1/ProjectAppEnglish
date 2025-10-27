package com.example.projectappenglish.models

data class Colors(
    val image: Int,
    val soundEs: Int,
    val soundEn: Int
)

data class ColorsP(
    val image: Int,
    val soundEn: Int,
    val correctAnswer: String,
    val option: List<String>
)