package com.dwin.miappingles.ui.menus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.ui.juego.Juego_Colores;
import com.dwin.miappingles.R;

public class Menu_Juego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_juego);

    }

    public void irJuegoIngles(View view){
        Intent irJuegoIngles = new Intent(Menu_Juego.this, Juego_Colores.class);
        startActivity(irJuegoIngles);
    }
}