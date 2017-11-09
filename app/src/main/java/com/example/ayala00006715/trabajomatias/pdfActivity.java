package com.example.ayala00006715.trabajomatias;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.IOException;

/**
 * Created by darkg on 10/28/2017.
 */

public class pdfActivity  extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_pdfs);
       // pdftext = (PDFView) findViewById(R.id.pdftext);
       // pdftext.fromAsset("test.pdf").load();


    }

    public void botmenu (View view){
        Intent menu= new Intent(this,Bienvenido.class);
        startActivity(menu);

    }
    public void pdf1 (View view){
        Intent pdf1= new Intent(this,pdf1Activity.class);
        startActivity(pdf1);

    }
    public void pdf2 (View view){
        Intent pdf2= new Intent(this,pdf2activity.class);
        startActivity(pdf2);

    }
    public void pdf3 (View view){
        Intent pdf3= new Intent(this,pdf3activity.class);
        startActivity(pdf3);

    }
    public void pdf4 (View view){
        Intent pdf4= new Intent(this,pdf4activity.class);
        startActivity(pdf4);

    }




}


