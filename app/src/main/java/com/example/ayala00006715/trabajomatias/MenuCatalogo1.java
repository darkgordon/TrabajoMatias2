package com.example.ayala00006715.trabajomatias;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

/**
 * Created by darkg on 6/11/2017.
 */

public class MenuCatalogo1 extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    String f1;
    DBconsultas pruebaConsultas;
    ImageView imagen;
    static final int PICK_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_catalogo_1);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        //del= (Button) findViewById(R.id.eliminar2);
        pruebaConsultas=new DBconsultas(this);
        imagen=(ImageView)findViewById(R.id.imagen);

    }

    //aqui va intent

    public void catalogo1(View view){
        Intent catalogo1= new Intent(this,RecyclerViewCatalogo1.class);
        startActivity(catalogo1);

    }

    //intent

    public void agregar (View view) {

        String nombreProducto = editText.getText().toString();
        String PrecioProducto=editText2.getText().toString();

        Log.d("info", nombreProducto + " "+ f1);


        try{
            pruebaConsultas.add(nombreProducto,PrecioProducto,f1);
            Toast.makeText(this, "Producto ingresado con exito", Toast.LENGTH_SHORT).show();


        }
        catch (SQLiteException algo){
            Toast.makeText(this, "falta llenar campos", Toast.LENGTH_SHORT).show();
        }

    }

    public void botimagen(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == PICK_IMAGE && resultCode==RESULT_OK) {
            Uri algo= data.getData();

            if(null!=algo ){
                //image.setImageURI(bandera);
                imagen.setImageURI(algo);
                Log.d("autism",algo.toString()
                );

                imagen.setDrawingCacheEnabled(true);
                Bitmap bmap = imagen.getDrawingCache();
                f1 = encodeToBase64(bmap, Bitmap.CompressFormat.PNG, 100);



                //byte[] flag = getImage(bandera);
                // Log.d("autism",flag.toString());
            }
        }
    }
    public static String encodeToBase64(Bitmap image, Bitmap.CompressFormat compressFormat, int quality)
    {
        ByteArrayOutputStream byteArrayOS = new ByteArrayOutputStream();
        image.compress(compressFormat, quality, byteArrayOS);
        return Base64.encodeToString(byteArrayOS.toByteArray(), Base64.DEFAULT);
    }



}
