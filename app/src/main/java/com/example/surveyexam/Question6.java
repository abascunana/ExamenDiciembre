package com.example.surveyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class Question6 extends AppCompatActivity {
    Button prevbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        SeekBar simpleSeekBar=(SeekBar)findViewById(R.id.simpleSeekBar); // initiate the Seek bar
        int seekBarValue= simpleSeekBar.getProgress(); // get progress value from the Seek bar
        prevbutton = (Button) findViewById(R.id.buttonp);

        prevbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPrevoius();
            }});
    }
    public void openPrevoius(){
        Intent intent = new Intent(this, Question5.class);
        startActivity(intent);
    }
}