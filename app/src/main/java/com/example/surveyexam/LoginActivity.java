package com.example.surveyexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import com.example.surveyexam.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    public static final String Phone = "phoneKey";
    public static final String Email = "emailKey";
    Button continueB;
    Button lbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        continueB = (Button) findViewById(R.id.cbutton);
        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity();
            }});


        lbutton = (Button) findViewById(R.id.lbutton);
        lbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity();
            }});


    }
    public void openNewActivity(){
        Intent intent = new Intent(this, SurveyActivity.class);
        startActivity(intent);
    }


}