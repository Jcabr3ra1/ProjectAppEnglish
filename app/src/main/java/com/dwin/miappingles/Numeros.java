package com.dwin.miappingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Numeros extends AppCompatActivity {

    MediaPlayer soundlanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
    }

    public void irMenuN(View view){
        Intent irMenu = new Intent(Numeros.this, Menu_Ingles.class);
        startActivity(irMenu);
    }

    public void soundOneEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.uno);
        soundlanguage.start();
    }

    public void soundOneEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.one);
        soundlanguage.start();
    }

    public void soundTwoEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.dos);
        soundlanguage.start();
    }

    public void soundTwoEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.two);
        soundlanguage.start();
    }

    public void soundThreeEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.tres);
        soundlanguage.start();
    }

    public void soundThreeEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.three);
        soundlanguage.start();
    }

    public void soundFourEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.cuatro);
        soundlanguage.start();
    }

    public void soundFourEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.four);
        soundlanguage.start();
    }

    public void soundFiveEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.cinco);
        soundlanguage.start();
    }

    public void soundFiveEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.five);
        soundlanguage.start();
    }

    public void soundSixEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.seis);
        soundlanguage.start();
    }

    public void soundSixEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.six);
        soundlanguage.start();
    }

    public void soundSevenEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.siete);
        soundlanguage.start();
    }

    public void soundSevenEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.seven);
        soundlanguage.start();
    }

    public void soundEightEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.ocho);
        soundlanguage.start();
    }

    public void soundEightEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.eight);
        soundlanguage.start();
    }

    public void soundNineEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.nueve);
        soundlanguage.start();
    }

    public void soundNineEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.nine);
        soundlanguage.start();
    }

    public void soundTenEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.diez);
        soundlanguage.start();
    }

    public void soundTenEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.ten);
        soundlanguage.start();
    }


}