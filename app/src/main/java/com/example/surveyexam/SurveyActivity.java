package com.example.surveyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.checkbox.MaterialCheckBox;

import java.util.ArrayList;

public class SurveyActivity extends AppCompatActivity {

    Button nextbutton;
    Button prevbutton;
    ArrayList<Button> mButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        MaterialCheckBox mMaterialCheckBox = (MaterialCheckBox) findViewById(R.id.checkbox1);
        nextbutton = (Button) findViewById(R.id.button);
        nextbutton.setEnabled(false);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity();
            }});

        mMaterialCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialCheckBox.setActivated(!nextbutton.isActivated());
                if (mMaterialCheckBox.isChecked()){
                    nextbutton.setEnabled(true);
                }
                else {
                    nextbutton.setEnabled(false);
                }
            }});
        prevbutton = (Button) findViewById(R.id.buttonp);

        prevbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPrevoius();
            }});
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }

    public void openPrevoius(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}