package com.example.elton.libras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alfabeto2 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Intent intent1;
    private Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto2);

        intent1 = new Intent(this, Alfabeto3.class);
        intent2 = new Intent(this, Alfabeto.class);

        button1 = findViewById(R.id.buttonprox2);
        button1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        button2 = findViewById(R.id.buttonant);
        button2.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent2);
            }
        });


    }
}
