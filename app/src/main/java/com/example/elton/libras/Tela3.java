package com.example.elton.libras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    private Button button4;
    private Intent intent;
    private Button button2;
    private Intent intent2;
    private Button button3;
    private Intent intent3;
    private Button button1;
    private Intent intent1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        intent = new Intent(this,Alfabeto.class);
        intent1 = new Intent(this,Teste.class);
        intent2 = new Intent(this, Numeros.class);
        intent3 = new Intent(this,Animais.class);

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent2);
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){

               startActivity(intent3);
           }
        });

        button1 = findViewById(R.id.buttonteste);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });


    }
}
