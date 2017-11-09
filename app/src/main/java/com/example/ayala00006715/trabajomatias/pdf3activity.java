package com.example.ayala00006715.trabajomatias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by darkg on 7/11/2017.
 */

public class pdf3activity extends AppCompatActivity {
    PDFView pdftext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf3_layout);
        pdftext3 = (PDFView) findViewById(R.id.pdftext3);
        pdftext3.fromAsset("1881.pdf").load();

    }
}
