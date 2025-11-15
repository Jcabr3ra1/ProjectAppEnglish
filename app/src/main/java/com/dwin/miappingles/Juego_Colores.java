package com.dwin.miappingles;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Juego_Colores extends AppCompatActivity {

    ImageView imgColor;
    TextView tvPronunciacion;
    Button btnOpcion1, btnOpcion2, btnOpcion3;
    MediaPlayer mediaPlayer;

    int indiceActual = 0;

    int[] imagenes = {
            R.drawable.red,
            R.drawable.blue,
            R.drawable.yellow,
            R.drawable.green,
            R.drawable.black,
            R.drawable.purple
    };

    int[] sonidos = {
            R.raw.red,
            R.raw.blue,
            R.raw.yellow,
            R.raw.green,
            R.raw.black,
            R.raw.purple
    };

    String[][] opciones = {
            {"Red", "Rad", "Reed"},
            {"Bloo", "Blue", "Blu"},
            {"Grenn", "Grin", "Green"},
            {"Yelow", "Yellow", "Yello"},
            {"Blak", "Black", "Blaak"},
            {"Purpul", "Purple", "Purpel"}
    };

    String[] correctas = {
            "Red",
            "Blue",
            "Green",
            "Yellow",
            "Black",
            "Purple"
    };

    String[] pronunciacion = {
            "/red/",
            "/blu/",
            "/grin/",
            "/yelou/",
            "/blak/",
            "/por-pl/"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_colores);

        imgColor = findViewById(R.id.imgColor);
        tvPronunciacion = findViewById(R.id.tvPronunciacion);
        btnOpcion1 = findViewById(R.id.btnOpcion1);
        btnOpcion2 = findViewById(R.id.btnOpcion2);
        btnOpcion3 = findViewById(R.id.btnOpcion3);

        cargarColor();
    }

    void cargarColor() {
        imgColor.setImageResource(imagenes[indiceActual]);
        tvPronunciacion.setText("Pronunciación: " + pronunciacion[indiceActual]);
        btnOpcion1.setText(opciones[indiceActual][0]);
        btnOpcion2.setText(opciones[indiceActual][1]);
        btnOpcion3.setText(opciones[indiceActual][2]);
    }

    public void reproducirColor(View view) {
        mediaPlayer = MediaPlayer.create(this, sonidos[indiceActual]);
        mediaPlayer.start();
    }

    public void verificarRespuesta(View view) {
        Button boton = (Button) view;
        String respuesta = boton.getText().toString();

        if (respuesta.equals(correctas[indiceActual])) {
            mediaPlayer = MediaPlayer.create(this, R.raw.correct);
        } else {
            mediaPlayer = MediaPlayer.create(this, R.raw.incorrect);
        }
        mediaPlayer.start();
    }

    public void irSiguiente(View view) {
        indiceActual++;
        if (indiceActual >= imagenes.length) {
            indiceActual = 0;
        }
        cargarColor();
    }

    public void irMenuColores(View view) {
        finish();
    }
}
