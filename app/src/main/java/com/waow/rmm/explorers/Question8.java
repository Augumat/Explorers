package com.waow.rmm.explorers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Question8 extends AppCompatActivity {

    final String TAG = "clickedAnswer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        Button answerA = findViewById(R.id.answerA);
        answerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked A");
                Quiz.add("a");
                openActivityResult();
            }
        });
        Button answerB = findViewById(R.id.answerB);
        answerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked B");
                Quiz.add("bb");
                openActivityResult();
            }
        });
        Button answerC = findViewById(R.id.answerC);
        answerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked C");
                Quiz.add("ccc");
                openActivityResult();
            }
        });
        Button answerD = findViewById(R.id.answerD);
        answerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked D");
                Quiz.add("dddd");
                openActivityResult();
            }
        });
    }
    public void openActivityResult() {
        Intent openResult = new Intent(this, Question9.class);
        startActivity(openResult);
    }
}
