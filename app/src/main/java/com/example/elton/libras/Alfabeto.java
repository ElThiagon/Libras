package com.example.elton.libras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Alfabeto extends AppCompatActivity {

    private Button button;
    private Intent intent;
    private Button button1;
    private Intent intent1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto);

        intent = new Intent(this, Alfabeto2.class);
        button = findViewById(R.id.buttonprox1);
        button.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        intent1 = new Intent(this, Tela3.class);
        button1 = findViewById(R.id.buttoninicio);
        button1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

    }
}
