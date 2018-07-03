package com.example.elton.libras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animais extends AppCompatActivity {

    private Button button1;
    private Button button2;

    private Intent intent1;
    private Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais);

        button1 = findViewById(R.id.buttoninicioan);
        button2 = findViewById(R.id.buttonproxan1);

        intent1 = new Intent(this,Tela3.class);
        intent2 = new Intent(this,Animais2.class);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });
    }
}
