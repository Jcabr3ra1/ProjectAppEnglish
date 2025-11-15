package com.dwin.miappingles.ui.pruebas;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;
import com.google.android.material.snackbar.Snackbar;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }
    public void crearAletDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Advertencia de seguridad");
        builder.setMessage("¿Está seguro de lo que va a hacer? ¿Super seguro? ¿En serio?");

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Test.this, "Usted aceptó algo que no debía", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Test.this, "Usted tomó la decisión correcta", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

    public void snackAlgo(View view) {
        Snackbar.make(view, "Hello Word!!", Snackbar.LENGTH_LONG)
                .setAction("Cerrar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Test.this, "Snackbar cerrado", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    public void ToasT1Long(View view) {
        Toast.makeText(Test.this, "Mostrar toast larga duración", Toast.LENGTH_LONG).show();
    }

    public void ToasT2Short(View view) {
        Toast.makeText(Test.this, "Mostrar toast corta duracion", Toast.LENGTH_SHORT).show();
    }

    public void alertOk(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Prueba de boton");
        builder.setMessage("Probando boton ok");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Test.this, "Usted presiono ok!!!", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }


}