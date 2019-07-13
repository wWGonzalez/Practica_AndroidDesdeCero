package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//Finaliza onCreate

    public void botonGuate(View vew){
        Toast.makeText(this,"Pressed Guatemala",Toast.LENGTH_SHORT).show();
    }

    public void botonSalvador(View view){
        Toast.makeText(this,"Pressed Salvador",Toast.LENGTH_SHORT).show();
    }


}//Finaliza Clase
