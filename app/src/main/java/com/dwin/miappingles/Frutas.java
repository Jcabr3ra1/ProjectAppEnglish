package com.dwin.miappingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Frutas extends AppCompatActivity {

    MediaPlayer soundlanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
    }
        public void irMenuF(View view){
            Intent irMenu = new Intent(Frutas.this, Menu_Ingles.class);
            startActivity(irMenu);
        }

    public void soundAppleEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.manzana);
        soundlanguage.start();
    }

    public void soundAppleEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.apple);
        soundlanguage.start();
    }

    public void soundBananaEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.banano);
        soundlanguage.start();
    }

    public void soundBananaEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.banana);
        soundlanguage.start();
    }

    public void soundGripeEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.uva);
        soundlanguage.start();
    }

    public void soundGripeEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.gripe);
        soundlanguage.start();
    }

    public void soundMangoEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.mangoes);
        soundlanguage.start();
    }

    public void soundMangoEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.mangoen);
        soundlanguage.start();
    }

    public void soundOrangeEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.naranja);
        soundlanguage.start();
    }

    public void soundOrangeEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.orange);
        soundlanguage.start();
    }

    public void soundWatermelonEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.sandia);
        soundlanguage.start();
    }

    public void soundWatermelonEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.watermelon);
        soundlanguage.start();
    }
}