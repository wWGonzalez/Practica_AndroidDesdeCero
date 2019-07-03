package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtPrimerNumero);
        et2 = findViewById(R.id.txtSegundoNumero);
        et3 = findViewById(R.id.txtTercerNumero);
        tv1 = findViewById(R.id.textViewResultado);

    }//Finaliza onCreate


    //metodo que realiza suma
    public void Evaluar(View view){
        //Convierte valores EditText a String
        Integer num1 = Integer.parseInt(et1.getText().toString());
        Integer num2 = Integer.parseInt(et2.getText().toString());
        Integer num3 = Integer.parseInt(et3.getText().toString());

        Integer promedio = (num1+num2+num3)/3; //Suma valores
        if(promedio>=6){
            tv1.setText("Aprobado con: "+promedio.toString());

        }else if(promedio<6){
            tv1.setText("Reprobado con :"+promedio.toString());
        }

    }



}//Finaliza Clase
