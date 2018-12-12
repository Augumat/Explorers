package com.waow.rmm.explorers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question7 extends AppCompatActivity {
    /** The logging tag for this class. */
    private final static String TAG = "Question7";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
    
        getWindow().setEnterTransition(new Fade(Fade.MODE_IN));
        getWindow().setExitTransition(new Fade(Fade.MODE_OUT));
    
        //Music Player stuff
        
        Button answerA = findViewById(R.id.answerA);
        answerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked A");
                QuizHandler.add("a");
                openActivityResult();
            }
        });
        Button answerB = findViewById(R.id.answerB);
        answerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked B");
                QuizHandler.add("bb");
                openActivityResult();
            }
        });
        Button answerC = findViewById(R.id.answerC);
        answerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked C");
                QuizHandler.add("ccc");
                openActivityResult();
            }
        });
        Button answerD = findViewById(R.id.answerD);
        answerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked D");
                QuizHandler.add("dddd");
                openActivityResult();
            }
        });
    }
    public void openActivityResult() {
        Intent openResult = new Intent(this, Question8.class);
        startActivity(openResult);
    }
}
