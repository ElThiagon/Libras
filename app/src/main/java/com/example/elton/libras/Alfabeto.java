package com.example.elton.libras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Alfabeto extends AppCompatActivity {

    ListView lv_Alfabeto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto);
        ArrayList<Integer> array_image = new ArrayList<>();
        array_image.add(R.mipmap.images_a);
        array_image.add(R.mipmap.images_b);
        array_image.add(R.mipmap.images_c);
        array_image.add(R.mipmap.images_d);
        array_image.add(R.mipmap.images_e);
        array_image.add(R.mipmap.images_f);
        array_image.add(R.mipmap.images_g);
        array_image.add(R.mipmap.images_h);
        array_image.add(R.mipmap.images_i);
        array_image.add(R.mipmap.images_j);
        array_image.add(R.mipmap.images_k);
        array_image.add(R.mipmap.images_l);
        array_image.add(R.mipmap.images_m);
        array_image.add(R.mipmap.images_n);
        array_image.add(R.mipmap.images_o);
        array_image.add(R.mipmap.images_p);
        array_image.add(R.mipmap.images_q);
        array_image.add(R.mipmap.images_r);
        array_image.add(R.mipmap.images_s);
        array_image.add(R.mipmap.images_t);
        array_image.add(R.mipmap.images_u);
        array_image.add(R.mipmap.images_v);
        array_image.add(R.mipmap.images_w);
        array_image.add(R.mipmap.images_x);
        array_image.add(R.mipmap.images_y);
        array_image.add(R.mipmap.images_z);
        System.out.println("-------------------------------------------------------------");
        lv_Alfabeto = (ListView) findViewById(R.id.lv_Alfabeto);
        CostumListViewAlfabeto alfabeto = new CostumListViewAlfabeto(getApplicationContext(),
                R.layout.custom_list_layout,array_image);
        lv_Alfabeto.setAdapter(alfabeto);
        System.out.println("-------------------------------------------------------------");
    }
}
