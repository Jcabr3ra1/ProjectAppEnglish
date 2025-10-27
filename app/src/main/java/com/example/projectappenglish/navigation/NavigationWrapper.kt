package com.example.projectappenglish.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectappenglish.screens.AnimalPlayScreen
import com.example.projectappenglish.screens.AnimalScreen
import com.example.projectappenglish.screens.ColorPlayScreen
import com.example.projectappenglish.screens.ColorScreen
import com.example.projectappenglish.screens.FruitPlayScreen
import com.example.projectappenglish.screens.FruitScreen
import com.example.projectappenglish.screens.HomeScreen
import com.example.projectappenglish.screens.LearnScreen
import com.example.projectappenglish.screens.NumberPlayScreen
import com.example.projectappenglish.screens.NumberScreen
import com.example.projectappenglish.screens.PlayScreen
import com.example.projectappenglish.screens.VowelPlayScreen
import com.example.projectappenglish.screens.VowelScreen
import com.example.projectappenglish.screens.WelcomeScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Welcome) {
        composable<Welcome> {
            WelcomeScreen(navigateToHome = { navController.navigate(Home) })
        }

        composable<Home> {
            HomeScreen(
                navigateToLearn = { navController.navigate(Learn) },
                navigateToPlay = { navController.navigate(Play) },

            )
        }

        composable<Learn> {
            LearnScreen(
                navigateToColors = { navController.navigate(Colors) },
                navigateToNumbers = { navController.navigate(Numbers) },
                navigateToAnimals = { navController.navigate(Animals) },
                navigateToFruits = { navController.navigate(Fruits) },
                navigateToVowels = { navController.navigate(Vowels) }
            )
        }

        composable<Play> {
            PlayScreen(
                navigateToColorsPlay = { navController.navigate(ColorsP) },
                navigateToNumbersPlay = { navController.navigate(NumbersP) },
                navigateToAnimalsPlay = { navController.navigate(AnimalsP) },
                navigateToFruitsPlay = { navController.navigate(FruitsP) },
                navigateToVowelsPlay = { navController.navigate(VowelsP) }
            )
        }

        //LEARN
        //NAVEGACION COLORES

        composable<Colors> {
            ColorScreen()
        }

        //NAVEGACION ANIMALES

        composable<Animals> {
            AnimalScreen()
        }

        //NAVEGACION NUMEROS

        composable<Numbers> {
            NumberScreen()
        }

        //NAVEGACION VOCALES

        composable<Vowels> {
            VowelScreen()
        }

        //NAVEGACION FRUTAS

        composable<Fruits> {
            FruitScreen()
        }

        //PLAY
        //NAVEGACION COLORES

        composable<ColorsP> {
            ColorPlayScreen()
        }

        //NAVEGACION ANIMALES

        composable<AnimalsP> {
            AnimalPlayScreen()
        }

        //NAVEGACION NUMEROS

        composable<NumbersP> {
            NumberPlayScreen()
        }

        //NAVEGACION VOCALES

        composable<VowelsP> {
            VowelPlayScreen()
        }

        //NAVEGACION FRUTAS

        composable<FruitsP> {
            FruitPlayScreen()
        }


    }
}