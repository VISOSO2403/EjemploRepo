package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //VARIABLES
    TextView resultado;
    Button suma, resta;
    String nom;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.txtresul);
        suma = findViewById(R.id.btnsumar);
        resta = findViewById(R.id.btnrestar);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnsumar:
                num++;
                resultado.setText(num + "");
                break;
            case R.id.btnrestar:
                num--;
                resultado.setText(num + "");
                break;
        }
    }
}