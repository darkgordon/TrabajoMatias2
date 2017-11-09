package com.example.ayala00006715.trabajomatias;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by darkg on 10/28/2017.
 */

public class Dbhelper extends SQLiteOpenHelper {
    SQLiteDatabase mDB;
    Dbhelper mdb;
    String direccion="";
    Context context;
    private static final String DATABASE_NAME="Productos";
    private static final String createTableProducto1="CREATE TABLE producto1(ID INT PRIMARY KEY, NomProduc1 TEXT, PrecioProduc1 TEXT, imagen1 TEXT);";
    private static final String createTableProducto2="CREATE TABLE producto2(ID2 INT PRIMARY KEY, NomProduc2 TEXT, PrecioProduc2 TEXT, imagen2 TEXT);";
    private static final String createTableProducto3="CREATE TABLE producto3(ID3 INT PRIMARY KEY, NomProduc3 TEXT, PrecioProduc3 TEXT, imagen3 TEXT);";
    private static final String createTableProductoEm="CREATE TABLE productoem(ID INT PRIMARY KEY, NomProducem TEXT, PrecioProducem TEXT,Empresa TEXT, imagenem TEXT);";


    public Dbhelper(Context context){
        super(context, DATABASE_NAME, null, 14);
        if(android.os.Build.VERSION.SDK_INT >= 17){
            direccion = context.getApplicationInfo().dataDir;
        }
        else
        {
            direccion = "/data/data/" + context.getPackageName();
        }
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(createTableProducto1);
        sqLiteDatabase.execSQL(createTableProducto2);
        sqLiteDatabase.execSQL(createTableProducto3);
        sqLiteDatabase.execSQL(createTableProductoEm);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
