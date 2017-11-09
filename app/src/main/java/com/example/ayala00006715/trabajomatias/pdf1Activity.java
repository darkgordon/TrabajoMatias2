package com.example.ayala00006715.trabajomatias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by darkg on 7/11/2017.
 */

public class pdf1Activity extends AppCompatActivity {
    PDFView pdftext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf1_layout);
        pdftext1 = (PDFView) findViewById(R.id.pdftext1);
         pdftext1.fromAsset("de86.pdf").load();

    }
}
