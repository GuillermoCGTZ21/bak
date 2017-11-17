package com.example.el_me.calculadora3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    TextView tvDatosgig;
    EditText numrazgig;
    double datogig = 8;
    Button calculargig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main6);

        tvDatosgig = (TextView)findViewById(R.id.tvDatosgig);
        calculargig = (Button)findViewById(R.id.calculargig);
        numrazgig = (EditText)findViewById(R.id.numrazgig);

        calculargig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double otronum = Double.parseDouble(numrazgig.getText().toString());
                double resultado = otronum *datogig;


                tvDatosgig.setText("" +resultado+ " gramos");
            }
        });

    }
}
