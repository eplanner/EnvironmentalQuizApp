package com.example.android.environmentalquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void startQuiz(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        Button button = (Button) view;
        startActivity(new Intent(getApplicationContext(), Activity2.class));
    }
}
