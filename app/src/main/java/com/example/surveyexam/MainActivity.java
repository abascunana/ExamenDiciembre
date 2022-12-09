package com.example.surveyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.SharedPreferences;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
Button nextbutton;
    Button logbutton;
TextInputEditText edt;
    String text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       logbutton = (Button) findViewById(R.id.lbutton);
        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         openNewActivity();

        }});

        nextbutton = (Button) findViewById(R.id.cbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        openNewActivity();

            }});

    }
    public void openNewActivity(){
        Intent intent = new Intent(this, SignActivity.class);
        startActivity(intent);
    }


}