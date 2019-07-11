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

    private TextView tv1; //TexView
    private ListView lv1; //ListView

    private String nombres [] = {"Samuel","Sofia","Marta","Valentina"};
    private String edades [] = {"18","17","24","20"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Componetes();


    }//Finaliza onCreate



    //Obtener Componentes
    private void Componetes(){
        tv1 = findViewById(R.id.textView1);
        lv1 = findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_nombres, nombres);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de "+lv1.getItemAtPosition(i)+" Es:"+edades[i]+" Años");
            }
        });
    }//Finaliza Obtener Componetes












}//Finaliza Clase
