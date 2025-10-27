package com.example.projectappenglish.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.projectappenglish.ui.theme.HomeLightBlue
import com.example.projectappenglish.ui.theme.HomePastelYellow
import com.example.projectappenglish.ui.theme.HomeTextCyanBlue

@Composable
fun HomeScreen(
    navigateToLearn: () -> Unit,
    navigateToPlay: () -> Unit,
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
                .padding(horizontal = 24.dp, vertical = 120.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Elige una opcion",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2196F3),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.fillMaxWidth()
            ) {

                //Aprender
                Card(
                    shape = RoundedCornerShape(30.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = HomePastelYellow
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .clickable { navigateToLearn() }
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(R.drawable.learn),
                                contentDescription = "Aprender",
                                modifier = Modifier.size(96.dp)
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = "Aprender",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = HomeTextCyanBlue
                            )
                        }
                    }
                }

                //Jugar
                Card(
                    shape = RoundedCornerShape(30.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = HomeLightBlue
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .clickable { navigateToPlay() }
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(R.drawable.play),
                                contentDescription = "Jugar",
                                modifier = Modifier.size(96.dp)
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = "Jugar",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = HomeTextCyanBlue
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(8.dp))
        }
    }
}
