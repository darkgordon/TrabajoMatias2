package com.example.ayala00006715.trabajomatias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by darkg on 7/11/2017.
 */

public class pdf2activity extends AppCompatActivity {
    PDFView pdftext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf2_layout);
        pdftext2 = (PDFView) findViewById(R.id.pdftext2);
        pdftext2.fromAsset("de89.pdf").load();

    }
}
