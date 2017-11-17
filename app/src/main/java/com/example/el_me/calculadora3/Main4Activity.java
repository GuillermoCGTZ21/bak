package com.example.el_me.calculadora3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView tvDatosgran;
    EditText numrazgran;
    double datogran = 8;
    Button calculargran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main4);

        tvDatosgran = (TextView)findViewById(R.id.tvDatosgran);
        calculargran = (Button)findViewById(R.id.calculargran);
        numrazgran = (EditText)findViewById(R.id.numrazgran);

        calculargran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double otronum = Double.parseDouble(numrazgran.getText().toString());
                double resultado = otronum *datogran;


                tvDatosgran.setText("" +resultado+ " gramos");
            }
        });





    }
}