package com.dwin.miappingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu_Juego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_juego);

    }

    public void irJuegoIngles(View view){
        Intent irJuegoIngles = new Intent(Menu_Juego.this,Juego_Colores.class);
        startActivity(irJuegoIngles);
    }
}