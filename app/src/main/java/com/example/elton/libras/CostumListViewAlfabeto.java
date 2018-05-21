package com.example.elton.libras;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;


import java.util.ArrayList;

public class CostumListViewAlfabeto extends ArrayAdapter<Alfabeto>{


    ArrayList<Integer> alfabetos;
    Context context;
    int resource;
    public CostumListViewAlfabeto(@NonNull Context context, int resource, @NonNull ArrayList<Integer> alfabetos) {
        super(context, resource);
        this.alfabetos = alfabetos;
        this.context = context;
        this.resource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater =
                    (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout, null,true);
        }
        Alfabeto alfabeto = getItem(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        return convertView;
    }
}
