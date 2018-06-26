package com.example.elton.libras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alfabeto4 extends AppCompatActivity {

    private Button button;
    private Intent intent;
    private Button button1;
    private Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto4);

        intent1 = new Intent(this, Alfabeto5.class);
        intent = new Intent(this, Alfabeto3.class);

        button1 = findViewById(R.id.buttonprox4);
        button1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        button = findViewById(R.id.buttonant4);
        button.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
