package com.dwin.miappingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_area);


    }
    public void irATria(View view) {
        Intent irOpSuma = new Intent(Menu_Area.this, Triangulo.class);
        startActivity(irOpSuma);
    }

    public void irACua(View view) {
        Intent irACua = new Intent(Menu_Area.this, Cuadrado.class);
        startActivity(irACua);
    }

    public void irACircu(View view) {
        Intent irACircu = new Intent(Menu_Area.this, Circulo.class);
        startActivity(irACircu);
    }
}