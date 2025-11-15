package com.dwin.miappingles.ui.figuras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;

public class Cuadrado extends AppCompatActivity {
    // DECLARACIÓN DE ELEMENTOS (VIEWS)
    EditText edtLadoCua;
    Button btnCalCua;
    TextView txtResulCua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        edtLadoCua = findViewById(R.id.edtLadoCua);
        btnCalCua = findViewById(R.id.btnCalCua);
        txtResulCua = findViewById(R.id.txtResulCua);

        btnCalCua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double lado = Double.parseDouble(edtLadoCua.getText().toString());
                double area = Math.pow(lado, 2);
                txtResulCua.setText("El área del cuadrado es: " + area);
            }
        });
    }
}