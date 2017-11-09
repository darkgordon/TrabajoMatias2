package com.example.ayala00006715.trabajomatias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by darkg on 7/11/2017.
 */

public class pdf4activity extends AppCompatActivity {
    PDFView pdftext4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf4_layout);
        pdftext4 = (PDFView) findViewById(R.id.pdftext4);
        pdftext4.fromAsset("254.pdf").load();

    }
}
