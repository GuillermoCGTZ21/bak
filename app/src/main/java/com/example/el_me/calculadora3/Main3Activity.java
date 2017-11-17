package com.example.el_me.calculadora3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tvDatosmed;
    EditText numrazmed;
    double otrovalor = 7;
    Button calcularmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);

        tvDatosmed = (TextView)findViewById(R.id.tvDatosmed);
        calcularmed = (Button)findViewById(R.id.calcularmed);
        numrazmed = (EditText)findViewById(R.id.numrazmed);

        calcularmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double otronum = Double.parseDouble(numrazmed.getText().toString());
                double resultado = otronum *otrovalor;


                tvDatosmed.setText("" + resultado + " gramos");
            }
        });
    }
}
