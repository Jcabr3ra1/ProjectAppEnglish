package com.example.projectappenglish.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectappenglish.R
import com.example.projectappenglish.ui.theme.*

@Composable
fun PlayScreen(
    navigateToColorsPlay: () -> Unit,
    navigateToNumbersPlay: () -> Unit,
    navigateToAnimalsPlay: () -> Unit,
    navigateToFruitsPlay: () -> Unit,
    navigateToVowelsPlay: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {

        // Fondo
        Image(
            painter = painterResource(R.drawable.backg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(Modifier.height(8.dp))

            // Mascota
            Image(
                painter = painterResource(R.drawable.ic_mascot_gamer),
                contentDescription = null,
                modifier = Modifier.size(110.dp)
            )

            // Título
            Text(
                text = "¡Es hora de jugar!",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = TitleBlue,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(20.dp))

            // Colores y Números
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Colores
                Card(
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = BackRed.copy(alpha = 0.92f)
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .clickable { navigateToColorsPlay() }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_colors),
                            contentDescription = "Colores",
                            modifier = Modifier.size(70.dp)
                        )
                        Text(
                            text = "Colores",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                // Números
                Card(
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = BackBlue.copy(alpha = 0.92f)
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .clickable { navigateToNumbersPlay() }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_numbers),
                            contentDescription = "Números",
                            modifier = Modifier.size(70.dp)
                        )
                        Text(
                            text = "Números",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            // Animales y Frutas
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Animales
                Card(
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = BackGreen.copy(alpha = 0.92f)
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .clickable { navigateToAnimalsPlay() }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_animals),
                            contentDescription = "Animales",
                            modifier = Modifier.size(70.dp)
                        )
                        Text(
                            text = "Animales",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                // Frutas
                Card(
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = BackYellow.copy(alpha = 0.92f)
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .clickable { navigateToFruitsPlay() }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_fruits),
                            contentDescription = "Frutas",
                            modifier = Modifier.size(70.dp)
                        )
                        Text(
                            text = "Frutas",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            // Vocales centrado
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = BackOrange.copy(alpha = 0.92f)
                    ),
                    modifier = Modifier
                        .width(180.dp)
                        .aspectRatio(1f)
                        .clickable { navigateToVowelsPlay() }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_vowels),
                            contentDescription = "Vocales",
                            modifier = Modifier.size(70.dp)
                        )
                        Text(
                            text = "Vocales",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

        }
    }
}
