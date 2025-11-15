package com.dwin.miappingles.ui.pruebas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import com.dwin.miappingles.ui.menus.Menu_Main;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;

public class Datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

    }
    public void irMenu(View view) {
        EditText edtNombre = findViewById(R.id.edtNombre);
        EditText edtApellido = findViewById(R.id.edtApellido);
        Spinner spItems = findViewById(R.id.spItems);

        String nombre = edtNombre.getText().toString();
        String apellido = edtApellido.getText().toString();
        String ciudad = spItems.getSelectedItem().toString();

        Intent intent = new Intent(this, Menu_Main.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);
        intent.putExtra("ciudad", ciudad);
        startActivity(intent);
    }

}