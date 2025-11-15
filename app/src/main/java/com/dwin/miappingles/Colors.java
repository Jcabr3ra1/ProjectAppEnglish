package com.dwin.miappingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Colors extends AppCompatActivity {

    MediaPlayer soundlanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
    }

    public void irMenuC(View view){
        Intent irMenu = new Intent(Colors.this, Menu_Ingles.class);
        startActivity(irMenu);
    }

    public void soundRedEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.rojo);
        soundlanguage.start();
    }

    public void soundRedEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.red);
        soundlanguage.start();
    }

    public void soundBlueEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.azul);
        soundlanguage.start();
    }

    public void soundBlueEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.blue);
        soundlanguage.start();
    }

    public void soundYellowEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.amarrillo);
        soundlanguage.start();
    }

    public void soundYellowEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.yellow);
        soundlanguage.start();
    }

    public void soundGreenEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.verde);
        soundlanguage.start();
    }

    public void soundGreenEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.green);
        soundlanguage.start();
    }

    public void soundBlackEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.negro);
        soundlanguage.start();
    }

    public void soundBlackEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.black);
        soundlanguage.start();
    }

    public void soundPurpleEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.morado);
        soundlanguage.start();
    }

    public void soundPurpleEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.purple);
        soundlanguage.start();
    }
}