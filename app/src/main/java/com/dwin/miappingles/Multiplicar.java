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

public class Multiplicar extends AppCompatActivity {
    EditText edtNum1,edtNum2;
    Button btnMultiplicar;
    TextView txtResulMultiplicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_multiplicar);


        edtNum1 = findViewById(R.id.edtNum1Mult);
        edtNum2 = findViewById(R.id.edtNum2Mult);

        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        txtResulMultiplicar = findViewById(R.id.txtResulMultiplicar);

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());
                int mult = num1*num2;
                txtResulMultiplicar.setText("el resultado es: " + mult);

            }
        });

    }
}