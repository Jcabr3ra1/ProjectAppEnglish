package com.dwin.miappingles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Triangulo extends AppCompatActivity {
    EditText edtBase, edtAltura;
    Button btnCalcularArea;
    TextView txtResultadoArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        edtBase = findViewById(R.id.edtBaseTri);
        edtAltura = findViewById(R.id.edtAlturaTri);
        btnCalcularArea = findViewById(R.id.btnCalTri);
        txtResultadoArea = findViewById(R.id.txtResulTri);

        btnCalcularArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double base = Double.parseDouble(edtBase.getText().toString());
                double altura = Double.parseDouble(edtAltura.getText().toString());

                double area = (base * altura) / 2;

                txtResultadoArea.setText("El área del triángulo es: " + area);
            }
        });
    }
}