package com.dwin.miappingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMenu_main(View view) {
        Intent ir = new Intent(MainActivity.this, Datos.class);
        startActivity(ir);
    }
}