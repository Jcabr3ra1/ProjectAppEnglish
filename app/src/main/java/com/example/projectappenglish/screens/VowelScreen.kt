package com.example.projectappenglish.screens

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
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
import com.example.projectappenglish.models.Vowels
import com.example.projectappenglish.ui.theme.TitleBlue

@Composable
fun VowelScreen() {
    val context = LocalContext.current

    val vowels = listOf(
        Vowels(R.drawable.vo_a, R.raw.a_es, R.raw.a_en),
        Vowels(R.drawable.vo_e, R.raw.e_es, R.raw.e_en),
        Vowels(R.drawable.vo_i, R.raw.i_es, R.raw.i_en),
        Vowels(R.drawable.vo_o, R.raw.o_es, R.raw.o_en),
        Vowels(R.drawable.vo_u, R.raw.u_es, R.raw.u_en)
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
                text = "VOCALES",
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
                items(
                    items = vowels,
                    span = { item ->
                        if (item == vowels.last()) GridItemSpan(2) else GridItemSpan(1)
                    }
                ) { vowels ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(vowels.image),
                            contentDescription = null,
                            modifier = Modifier.size(160.dp)
                        )

                        Spacer(Modifier.height(5.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_es),
                                contentDescription = "Español",
                                modifier = Modifier
                                    .size(45.dp)
                                    .clickable {
                                        val mp = MediaPlayer.create(context, vowels.soundEs)
                                        mp.setOnCompletionListener { it.release() }
                                        mp.start()
                                    }
                            )
                            Image(
                                painter = painterResource(R.drawable.ic_en),
                                contentDescription = "Inglés",
                                modifier = Modifier
                                    .size(45.dp)
                                    .clickable {
                                        val mp = MediaPlayer.create(context, vowels.soundEn)
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
