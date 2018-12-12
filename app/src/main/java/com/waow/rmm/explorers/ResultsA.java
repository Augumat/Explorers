package com.waow.rmm.explorers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultsA extends AppCompatActivity
{
    /** The logging tag for this class. */
    private final static String TAG = "ResultsA";
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_a);
    
        getWindow().setEnterTransition(new Fade(Fade.MODE_IN));
        getWindow().setExitTransition(new Fade(Fade.MODE_OUT));
    
        AudioHandler.start(getApplicationContext(), 2);
        
        Button resetQuiz = findViewById(R.id.resetQuiz);
        resetQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "back to main");
                openActivityReset();
                return;
            }
        });
    }
    
    public void openActivityReset() {
        Intent openQuestion = new Intent(this, MainActivity.class);
        QuizHandler.reset();
        startActivity(openQuestion);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        AudioHandler.stop();
    }
}
