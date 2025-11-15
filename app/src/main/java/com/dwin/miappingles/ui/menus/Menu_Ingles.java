package com.dwin.miappingles.ui.menus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;
import com.dwin.miappingles.ui.ingles.Animales;
import com.dwin.miappingles.ui.ingles.Colores;
import com.dwin.miappingles.ui.ingles.Frutas;
import com.dwin.miappingles.ui.ingles.Numeros;
import com.dwin.miappingles.ui.ingles.Vocales;

public class Menu_Ingles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_ingles);


    }

    public void irColores(View view){
        Intent irColors = new Intent(Menu_Ingles.this, Colores.class);
        startActivity(irColors);
    }
    public void irFrutas(View view){
        Intent irFruits = new Intent(Menu_Ingles.this, Frutas.class);
        startActivity(irFruits);
    }
    public void irAnimales(View view){
        Intent irAnimals = new Intent(Menu_Ingles.this, Animales.class);
        startActivity(irAnimals);
    }
    public void irNumeros(View view){
        Intent irNumber = new Intent(Menu_Ingles.this, Numeros.class);
        startActivity(irNumber);
    }
    public void irVocales(View view){
        Intent irVowels = new Intent(Menu_Ingles.this, Vocales.class);
        startActivity(irVowels);
    }





}