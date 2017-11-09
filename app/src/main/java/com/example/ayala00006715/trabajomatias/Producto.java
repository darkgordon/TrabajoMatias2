package com.example.ayala00006715.trabajomatias;

/**
 * Created by darkg on 10/28/2017.
 */

public class Producto {
    private int id;
    private String nombreProducto;
    private String precio;
    private String empresa;
    private String imagen;
    private int imagenid;


    public Producto(int id, String nombreProducto,String precio, String img){
        this.id=id;
        this.nombreProducto=nombreProducto;
        this.precio=precio;
        this.imagen=img;
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}
