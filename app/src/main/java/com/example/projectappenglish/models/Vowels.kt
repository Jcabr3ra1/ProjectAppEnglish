package com.example.projectappenglish.models

data class Vowels(
    val image: Int,
    val soundEs: Int,
    val soundEn: Int
)

data class VowelsP(
    val image: Int,
    val soundEn: Int,
    val correctAnswer: String,
    val option: List<String>
)