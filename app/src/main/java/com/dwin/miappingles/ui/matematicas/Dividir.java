package com.dwin.miappingles.ui.matematicas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;

public class Dividir extends AppCompatActivity {

    EditText edtNum1, edtNum2;
    Button btnDividir;
    TextView txtResulDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        edtNum1 = findViewById(R.id.edtNum1Div);
        edtNum2 = findViewById(R.id.edtNum2Div);
        btnDividir = findViewById(R.id.btnCalDiv);
        txtResulDiv = findViewById(R.id.txtResulDiv);

        // EVENTO DEL BOTÓN
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edtNum1.getText().toString());
                double num2 = Double.parseDouble(edtNum2.getText().toString());

                if (num2 == 0) {
                    txtResulDiv.setText("No se puede dividir por cero");
                } else {
                    double division = num1 / num2;
                    txtResulDiv.setText("El resultado es: " + division);
                }
            }
        });
    }
}