package com.dwin.miappingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_main);


    }

    public void irIngles(View view){
        Intent irIngles = new Intent(Menu_Main.this, Menu_Ingles.class);
        startActivity(irIngles);
    }
    public void irOperaciones(View view){
        Intent irOperaciones = new Intent(Menu_Main.this,Menu_Operaciones.class);
        startActivity(irOperaciones);
    }
    public void irJugar(View view){
        Intent irAnimals = new Intent(Menu_Main.this,Menu_Juego.class);
        startActivity(irAnimals);
    }
    public void irIMC(View view){
        Intent irNumber = new Intent(Menu_Main.this,Imc.class);
        startActivity(irNumber);
    }
    public void irAreas(View view){
        Intent irVowels = new Intent(Menu_Main.this,Menu_Area.class);
        startActivity(irVowels);
    }

    public void irTest(View view){
        Intent irTest = new Intent(Menu_Main.this,Test.class);
        startActivity(irTest);
    }





}