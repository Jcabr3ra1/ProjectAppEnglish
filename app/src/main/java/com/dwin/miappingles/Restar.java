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

public class Restar extends AppCompatActivity {
    EditText edtNum1,edtNum2;
    Button btnRestar;
    TextView txtResulResta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_restar);


        edtNum1 = findViewById(R.id.edtNum1Resta);
        edtNum2 = findViewById(R.id.edtNum2Resta);

        btnRestar = findViewById(R.id.btnCalResta);
        txtResulResta = findViewById(R.id.txtResulResta);

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edtNum1.getText().toString());
                int num2 = Integer.parseInt(edtNum2.getText().toString());
                int resta = num1-num2;
                txtResulResta.setText("el resultado es: " + resta);

            }
        });

    }
}