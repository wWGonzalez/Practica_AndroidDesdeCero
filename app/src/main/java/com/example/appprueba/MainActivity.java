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
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtPrimerNumero);
        et2 = findViewById(R.id.txtSegundoNumero);
        tv1 = findViewById(R.id.textViewResultado);

    }//Finaliza onCreate

    //metodo que realiza suma
    public void Suma(View view){
        //Convierte valores EditText a String
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        Integer num1 = Integer.parseInt(valor1); //Convierte valores a Ingeer
        Integer num2 = Integer.parseInt(valor2);

        Integer suma = num1+num2; //Suma valores

        String Resultado = String.valueOf(suma); //Convierte suma a String

        tv1.setText(Resultado);//Muestra el resultado de la suma
    }



}//Finaliza Clase
