package com.google.ar.core.examples.java.helloar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Test extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
//        ArrayList<Float> glXlist = (ArrayList<Float>) getIntent().getSerializableExtra("X_key");
//        ArrayList<Float> glYlist = (ArrayList<Float>) getIntent().getSerializableExtra("Y_key");
//        ArrayList<Float> glZlist = (ArrayList<Float>) getIntent().getSerializableExtra("Z_key");
        ArrayList<Float> glStorelist = (ArrayList<Float>) getIntent().getSerializableExtra("Store_key");
        int glStoreSize = glStorelist.size();


        float[] vertex = new float[6];

        for (int i = 0; i < 6; i++) {
            vertex[i] = glStorelist.get(i);
        }

        textView.append(Arrays.toString(vertex));

//        for(Float number : glStorelist){
//            String num = number.toString();
//            int index = glStorelist.indexOf(number);
//            textView.append("float array Element at : " + index + " : " + num + "\r\n");
//        }


    }
}