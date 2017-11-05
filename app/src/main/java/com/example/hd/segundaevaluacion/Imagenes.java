package com.example.hd.segundaevaluacion;

import android.graphics.Bitmap;

/**
 * Created by hd on 4/11/2017.
 */

public class Imagenes {

    private String id;
    private String ruta;
    private Bitmap bitmap;


    public String getNombre() { return id;  }

    public void setNombre(String id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
