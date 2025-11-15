package com.dwin.miappingles;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Circulo extends AppCompatActivity {

    EditText edtRadioCir;
    Button btnCalCir;
    TextView txtResulCir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);


        edtRadioCir = findViewById(R.id.edtRadioCir);
        btnCalCir = findViewById(R.id.btnCalCir);
        txtResulCir = findViewById(R.id.txtResulCir);

        btnCalCir.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                double radio = Double.parseDouble(edtRadioCir.getText().toString());
                double area = Math.PI * Math.pow(radio, 2);
                txtResulCir.setText("El área del círculo es: " + area);
            }
        });
    }
}