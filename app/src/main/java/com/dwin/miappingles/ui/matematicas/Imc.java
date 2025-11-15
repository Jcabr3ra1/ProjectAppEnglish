package com.dwin.miappingles.ui.matematicas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;
import com.dwin.miappingles.controllers.matematicas.ImcController;

public class Imc extends AppCompatActivity {

    EditText edtPeso, edtAltura;
    Button btnCalImc;
    TextView txtResulImc;
    ImageView imgCategoriaImc;

    ImcController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);
        btnCalImc = findViewById(R.id.btnCalImc);
        txtResulImc = findViewById(R.id.txtResulImc);
        imgCategoriaImc = findViewById(R.id.imgCategoriaImc);

        controller = new ImcController();

        btnCalImc.setOnClickListener(view -> {

            try {
                float imc = controller.calcularImc(
                        edtPeso.getText().toString(),
                        edtAltura.getText().toString()
                );

                String categoria = controller.obtenerCategoria();
                int imagen = controller.obtenerImagenCategoria();

                txtResulImc.setText("Tu IMC es: " + imc + "\nCategoría: " + categoria);
                imgCategoriaImc.setImageResource(imagen);

            } catch (Exception e) {
                txtResulImc.setText("Error: ingresa datos válidos");
            }
        });
    }
}
