package com.dwin.miappingles.ui.menus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.ui.matematicas.Imc;
import com.dwin.miappingles.R;
import com.dwin.miappingles.ui.pruebas.Test;

public class Menu_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);

        TextView tvTituloBienvenida = findViewById(R.id.tvTituloBienvenida);
        TextView tvNombreUsuario = findViewById(R.id.tvNombreUsuario);

        Intent intent = getIntent();
        if (intent != null) {

            String nombre = intent.getStringExtra("nombre");
            String apellido = intent.getStringExtra("apellido");
            String ciudad = intent.getStringExtra("ciudad");

            if (nombre == null) nombre = "";
            if (apellido == null) apellido = "";
            if (ciudad == null || ciudad.isEmpty()) ciudad = "-";

            tvTituloBienvenida.setText("¡Hola, " + nombre + " " + apellido +  "!");

            String lineaInfo = ciudad;
            tvNombreUsuario.setText(lineaInfo.trim());
        }
    }

    public void irIngles(View view) {
        Intent irIngles = new Intent(Menu_Main.this, Menu_Ingles.class);
        startActivity(irIngles);
    }

    public void irOperaciones(View view) {
        Intent irOperaciones = new Intent(Menu_Main.this, Menu_Operaciones.class);
        startActivity(irOperaciones);
    }

    public void irJugar(View view) {
        Intent irAnimals = new Intent(Menu_Main.this, Menu_Juego.class);
        startActivity(irAnimals);
    }

    public void irAreas(View view) {
        Intent irVowels = new Intent(Menu_Main.this, Menu_Figuras.class);
        startActivity(irVowels);
    }

    public void irTest(View view) {
        Intent irTest = new Intent(Menu_Main.this, Test.class);
        startActivity(irTest);
    }


}