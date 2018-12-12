package com.waow.rmm.explorers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question10 extends AppCompatActivity
{
    /** The logging tag for this class. */
    private final static String TAG = "Question10";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
    
        getWindow().setEnterTransition(new Fade(Fade.MODE_IN));
        getWindow().setExitTransition(new Fade(Fade.MODE_OUT));
    
        //Music Player stuff
        
        Button answerA = findViewById(R.id.answerA);
        answerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                QuizHandler.add("a");
                //Music player stuff
                try
                {
                    openActivityResults(QuizHandler.tally());
                }
                catch (IllegalArgumentException e)
                {
                    openActivityResults(0);
                }
            }
        });
    
        Button answerB = findViewById(R.id.answerB);
        answerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                QuizHandler.add("bb");
                //Music player stuff
                try
                {
                    openActivityResults(QuizHandler.tally());
                }
                catch (IllegalArgumentException e)
                {
                    openActivityResults(0);
                }
            }
        });
    
        Button answerC = findViewById(R.id.answerC);
        answerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                QuizHandler.add("ccc");
                //Music player stuff
                try
                {
                    openActivityResults(QuizHandler.tally());
                }
                catch (IllegalArgumentException e)
                {
                    openActivityResults(0);
                }
            }
        });
    
        Button answerD = findViewById(R.id.answerD);
        answerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "finish quiz");
                QuizHandler.add("dddd");
                //Music player stuff
                try
                {
                    openActivityResults(QuizHandler.tally());
                }
                catch (IllegalArgumentException e)
                {
                    openActivityResults(0);
                }
            }
        });
    }
    
    public void openActivityResults(int which) throws IllegalArgumentException {
        Intent openResult;
        switch (which)
        {
            case 0:
                startActivity(new Intent(this, MainActivity.class));
                return;
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
                throw new IllegalArgumentException();
        }
        startActivity(openResult);
    }
}
