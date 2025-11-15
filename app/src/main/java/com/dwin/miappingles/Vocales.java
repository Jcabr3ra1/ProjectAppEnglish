package com.dwin.miappingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Vocales extends AppCompatActivity {

    MediaPlayer soundlanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vocales);
    }

    public void irMenuV(View view) {
        Intent irMenu = new Intent(Vocales.this, Menu_Ingles.class);
        startActivity(irMenu);
    }

    public void soundAEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.a_es);
        soundlanguage.start();
    }

    public void soundAEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.a_en);
        soundlanguage.start();
    }

    public void soundEEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.e_es);
        soundlanguage.start();
    }

    public void soundEEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.e_en);
        soundlanguage.start();
    }

    public void soundIEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.i_es);
        soundlanguage.start();
    }

    public void soundIEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.i_en);
        soundlanguage.start();
    }

    public void soundOEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.o_es);
        soundlanguage.start();
    }

    public void soundOEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.o_en);
        soundlanguage.start();
    }

    public void soundUEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.u_es);
        soundlanguage.start();
    }

    public void soundUEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.u_en);
        soundlanguage.start();
    }
}