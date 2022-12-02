package com.example.surveyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                edt = (TextInputEditText) findViewById(R.id.textInputEditText);
                if (edt.getText().toString().length()>1){
                    if (edt.getText().toString().contains("@")){
                        openNewActivity();
                    }
                }


        }});

        nextbutton = (Button) findViewById(R.id.cbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt = (TextInputEditText) findViewById(R.id.textInputEditText);
                 edt.getText().toString();
                if (edt.getText().toString().length()>1){
                    if (edt.getText().toString().equals("mail@s")){
                        openNewActivity2();
                    }
                }


            }});

    }
    public void openNewActivity(){
        Intent intent = new Intent(this, SignActivity.class);
        startActivity(intent);
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, SurveyActivity.class);
        startActivity(intent);
    }


}