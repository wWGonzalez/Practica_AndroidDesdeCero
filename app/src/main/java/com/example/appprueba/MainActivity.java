package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private Spinner spinner1;
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Componetes();
        this.Spiner();


    }//Finaliza onCreat this.obtenerComponentes();e


    //Etablecer Datos en Spiner
    private void Spiner(){
        String [] opciones = {"sumar","restar","multriplicar","dividir"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_item,opciones);
        spinner1.setAdapter(adapter);
    }

    //Obtener Componentes
    private void Componetes(){
        et1 = findViewById(R.id.txtPrimerNumero);
        et2 = findViewById(R.id.txtSegundoNumero);
        tv1 = findViewById(R.id.textViewResultado);
        spinner1 = findViewById(R.id.spinner);
    }//Finaliza Obtener Componetes


    public void Evaluar(View view){
        Integer num1 = Integer.parseInt(et1.getText().toString());
        Integer num2 = Integer.parseInt(et2.getText().toString());
        Integer resultado=0;

        String seleccion= spinner1.getSelectedItem().toString();
        if(seleccion.equals("sumar")){
            resultado = num1+num2;
            tv1.setText(resultado.toString());
        }else if(seleccion.equals("restar")){
             resultado=num1-num2;
            tv1.setText(resultado.toString());
        }else if(seleccion.equals("multriplicar")){
            resultado=num1*num2;
            tv1.setText(resultado.toString());
        }else if(seleccion.equals("dividir")){
            if(num2.equals(0)){
                Toast.makeText(this,"No se Puede dividir",Toast.LENGTH_SHORT).show();
            }
            else{
                resultado=num1/num2;
                tv1.setText(resultado.toString());
            }

        }


    }//Finaliza evaluar








}//Finaliza Clase
