package com.example.buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void IntruccionesBT(View view){
        Intent intent = new Intent(this, Instrucciones.class);
        startActivity(intent);
    }
    public void Salir(View view){
        finish();
    }
    public void jugar(View view){
        Intent intent = new Intent(this, juego.class);
        startActivity(intent);
    }
}