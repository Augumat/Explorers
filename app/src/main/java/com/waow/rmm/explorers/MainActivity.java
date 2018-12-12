package com.waow.rmm.explorers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    /** The logging tag for this class. */
    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        getWindow().setEnterTransition(new Fade(Fade.MODE_IN));
        getWindow().setExitTransition(new Fade(Fade.MODE_OUT));
        
        //Music Player stuff
        
        Button beginQuiz = findViewById(R.id.beginQuiz);
        beginQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "begin quiz");
                //Music player stuff
                openActivityQuestion();
            }
        });
    }
    
    public void openActivityQuestion() {
        Intent openQuestion = new Intent(this, Question1.class);
        startActivity(openQuestion);
    }
}
