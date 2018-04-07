package com.example.android.cocktailquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.drawable.cocktail);
    }



    public void onRadioButtonClicked(View view) {
        //calculateScore(RadioButton oneB, RadioButton twoA, RadioButton threeB, RadioButton fourA) {

        RadioButton rb, rb2, rb3, rb4;
        rb = (RadioButton) findViewById(R.id.one_b);
        rb2 = (RadioButton) findViewById(R.id.two_a);
        rb3 = (RadioButton) findViewById(R.id.three_b);
        rb4 = (RadioButton) findViewById(R.id.four_a);

        if (rb.isChecked()) {
            score = score + 1;
            return;
        }
        if (rb2.isChecked()) {
            score = score + 1;
            return;
        }
        if (rb3.isChecked()) {
            score = score + 1;
            return;
        }
        if (rb4.isChecked()) {
            score = score + 1;
            return;
        }

    }

    public void tallyScore(View view) {
        EditText name = (EditText) findViewById(R.id.name_input);
        String nameInput = name.getText().toString();
        CheckBox score_box = findViewById(R.id.notify_me_checkbox);
        boolean scoreBox = score_box.isChecked();
        Context context = getApplicationContext();
        CharSequence text = nameInput + ", Your score is " + score + " out of 4!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void reset(View v) {

        // This code will restart the quiz/activity
        Intent resetActivity = getIntent();
        finish();
        startActivity(resetActivity);
    }
}



