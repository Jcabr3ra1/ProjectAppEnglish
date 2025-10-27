package com.example.projectappenglish.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectappenglish.R
import com.example.projectappenglish.models.AnimalsP
import com.example.projectappenglish.ui.theme.BackOrange
import com.example.projectappenglish.ui.theme.TitleBlue

@Composable
fun AnimalPlayScreen() {

    val animals = listOf(
        AnimalsP(
            image = R.drawable.rabbit,
            soundEn = R.raw.rabbit,
            correctAnswer = "rabbit",
            option = listOf("dog", "cat", "bird", "tiger", "rabbit", "cow")
        ),
        AnimalsP(
            image = R.drawable.dog,
            soundEn = R.raw.dog,
            correctAnswer = "dog",
            option = listOf("dog", "cat", "bird", "tiger", "rabbit", "cow")
        ),
        AnimalsP(
            image = R.drawable.cat,
            soundEn = R.raw.cat,
            correctAnswer = "cat",
            option = listOf("dog", "cat", "bird", "tiger", "rabbit", "cow")
        ),
        AnimalsP(
            image = R.drawable.tiger,
            soundEn = R.raw.tiger,
            correctAnswer = "tiger",
            option = listOf("dog", "cat", "tiger", "tiger", "rabbit", "cow")
        ),
        AnimalsP(
            image = R.drawable.cow,
            soundEn = R.raw.cow,
            correctAnswer = "cow",
            option = listOf("dog", "cat", "bird", "tiger", "rabbit", "cow")
        ),
        AnimalsP(
            image = R.drawable.bird,
            soundEn = R.raw.bird,
            correctAnswer = "bird",
            option = listOf("dog", "cat", "bird", "tiger", "rabbit", "cow")
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(8.dp, RoundedCornerShape(20.dp)),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Animal Game",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = TitleBlue
                )
                Text(
                    text = "0",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = BackOrange
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.dog),
                contentDescription = "imagen",
                modifier = Modifier
                    .size(200.dp)
                    .clickable { }
            )

            Spacer(modifier = Modifier.height(50.dp))

            // columna 1
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Opción 1", fontSize = 16.sp)
                }

                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Opción 2", fontSize = 16.sp)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // columna 2
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Opción 3", fontSize = 16.sp)
                }

                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Opción 4", fontSize = 16.sp)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // columnas 3
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Opción 5", fontSize = 16.sp)
                }

                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Opción 6", fontSize = 16.sp)
                }
            }
        }
    }
}