# Android-CargarImagenes_Glide
Ejemplo basico de como llenar un imagenview consumiendo la libreria GLIDE


Como llenar un imagenview con una imagen de glide

Paso 1: incorporar la dependencia en el build.gradle
compile 'com.github.bumptech.glide:glide:3.7.0'

Paso 2: otorgamos permiso de internet en el manifest
<uses-permission android:name="android.permission.INTERNET"></uses-permission>

Paso 3: Para cargar la imagen , basta con pasar la url de la ubicacion de dicha imagen.

Glide.with(context) //el contexto puede ser la activity o fragment donde se ejecute esto
.load("url de imagen")
.into("donde se colocara la imagen");

Nota: en el proyecto todo esta documentado paso a paso.
