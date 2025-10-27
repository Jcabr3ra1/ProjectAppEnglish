package com.example.projectappenglish.models

data class Animals(
    val image: Int,
    val soundEs: Int,
    val soundEn: Int,
)

data class AnimalsP(
    val image: Int,
    val soundEn: Int,
    val correctAnswer: String,
    val option: List<String>
)


