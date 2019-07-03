package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private RadioButton rb1;
    private RadioButton rb2;
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.ObtenerValores();



    }//Finaliza onCreate

    public void ObtenerValores(){
        et1 = findViewById(R.id.txtPrimerNumero);
        et2 = findViewById(R.id.txtSegundoNumero);
        tv1 = findViewById(R.id.textViewResultado);

        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
    }

    public void Calcular(View view){
        Integer num1 = Integer.parseInt(et1.getText().toString());
        Integer num2 = Integer.parseInt(et2.getText().toString());

        Integer resultado;

        if (rb1.isChecked()==true){
            resultado = num1+num2;
            tv1.setText(resultado.toString());
        }
        else if(rb2.isChecked()==true){
            resultado = num1-num2;
            tv1.setText(resultado.toString());
        }

    }





}//Finaliza Clase
