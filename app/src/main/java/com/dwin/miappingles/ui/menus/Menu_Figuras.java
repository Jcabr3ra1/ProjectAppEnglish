package com.dwin.miappingles.ui.menus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;
import com.dwin.miappingles.ui.figuras.Circulo;
import com.dwin.miappingles.ui.figuras.Cuadrado;
import com.dwin.miappingles.ui.figuras.Triangulo;

public class Menu_Figuras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_figuras);


    }
    public void irATria(View view) {
        Intent irOpSuma = new Intent(Menu_Figuras.this, Triangulo.class);
        startActivity(irOpSuma);
    }

    public void irACua(View view) {
        Intent irACua = new Intent(Menu_Figuras.this, Cuadrado.class);
        startActivity(irACua);
    }

    public void irACircu(View view) {
        Intent irACircu = new Intent(Menu_Figuras.this, Circulo.class);
        startActivity(irACircu);
    }
}