package com.example.ayala00006715.trabajomatias;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by darkg on 6/11/2017.
 */

public class DBconsultas {
    Dbhelper dbh;
    SQLiteDatabase db;

    public DBconsultas(Context algo){
        dbh=new Dbhelper(algo);
        db=dbh.getWritableDatabase();
    }

    public ArrayList<Producto> ObtenerDatosPro1() {
        ArrayList<Producto> productos = new ArrayList<>();
        String llenado = "SELECT *FROM producto1";
        Cursor cursor = db.rawQuery(llenado, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));
                while (cursor.moveToNext()) {
                    productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));
                }
            }
        }
        return productos;
    }
    public ArrayList<Producto> ObtenerDatosPro2() {
        ArrayList<Producto> productos = new ArrayList<>();
        String llenado = "SELECT *FROM producto2";
        Cursor cursor = db.rawQuery(llenado, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));
                while (cursor.moveToNext()) {
                    productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));
                }
            }
        }
        return productos;
    }
    public ArrayList<Producto> ObtenerDatosPro3() {
        ArrayList<Producto> productos = new ArrayList<>();
        String llenado = "SELECT *FROM producto3";
        Cursor cursor = db.rawQuery(llenado, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));
                while (cursor.moveToNext()) {
                    productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));
                }
            }
        }
        return productos;
    }
    public ArrayList<Producto> ObtenerProductosEm() {
        ArrayList<Producto> productos = new ArrayList<>();
        String llenado = "SELECT *FROM productoem";
        Cursor cursor = db.rawQuery(llenado, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));
                while (cursor.moveToNext()) {
                    productos.add(new Producto(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3)));

                }
            }
        }
        return productos;
    }

    public void add(String nomPro, String Precio,String imagen) {
        try {
            db.execSQL("INSERT INTO producto1 (NomProduc1,PrecioProduc1,imagen1) VALUES ( '" + nomPro + "','" + Precio + "','" + imagen + "');");
            Log.d("ASD", "se fue");
        } catch (Exception e) {
            Log.d("DSA", "Query incorrecta");
        }
    }

    public void add2(String nomPro2, String Precio2,String imagen2) {
        try {
            db.execSQL("INSERT INTO producto2 (NomProduc2,PrecioProduc2,imagen2) VALUES ( '" + nomPro2 + "','" + Precio2 + "','" + imagen2 + "');");
            Log.d("ASD", "se fue");
        } catch (Exception e) {
            Log.d("DSA", "Query incorrecta");
        }
    }

    public void add3(String nomPro3, String Precio3,String imagen3) {
        try {
            db.execSQL("INSERT INTO producto3 (NomProduc3,PrecioProduc3,imagen3) VALUES ( '" + nomPro3 + "','" + Precio3 + "','" + imagen3 + "');");
            Log.d("ASD", "se fue");
        } catch (Exception e) {
            Log.d("DSA", "Query incorrecta");
        }
    }











}
