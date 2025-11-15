package com.dwin.miappingles.ui.menus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;
import com.dwin.miappingles.ui.matematicas.Dividir;
import com.dwin.miappingles.ui.matematicas.Imc;
import com.dwin.miappingles.ui.matematicas.Multiplicar;
import com.dwin.miappingles.ui.matematicas.Resta;
import com.dwin.miappingles.ui.matematicas.Suma;

public class Menu_Operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_matematicas);


    }

    public void irOpSuma(View view){
        Intent irOpSuma = new Intent(Menu_Operaciones.this, Suma.class);
        startActivity(irOpSuma);
    }
    public void irOpResta(View view){
        Intent irOpResta = new Intent(Menu_Operaciones.this, Resta.class);
        startActivity(irOpResta);
    }
    public void irOpMultiplicacion(View view){
        Intent irOpMultiplicacion = new Intent(Menu_Operaciones.this, Multiplicar.class);
        startActivity(irOpMultiplicacion);
    }
    public void irOpDivision(View view){
        Intent irOpDivision = new Intent(Menu_Operaciones.this, Dividir.class);
        startActivity(irOpDivision);
    }

    public void irIMC(View view) {
        Intent irOpDivision = new Intent(Menu_Operaciones.this, Imc.class);
        startActivity(irOpDivision);
    }
}