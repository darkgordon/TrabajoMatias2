package com.example.ayala00006715.trabajomatias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void entrar (View view){

        Intent intent= new Intent(MainActivity.this, Bienvenido.class);
        startActivity(intent);
    }

    public void salir(View v){
        /*
        Al igual hicimos un boton de salir (VER IDS EN XML PARA TENER CLARO ), AQUI LO QUE SE HACE ES ABRIR LA FUNCION DE CERRAR

         */
        finish();
        System.exit(0);
    }
}
