package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.ObtenerComponentes();

    }//Finaliza onCreate



    private void ObtenerComponentes(){

    }

    public void Next(View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }




}

