package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.ObtenerComponentes();

    }//Finaliza onCreate






    private void ObtenerComponentes(){
        user = findViewById(R.id.txtUser);
        pass = findViewById(R.id.txtPassword);
    }

    public void Validar(View view){
        String user;
        String pass;

        user = this.user.getText().toString();
        pass = this.pass.getText().toString();


        //valida si contiene datos
        if (user.length()==0){
            Toast.makeText(this,"Debe ingresar usuario",Toast.LENGTH_SHORT).show();

        //valida si contiene datos
        }
        if(pass.isEmpty()){
            Toast.makeText(this,"Debe ingresar Password", Toast.LENGTH_SHORT).show();
        }


        //Si ambos contienen datos valida ingreso
        if(user.length()!=0 && pass.length()!=0){
            Toast.makeText(this,"Validando Ingreso",Toast.LENGTH_SHORT).show();
        }

    }



}

