package com.dwin.miappingles.ui.ingles;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dwin.miappingles.R;

public class Animales extends AppCompatActivity {

    MediaPlayer soundlanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
    }

    public void soundRabbitEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.conejo);
        soundlanguage.start();
    }

    public void soundRabbitEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.rabbit);
        soundlanguage.start();
    }

    public void soundDogEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.perro);
        soundlanguage.start();
    }

    public void soundDogEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.dog);
        soundlanguage.start();
    }

    public void soundCatEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.gato);
        soundlanguage.start();
    }

    public void soundCatEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.cat);
        soundlanguage.start();
    }

    public void soundTigerEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.tigre);
        soundlanguage.start();
    }

    public void soundTigerEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.tiger);
        soundlanguage.start();
    }

    public void soundCowEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.vaca);
        soundlanguage.start();
    }

    public void soundCowEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.cow);
        soundlanguage.start();
    }

    public void soundBirdEs(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.pajaro);
        soundlanguage.start();
    }

    public void soundBirdEn(View view){
        soundlanguage = MediaPlayer.create(this, R.raw.bird);
        soundlanguage.start();
    }

}