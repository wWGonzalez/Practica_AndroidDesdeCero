package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private CheckBox check1;
    private CheckBox check2;
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.obtenerComponentes();
    }//Finaliza Obtener Componentes

   private void obtenerComponentes(){
        et1 = findViewById(R.id.txtPrimerNumero);
        et2 = findViewById(R.id.txtSegundoNumero);
        check1 = findViewById(R.id.checkBox);
        check2 = findViewById(R.id.checkBox2);
        tv1 = findViewById(R.id.textViewResultado);
   }//Finaliza





   //Funcion del boton para evalual checkbox

    public void Evaluar(View view){
        Integer num1 = Integer.parseInt(et1.getText().toString());
        Integer num2 = Integer.parseInt(et2.getText().toString());

        String resultado="";

        if(check1.isChecked() == true){
            Integer suma = num1 + num2;
            resultado = "Suma : "+suma+" / ";
        }
        if(check2.isChecked()){
            Integer resta = num1 - num2;
            resultado = resultado + "Resta :"+ resta + " / ";
        }

        tv1.setText(resultado);



    }





}//Finaliza Clase
