package com.example.ayala00006715.trabajomatias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by darkg on 6/11/2017.
 */

public class MenuCatalogos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clasificacion_catalogos);
    }

    public void botproteccionvisual(View view){
        Intent proteccionvisual= new Intent(this,MenuCatalogo1.class);
        startActivity(proteccionvisual);


    }

    public void botproteccioncabeza(View view){
        Intent protecioncabeza= new Intent(this,MenuCatalogo2.class);
        startActivity(protecioncabeza);

    }

    public void menu(View view){
        Intent menu= new Intent(this,Bienvenido.class);
        startActivity(menu);
    }


}
