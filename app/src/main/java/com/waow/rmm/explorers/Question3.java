package com.waow.rmm.explorers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question3 extends AppCompatActivity {
    /** The logging tag for this class. */
    private final static String TAG = "Question3";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    
        getWindow().setEnterTransition(new Fade(Fade.MODE_IN));
        getWindow().setExitTransition(new Fade(Fade.MODE_OUT));
    
        //Music Player stuff
        
        Button answerA = findViewById(R.id.answerA);
        answerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked A");
                QuizHandler.add("a");
                //Music player stuff
                openActivityResult();
            }
        });
        Button answerB = findViewById(R.id.answerB);
        answerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked B");
                QuizHandler.add("bb");
                //Music player stuff
                openActivityResult();
            }
        });
        Button answerC = findViewById(R.id.answerC);
        answerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked C");
                QuizHandler.add("ccc");
                //Music player stuff
                openActivityResult();
            }
        });
        Button answerD = findViewById(R.id.answerD);
        answerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked D");
                QuizHandler.add("dddd");
                //Music player stuff
                openActivityResult();
            }
        });
    }
    public void openActivityResult() {
        Intent openResult = new Intent(this, Question4.class);
        startActivity(openResult);
    }
}
