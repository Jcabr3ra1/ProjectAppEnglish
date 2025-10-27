package com.example.projectappenglish.screens

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectappenglish.R
import com.example.projectappenglish.models.Animals
import com.example.projectappenglish.ui.theme.TitleBlue

@Composable
fun AnimalScreen() {
    val context = LocalContext.current

    val animals = listOf(
        Animals(R.drawable.rabbit, R.raw.conejo, R.raw.rabbit),
        Animals(R.drawable.dog, R.raw.perro, R.raw.dog),
        Animals(R.drawable.cat, R.raw.gato, R.raw.cat),
        Animals(R.drawable.tiger, R.raw.tigre, R.raw.tiger),
        Animals(R.drawable.cow, R.raw.vaca, R.raw.cow),
        Animals(R.drawable.bird, R.raw.pajaro, R.raw.bird)
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.backg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "ANIMALES",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = TitleBlue,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            //grilla
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                items(animals) { animal ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(animal.image),
                            contentDescription = null,
                            modifier = Modifier.size(160.dp)
                        )

                        Spacer(Modifier.height(5.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Español
                            Image(
                                painter = painterResource(R.drawable.ic_es),
                                contentDescription = "Español",
                                modifier = Modifier
                                    .size(45.dp)
                                    .clickable {
                                        val mp = MediaPlayer.create(context, animal.soundEs)
                                        mp.setOnCompletionListener { it.release() }
                                        mp.start()
                                    }
                            )
                            // Inglés
                            Image(
                                painter = painterResource(R.drawable.ic_en),
                                contentDescription = "Inglés",
                                modifier = Modifier
                                    .size(45.dp)
                                    .clickable {
                                        val mp = MediaPlayer.create(context, animal.soundEn)
                                        mp.setOnCompletionListener { it.release() }
                                        mp.start()
                                    }
                            )
                        }
                    }
                }
            }
        }
    }
}
