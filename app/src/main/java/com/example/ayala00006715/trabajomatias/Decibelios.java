package com.example.ayala00006715.trabajomatias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by darkg on 30/10/2017.
 */

public class Decibelios extends AppCompatActivity {
    EditText valor;
    ImageView imagen;
    TextView descripcion;
    TextView proveedortext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decibelios);
        valor= (EditText)(findViewById(R.id.textdeci));
        imagen=(ImageView)(findViewById(R.id.decimage));
        proveedortext=(TextView)(findViewById(R.id.proveedortext));
        //imagen.setImageResource(R.drawable.nr25);
       // descripcion.setText("EJEMPLO DE DESCRIPCION");
    }

    public void regresar (View view){
        Intent regresar= new Intent(Decibelios.this, Bienvenido.class);
        startActivity(regresar);
    }


    public void calcular(View view){
        Double algo= Double.parseDouble(valor.getText().toString());
        Double temp= algo;
        Integer resultado= (int)Math.ceil(temp);




        if(resultado>=85 && resultado <86){
            imagen.setImageResource(R.drawable.nrr14);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 14 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("Producto disponible en nuestro catalogo");
        }

        if(resultado>=86 && resultado <88){
            Toast.makeText(valor.getContext(),"No hay valor en la base de datos",Toast.LENGTH_SHORT).show();
            valor.setText("");
            proveedortext.setText("");

        }
        if(resultado>=89 && resultado <90){
            imagen.setImageResource(R.drawable.nr16);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 16 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("GENERAL SAFETY, S.A");

        }
        if(resultado>=90 && resultado <91){
            Toast.makeText(valor.getContext(),"No hay valor en la base de datos",Toast.LENGTH_SHORT).show();
            valor.setText("");
            proveedortext.setText("INFRASAL, S.A DE C.V");

        }
        if(resultado>=91 && resultado <92){
            imagen.setImageResource(R.drawable.nrr20);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 16 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("3M, S.A DE C.V");

        }
        if(resultado>=92 && resultado <93){
            imagen.setImageResource(R.drawable.nrr22);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 22 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("GENERAL SAFETY, S.A");

        }
        if(resultado>=93 && resultado <94){
            imagen.setImageResource(R.drawable.nrr24);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 24 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("FREUND, S.A");

        }
        if(resultado>=94 && resultado <95){
            imagen.setImageResource(R.drawable.nr25);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 25 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("CASA RIVAS ELECTRÓNICA, S.A");

        }

        if(resultado>=95 && resultado <96){
            imagen.setImageResource(R.drawable.nrr27);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 27 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("GENERAL SAFETY, S.A");

        }
        if(resultado>=96 && resultado <97){
            imagen.setImageResource(R.drawable.nrr29);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 29 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("INFRASAL, S.A DE C.V");

        }
        if(resultado>=97 && resultado <98){
            imagen.setImageResource(R.drawable.nrr33);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 31 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("3M, S.A DE C.V");

        }
        if(resultado>=98 && resultado <99){
            imagen.setImageResource(R.drawable.nrr32);
            Toast.makeText(valor.getContext(),"Usar tapon u orejeras con 31 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("Producto disponible en nuestro catalogo");

        }
        if(resultado>=99 && resultado <100){
            imagen.setImageResource(R.drawable.nrr25or);
            Toast.makeText(valor.getContext(),"Usar tapon mas orejeras con 25 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("GENERAL SAFETY, S.A");

        }
        if(resultado>=100 && resultado <101){
            imagen.setImageResource(R.drawable.nrr27or);
            Toast.makeText(valor.getContext(),"Usar tapon mas orejeras con 27 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("INFRASAL, S.A DE C.V");

        }
        if(resultado>=101 && resultado <102){
            imagen.setImageResource(R.drawable.nrr29or);
            Toast.makeText(valor.getContext(),"Usar tapon mas orejeras con 29 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("FREUND, S.A");

        }
        if(resultado>=102 && resultado <103){
            imagen.setImageResource(R.drawable.nrr31or);
            Toast.makeText(valor.getContext(),"Usar tapon mas orejeras con 31 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("GENERAL SAFETY, S.A");

        }
        if(resultado>=103 && resultado <104){
            imagen.setImageResource(R.drawable.nrr33or);
            Toast.makeText(valor.getContext(),"Usar tapon mas orejeras con 31 RRR, minimo.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("CASA RIVAS ELECTRÓNICA, S.A");

        }
        if(resultado>=104 && resultado <115){
            imagen.setImageResource(R.drawable.proced);
            Toast.makeText(valor.getContext(),"Tomar medidias administrativas y equipo EPP.",Toast.LENGTH_LONG).show();
            valor.setText("");
            proveedortext.setText("");

        }
        if(resultado>=116 || resultado<84){
            Toast.makeText(this,"valor desconocido.",Toast.LENGTH_LONG).show();
            valor.setText("");
            imagen.setImageResource(R.drawable.icononull);
            proveedortext.setText("");

        }
    }

}
