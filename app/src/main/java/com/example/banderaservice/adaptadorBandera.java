package com.example.banderaservice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class adaptadorBandera extends ArrayAdapter<bandera> {
    public adaptadorBandera(Context context, ArrayList<bandera> datos) {
        super(context, R.layout.ly_bandera, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.ly_bandera, null);

        TextView lblTitulo = (TextView)item.findViewById(R.id.txtTitulo);
        lblTitulo.setText(getItem(position).getTitulo());


        ImageView imageView = (ImageView) item.findViewById(R.id.imgband);
        imageView.setTag(getItem(position).getImg());

        Glide.with(this.getContext())
                .load(getItem(position).getImg()).into(imageView);

        return (item);


    }
}
