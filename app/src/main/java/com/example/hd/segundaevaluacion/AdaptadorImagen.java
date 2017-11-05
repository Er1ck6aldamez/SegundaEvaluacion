package com.example.hd.segundaevaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hd on 4/11/2017.
 */

public class AdaptadorImagen extends ArrayAdapter<Imagenes>{

    private  Animation zoom_in,zoom_out;
    Boolean   es_zoomIN;

    public AdaptadorImagen(@NonNull Context context, @NonNull List<Imagenes> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Imagenes Img=getItem(position);

        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_lista,parent,false);
        }

            TextView lblId=(TextView) convertView.findViewById(R.id.Id_contador);
            TextView lblNombre=(TextView) convertView.findViewById(R.id.txtDireccion);
            ImageView img=(ImageView) convertView.findViewById(R.id.imgLista);

            zoom_in= AnimationUtils.loadAnimation(getContext(),R.anim.zoom_in);
            zoom_in.setFillAfter(true);
            zoom_out=AnimationUtils.loadAnimation(getContext(),R.anim.zoom_out);
            zoom_out.setFillAfter(true);

            es_zoomIN  = true;


                //lblId.setText(position+1);
                lblNombre.setText(Img.getRuta());
                img.setImageBitmap(Img.getBitmap());

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(es_zoomIN) {
                        view.startAnimation(zoom_in);
                    }else{
                        view.startAnimation(zoom_out);
                    }
                    es_zoomIN=!es_zoomIN;
                }
            });

        return convertView;
    }
}