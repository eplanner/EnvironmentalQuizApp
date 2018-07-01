package com.example.android.environmentalquizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private static final String LOG_TAG = Activity2.class.getSimpleName();
    // Question 1
    RadioButton question1_option3;
    // Question 2
    EditText question2_answer;
    // Question 3
    CheckBox question3_option1;
    CheckBox question3_option2;
    CheckBox question3_option3;
    CheckBox question3_option4;
    // Question 4
    EditText question4_answer;
    // Question 5
    RadioButton question5_option2;
    // Question 6
    EditText question6_answer;
    // Question 7
    CheckBox question7_option1;
    CheckBox question7_option2;
    CheckBox question7_option3;
    CheckBox question7_option4;
    // Question 8
    EditText question8_answer;
    // Question 9
    RadioButton question9_option2;
    // Question 10
    EditText question10_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // to hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_2);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_option3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #3 (UNEP)
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_option3 = (RadioButton) this.findViewById(R.id.question1_option3);
        answer1 = question1_option3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is "Blue"
        //------------------------------------------------------------------------------------------
        String answer2;
        question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString().toLowerCase();
        if (answer2.equals("Blue")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers are #1 (Bush Burning) and #3 (Waste litering)
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_option1 = (CheckBox) this.findViewById(R.id.question3_option1);
        question3_option2 = (CheckBox) this.findViewById(R.id.question3_option2);
        question3_option3 = (CheckBox) this.findViewById(R.id.question3_option3);
        question3_option4 = (CheckBox) this.findViewById(R.id.question3_option4);
        answer3_choice1 = question3_option1.isChecked();
        answer3_choice2 = question3_option2.isChecked();
        answer3_choice3 = question3_option3.isChecked();
        answer3_choice4 = question3_option4.isChecked();
        if (answer3_choice1 && !answer3_choice2 && answer3_choice3 && !answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is "Green"
        //------------------------------------------------------------------------------------------
        String answer4;
        question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString().toLowerCase();
        if (answer4.equals("Green")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #2 "Nairobi"
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_option2 = (RadioButton) this.findViewById(R.id.question5_option2);
        answer5 = question5_option2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is "Spherical"
        //------------------------------------------------------------------------------------------
        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("Spherical")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answers are #3 (Earth) and #4 (Pluto)
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_option1 = (CheckBox) this.findViewById(R.id.question7_option1);
        question7_option2 = (CheckBox) this.findViewById(R.id.question7_option2);
        question7_option3 = (CheckBox) this.findViewById(R.id.question7_option3);
        question7_option4 = (CheckBox) this.findViewById(R.id.question7_option4);
        answer7_choice1 = question7_option1.isChecked();
        answer7_choice2 = question7_option2.isChecked();
        answer7_choice3 = question7_option3.isChecked();
        answer7_choice4 = question7_option4.isChecked();
        if (!answer7_choice1 && !answer7_choice2 && answer7_choice3 && answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is "Sky"
        //------------------------------------------------------------------------------------------
        String answer8;
        question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString().toLowerCase();
        if (answer8.equals("Sky")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers is #2 "H2O"
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        question9_option2 = (RadioButton) this.findViewById(R.id.question9_option2);
        answer9 = question9_option2.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is "Blue"
        //------------------------------------------------------------------------------------------
        String answer10;
        question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase();
        if (answer10.equals("Blue")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Congratulations! You scored 10 out of 10, Well done!";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10, You can do better";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
