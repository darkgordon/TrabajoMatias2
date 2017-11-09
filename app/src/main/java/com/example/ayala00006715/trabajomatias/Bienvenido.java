package com.example.ayala00006715.trabajomatias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by darkg on 10/27/2017.
 */

public class Bienvenido extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvenida);
    }

  //  public void botcatalogo(View view) {
       // Intent IngresarCatalogo = new Intent(this, Catalogo.class);
      // startActivity(IngresarCatalogo);


    public void botinfo (View view){
        Intent ingersarpdf= new Intent(Bienvenido.this, pdfActivity.class);
        startActivity(ingersarpdf);
}

    public void botdeci(View view){
        Intent menudeci= new Intent(Bienvenido.this,Decibelios.class);
        startActivity(menudeci);
    }

    public void botcatalogo(View view){
        Intent registro= new Intent(Bienvenido.this,UsuarioNuevoActivity.class);
        startActivity(registro);
    }
}
