package com.example.surveyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.checkbox.MaterialCheckBox;

public class Question2 extends AppCompatActivity {
    Button prevbutton;
    Button nextbutton;
    MaterialCheckBox mMaterialCheckBox;
    Boolean KEY_INDEX = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        if (savedInstanceState != null) {
            mMaterialCheckBox.setActivated(KEY_INDEX);
        }
        mMaterialCheckBox = (MaterialCheckBox) findViewById(R.id.checkbox1);
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
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);
        Log.i("e", "onSaveInstanceState");

       KEY_INDEX = this.mMaterialCheckBox.isChecked();

    }

    public void openPrevoius(){
        Intent intent = new Intent(this, SurveyActivity.class);
        startActivity(intent);
    }

}