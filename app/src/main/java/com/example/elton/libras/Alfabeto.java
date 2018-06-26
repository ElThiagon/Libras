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

    }
}
