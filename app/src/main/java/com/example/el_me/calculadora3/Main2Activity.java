package com.example.el_me.calculadora3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvDatos;
    EditText numrazhic;
    double cinco = 5;
    Button calcular;
//este es para hacer el calculo en la de perros chicos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        tvDatos = (TextView)findViewById(R.id.tvDatos);
        calcular = (Button)findViewById(R.id.calcular);
        numrazhic = (EditText)findViewById(R.id.numraz);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double otronum = Double.parseDouble(numrazhic.getText().toString());
                double resultado = otronum *cinco;


                tvDatos.setText("" +resultado +" gramos");
            }
        });





    }
}


