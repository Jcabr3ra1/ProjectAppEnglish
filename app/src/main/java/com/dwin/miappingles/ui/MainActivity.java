package com.dwin.miappingles.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.dwin.miappingles.ui.menus.Menu_Main;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;
import com.dwin.miappingles.ui.pruebas.Datos;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEmpezarAhora = findViewById(R.id.btnEmpezarAhora);
        Button btnYaTengoCuenta = findViewById(R.id.btnYaTengoCuenta);

        btnEmpezarAhora.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Datos.class);
            startActivity(intent);
        });

        btnYaTengoCuenta.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Menu_Main.class);
            startActivity(intent);
        });
    }
}
