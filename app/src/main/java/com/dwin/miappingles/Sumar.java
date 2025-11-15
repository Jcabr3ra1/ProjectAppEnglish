package com.dwin.miappingles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dwin.miappingles.models.ModelsSuma;

public class Sumar extends AppCompatActivity {
    EditText edtNum1,edtNum2;
    Button btnSumar;
    TextView txtResulSuma;
    ModelsSuma modelsSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sumar);


        edtNum1 = findViewById(R.id.edtNum1Suma);
        edtNum2 = findViewById(R.id.edtNum2Suma);
        btnSumar = findViewById(R.id.btnSumar);
        txtResulSuma = findViewById(R.id.txtResulSuma);

        modelsSuma = new ModelsSuma();

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());

                modelsSuma.setNum1(num1);
                modelsSuma.setNum2(num2);

                int resultado = modelsSuma.getResultadoSuma();

                txtResulSuma.setText("el resultado es: " + resultado);

            }
        });

    }
}