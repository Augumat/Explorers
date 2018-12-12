package com.waow.rmm.explorers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ResultsD extends AppCompatActivity
{
    /** The logging tag for this class. */
    private final static String TAG = "ResultsD";
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_d);
        
        Button beginQuiz = findViewById(R.id.beginQuiz);
        beginQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "back to main");
                openActivityReset();
            }
        });
    }
    
    public void openActivityReset() {
        Intent openQuestion = new Intent(this, MainActivity.class);
        Quiz.reset();
        startActivity(openQuestion);
    }
}
