package com.waow.rmm.explorers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Question10 extends AppCompatActivity
{
    /** The logging tag for this class. */
    private final static String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        
        Button answerA = findViewById(R.id.answerA);
        answerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                Quiz.add("a");
                openActivityResults(Quiz.tally());
            }
        });
    
        Button answerB = findViewById(R.id.answerB);
        answerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                Quiz.add("bb");
                openActivityResults(Quiz.tally());
            }
        });
    
        Button answerC = findViewById(R.id.answerC);
        answerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                Quiz.add("ccc");
                openActivityResults(Quiz.tally());
            }
        });
    
        Button answerD = findViewById(R.id.answerD);
        answerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                Quiz.add("dddd");
                openActivityResults(Quiz.tally());
            }
        });
    }
    
    public void openActivityResults(int which) {
        Intent openResult;
        switch (which)
        {
            case 1:
                openResult = new Intent(this, ResultsA.class);
                break;
            case 2:
                openResult = new Intent(this, ResultsB.class);
                break;
            case 3:
                openResult = new Intent(this, ResultsC.class);
                break;
            case 4:
                openResult = new Intent(this, ResultsD.class);
                break;
            default:
                openResult = new Intent(this, ResultsA.class);
                break;
        }
        startActivity(openResult);
    }
}
