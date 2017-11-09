package com.example.ayala00006715.trabajomatias;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ayala00006715.trabajomatias.adapters.CustomAdapter;
import com.example.ayala00006715.trabajomatias.adapters.RecyclerViewAdapter;

import java.util.ArrayList;

/**
 * Created by darkg on 7/11/2017.
 */

public class CustomAdapter2 extends RecyclerViewAdapter {

    Activity actividad;
    ArrayList<Producto> productos;
    public static final String TAG = "TAG_BASE";

    public CustomAdapter2(final Activity actividad, final ArrayList<Producto> productos) {
        this.actividad = actividad;
        this.productos = productos;

        setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(actividad, productos.get(position).getNombreProducto(), Toast.LENGTH_SHORT).show();
            }
        });


    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(actividad).inflate(R.layout.producto_custom_card, parent , false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(final CustomRecycleViewHolder holder, final int position) {
        final ViewHolder myHolder = (ViewHolder) holder;
           // myHolder.poster.setImageResource(R.drawable.casco);
            Bitmap bmp = decodeBase64(productos.get(position).getImagen());
            myHolder.poster.setImageBitmap(bmp);

        myHolder.nombreProducto.setText(productos.get(position).getNombreProducto());
        myHolder.PrecioProducto.setText(productos.get(position).getPrecio());
        Log.d(TAG, "onBindViewHolder:"+position);


        myHolder.comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(myHolder.itemView.getContext(),"Producto: "+ productos.get(position).getNombreProducto()+" comprado", Toast.LENGTH_SHORT).show();
            }

        });


    }
    public static Bitmap decodeBase64(String input)
    {
        byte[] decodedBytes = Base64.decode(input, 0);
        return BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }
    public class ViewHolder extends CustomRecycleViewHolder {
        private ImageView poster;
        private TextView nombreProducto;
        private TextView PrecioProducto;
        private Button comprar;

        public ViewHolder(View itemView) {
            super(itemView);
            poster = (ImageView) itemView.findViewById(R.id.serie_poster_image_viewb);
            nombreProducto = (TextView) itemView.findViewById(R.id.productoTitulo_view);
            PrecioProducto= (TextView) itemView.findViewById(R.id.ProductoPrecio_view);
            comprar=(Button)itemView.findViewById(R.id.buttonb);
        }
    }
}
