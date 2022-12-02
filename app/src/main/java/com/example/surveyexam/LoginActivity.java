package com.example.surveyexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.surveyexam.R;

public class LoginActivity extends AppCompatActivity {
    Button continueB;
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


    }
    public void openNewActivity(){
        Intent intent = new Intent(this, SurveyActivity.class);
        startActivity(intent);
    }


}