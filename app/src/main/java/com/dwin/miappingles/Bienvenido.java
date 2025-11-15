package com.dwin.miappingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bienvenido extends AppCompatActivity {

    TextView tvNombre, tvApellido, tvCiudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        tvNombre = findViewById(R.id.tvNombre);
        tvApellido = findViewById(R.id.tvApellido);
        tvCiudad = findViewById(R.id.tvCiudad);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ((TextView) findViewById(R.id.tvNombre)).setText(extras.getString("nombre", ""));
            ((TextView) findViewById(R.id.tvApellido)).setText(extras.getString("apellido", ""));
            ((TextView) findViewById(R.id.tvCiudad)).setText(extras.getString("ciudad", ""));
        }
    }

    public void irMenu_main(View view) {
        Intent ir = new Intent(Bienvenido.this, Menu_Main.class);
        startActivity(ir);
    }
}