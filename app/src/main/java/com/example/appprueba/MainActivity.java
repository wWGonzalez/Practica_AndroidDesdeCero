package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer matematica = 5;
        Integer fisica = 5;
        Integer lenguaje = 4;
        Integer promedio = 0;
        promedio = (matematica+fisica+lenguaje)/3;

        if (promedio >= 6){
            Toast.makeText(this,"Aprobado",Toast.LENGTH_SHORT).show();
        }
        else if(promedio <= 5){
            Toast.makeText(this,"Reprobado",Toast.LENGTH_SHORT).show();
        }
    }
}
