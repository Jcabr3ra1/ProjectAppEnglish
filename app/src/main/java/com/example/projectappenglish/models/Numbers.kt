package com.example.projectappenglish.models

data class Numbers(
    val image: Int,
    val soundEs: Int,
    val soundEn: Int
)

data class NumbersP(
    val image: Int,
    val soundEn: Int,
    val correctAnswer: String,
    val option: List<String>
)