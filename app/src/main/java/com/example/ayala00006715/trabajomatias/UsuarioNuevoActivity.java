package com.example.ayala00006715.trabajomatias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by darkg on 6/11/2017.
 */

public class UsuarioNuevoActivity extends AppCompatActivity {
    EditText textuser;
    EditText textpass;
    EditText textdireccion;
    EditText texttarjeta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_usuario);
        /*
        hacemos al igual que el pasado siempre recordar que se llaman los ids de nuestro xml
         */
        textuser = (EditText) findViewById(R.id.textuser);
        textpass = (EditText) findViewById(R.id.textpass);
        textdireccion = (EditText) findViewById(R.id.textdireccion);
        texttarjeta = (EditText) findViewById(R.id.texttarjeta);

    }

    public void ingresar(View view){
        /*
        Cuando se aprete el boton ingresar (PREAMBULO TODOS ESTAS FUNCIONES LLEVAN ENTREPARENTISIS (View view)
        hacer lo mismo de antes obtenemos el texto de la llave con textkey.getText().toString();
        al igual que el texto del modelo

        AHORA
        SE HARA UN MENSAJE
        PARA QUE DIGA QUE FUE INGRESADO
        SE OCUPARA EL TOAST
        la sintaxis es Toast.makeText(esto es para decir que haga un texto)
        textkey.getContext()= nuestro contexto  ocuparemos el de llave
        "ingresado"+" nombre: "+llave+" ID: "+modelo,Toast.LENGTH_SHORT).show()
        practicamente saldra en la pantalla ingresad nombre: LLAVE(llave recuerden que es el texto que ingresa el usuario
        ) id: Llave(RECUERDEN QUE ES LA LLAVE QUE INGRESARA EL USUARIO)
        Toast.LENGTH_SHORT).show()= ESTO HACE LA FUNCION PARA QUE SALGA EN LA PANTALLA, LENGHT SHORT ES EL TIEMPO CORTO
         */
        String user= textuser.getText().toString();
        String pass= textpass.getText().toString();
        String direccion= textdireccion.getText().toString();
        String tarjeta= texttarjeta.getText().toString();

        Toast.makeText(textuser.getContext(),"Usuario Registrado, bienvenido "+user,Toast.LENGTH_SHORT).show();

        Intent ingresar= new Intent(this,MenuCatalogos.class);
        startActivity(ingresar);

    }

    public void regresar(View view){
        Intent regresa= new Intent(this,Bienvenido.class);
        startActivity(regresa);
    }


    }


