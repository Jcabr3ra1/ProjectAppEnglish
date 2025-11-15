package com.dwin.miappingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_operaciones);


    }

    public void irOpSuma(View view){
        Intent irOpSuma = new Intent(Menu_Operaciones.this,Sumar.class);
        startActivity(irOpSuma);
    }
    public void irOpResta(View view){
        Intent irOpResta = new Intent(Menu_Operaciones.this,Restar.class);
        startActivity(irOpResta);
    }
    public void irOpMultiplicacion(View view){
        Intent irOpMultiplicacion = new Intent(Menu_Operaciones.this,Multiplicar.class);
        startActivity(irOpMultiplicacion);
    }
    public void irOpDivision(View view){
        Intent irOpDivision = new Intent(Menu_Operaciones.this,Dividir.class);
        startActivity(irOpDivision);
    }
}