package com.example.android.computerquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RadioButtonClicked1(View view) {
       boolean checked1 = ((RadioButton) view).isChecked();

    }
    public void RadioButtonClicked2(View view) {
        boolean checked2 = ((RadioButton) view).isChecked();

    }
    private int submitQuiz (int count) {
        EditText answerTwo = (EditText) findViewById(R.id.edit_text);
        String editText = answerTwo.getText().toString();
        if (editText.contains("analog")) {
            count = count + 1;
        }
        CheckBox answerThree1 = (CheckBox) findViewById(R.id.answer2_1);
        boolean ans21 = answerThree1.isChecked();
        CheckBox answerThree2 = (CheckBox) findViewById(R.id.answer2_2);
        boolean ans22 = answerThree2.isChecked();
        CheckBox answerThree3 = (CheckBox) findViewById(R.id.answer2_3);
        boolean ans23 = answerThree3.isChecked();
        if (ans21) {
            if (ans22){
                if (ans23){
                    count = count + 1;
                }
            }
        }
        Spinner spinner = (Spinner) findViewById(R.id.sort_by_spinner);
        int selected = spinner.getSelectedItemPosition();
        if (selected == 2){
            count = count + 1;

        }
        if (checked1) {
            count = count +1;
        }
        if (checked2) {
            count = count +1;
        }
        return count;

    }

    public void DisplayResults(View view) {
        int Score = submitQuiz(count);
        String finalMessage =  + Score + " of 5";
        Toast.makeText(this, finalMessage, Toast.LENGTH_LONG).show();
    }
    }

