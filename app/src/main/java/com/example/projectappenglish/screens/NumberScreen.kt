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
import com.example.projectappenglish.models.Fruits
import com.example.projectappenglish.models.Numbers
import com.example.projectappenglish.ui.theme.TitleBlue

@Composable
fun NumberScreen() {
    val context = LocalContext.current

    val numbers = listOf(
        Numbers(R.drawable.one, R.raw.uno, R.raw.one),
        Numbers(R.drawable.two, R.raw.dos, R.raw.two),
        Numbers(R.drawable.three, R.raw.tres, R.raw.three),
        Numbers(R.drawable.four, R.raw.cuatro, R.raw.four),
        Numbers(R.drawable.five, R.raw.cinco, R.raw.five),
        Numbers(R.drawable.six, R.raw.seis, R.raw.six),
        Numbers(R.drawable.seven, R.raw.siete, R.raw.seven),
        Numbers(R.drawable.eight, R.raw.ocho, R.raw.eight),
        Numbers(R.drawable.nine, R.raw.nueve, R.raw.nine),
        Numbers(R.drawable.ten, R.raw.diez, R.raw.ten)

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
                text = "NUMEROS",
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
                items(numbers) { animal ->
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
