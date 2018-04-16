package com.example.elton.libras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tela2 extends AppCompatActivity {

    private ImageButton button;
    private Intent intent;
    private Button button2;
    private Intent intent2;
    private Button button3;
    private Intent intent3;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        intent = new Intent(this,Tela3.class);
        intent2 = new Intent(this,Config.class);
        intent3 = new Intent(this,Teste.class);


        button = (ImageButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { startActivity(intent2); }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { startActivity(intent3); }
        });



    }
}