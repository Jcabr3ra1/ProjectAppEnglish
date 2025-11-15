package com.dwin.miappingles.ui.matematicas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dwin.miappingles.R;
import com.dwin.miappingles.controllers.matematicas.SumaController;

public class Suma extends AppCompatActivity {

    private EditText txtNum1, txtNum2;
    private TextView txtResultado;
    private Button btnCalcular;

    private SumaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        controller = new SumaController();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int resultado = controller.procesarSuma(
                            txtNum1.getText().toString(),
                            txtNum2.getText().toString()
                    );

                    txtResultado.setText(String.valueOf(resultado));

                } catch (NumberFormatException e) {
                    txtResultado.setText("Error: ingrese valores válidos");
                }
            }
        });
    }
}
