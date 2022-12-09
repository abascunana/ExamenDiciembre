package com.example.surveyexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.surveyexam.R;
import com.google.android.material.textfield.TextInputEditText;

public class SignActivity extends AppCompatActivity {
    Button continueB;
    Button signB;
    TextInputEditText user;
    String text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        continueB = (Button) findViewById(R.id.cbutton);
        continueB.setActivated(false);

        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

openNewActivity();
            }});

         signB = (Button) findViewById(R.id.lbutton);
        signB.setActivated(false);
        signB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)   {
                {
                    user= (TextInputEditText) findViewById(R.id.user);
                    user.getText().toString();
                    if (user.getText().toString().length()>1){
                        if (user.getText().toString().contains("@")){
                            openNewActivity();
                        }
                    }


                }

        }});




}
    public void openNewActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
