package com.dwin.miappingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        Intent intent = new Intent(this, Bienvenido.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);
        intent.putExtra("ciudad", ciudad);
        startActivity(intent);
    }

}