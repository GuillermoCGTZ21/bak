package com.example.el_me.calculadora3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Main5Activity extends AppCompatActivity {

    public void buttonClicked(View view) {
        if (view.getId() == R.id.razapequeña) {
            Intent razapeque = new Intent(Main5Activity.this, Main2Activity.class);
            startActivity(razapeque);
        } else if (view.getId() == R.id.razamediana) {
            Intent razamedi = new Intent(Main5Activity.this, Main3Activity.class);
            startActivity(razamedi);
        } else if (view.getId() == R.id.razagrande) {
            Intent razagran = new Intent(Main5Activity.this, Main4Activity.class);
            startActivity(razagran);
        }else if(view.getId() == R.id.razagigante){
            Intent razagiga = new Intent(Main5Activity.this, Main6Activity.class);
            startActivity(razagiga);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}
