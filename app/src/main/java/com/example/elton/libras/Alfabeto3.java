package com.example.elton.libras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alfabeto3 extends AppCompatActivity {

    private Button button;
    private Intent intent;
    private Button button1;
    private Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto3);

        intent1 = new Intent(this, Alfabeto4.class);
        intent = new Intent(this, Alfabeto2.class);

        button1 = findViewById(R.id.buttonprox3);
        button1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        button = findViewById(R.id.buttonant3);
        button.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
