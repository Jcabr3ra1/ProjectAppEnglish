package com.dwin.miappingles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.models.ModelsImc;

public class Imc extends AppCompatActivity {
    EditText edtPeso, edtAltura;
    Button btnCalImc;
    TextView txtResulImc;
    ImageView imgCategoriaImc;

    ModelsImc modelsImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);
        btnCalImc = findViewById(R.id.btnCalImc);
        txtResulImc = findViewById(R.id.txtResulImc);
        imgCategoriaImc = findViewById(R.id.imgCategoriaImc);

        modelsImc = new ModelsImc();

        btnCalImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float peso = Float.parseFloat(edtPeso.getText().toString());
                float altura = Float.parseFloat(edtAltura.getText().toString());
                modelsImc.setPeso(peso);
                modelsImc.setAltura(altura);
                float imc = modelsImc.calcularImc();
                String categoria = modelsImc.getCategoria();
                int imagen = modelsImc.getImagenCategoria();

                txtResulImc.setText("Tu IMC es: " + imc + "\nCategoría: " + categoria);
                imgCategoriaImc.setImageResource(imagen);
            }
        });
    }
}