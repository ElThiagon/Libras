package com.example.elton.libras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animais2 extends AppCompatActivity {

    private Button button;
    private Intent intent;
    private Button button2;
    private Intent intent2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais2);

        button = findViewById(R.id.buttonantan2);
        intent = new Intent(this,Animais.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.buttonproxan2);
        intent2 = new Intent(this, Animais3.class);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });


    }
}
