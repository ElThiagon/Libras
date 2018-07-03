package com.example.elton.libras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alfabeto5 extends AppCompatActivity {

    private Button button;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto5);

        intent = new Intent(this, Alfabeto4.class);

        button = findViewById(R.id.buttonant5);
        button.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
