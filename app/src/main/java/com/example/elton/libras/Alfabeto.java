package com.example.elton.libras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Alfabeto extends AppCompatActivity {

    ListView lv_Alfabeto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("----------------------------->");
        setContentView(R.layout.activity_alfabeto);
    }
}
