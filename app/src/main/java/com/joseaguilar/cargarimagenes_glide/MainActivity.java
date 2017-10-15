package com.joseaguilar.cargarimagenes_glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imagenfondo);

        //Paso 1: crear variable String que contenga el url de la foto (ya sea remota o del servidor) --para este ejemplo descargamos una imagen cualquiera de internet
        String url = "http://www.curiosfera.com/wp-content/uploads/2016/10/D%C3%B3nde-viven-los-lobos.jpg";

        //Paso 2: programamos la logica para consumir la descarga por GLIDE
        Glide.with(this) //elegimos el contexto de la actividad donde se ejecuta
                .load(url) //consumimos la varibla string url
                .crossFade()    //con esto hacemos que aparezca una pequeña animacion mientras carga la imagen descargandose *opcional*
                .centerCrop() //con esta opcion hacemos que la imagen ocupe todo el imagenview *opcional*
                .placeholder(R.mipmap.ic_launcher) //con esta opcion colocamos una imagen momentaria mientras carga el app
                .diskCacheStrategy(DiskCacheStrategy.ALL) //con esta opcion colocamos la estrategia de cache
                .thumbnail(0.5f) //con esta imagen, descargaremos una imagen miniatura si la imagen es demasiado grande
                .into(imageView); //lo introducimos dentro del imagen view

    }
}
