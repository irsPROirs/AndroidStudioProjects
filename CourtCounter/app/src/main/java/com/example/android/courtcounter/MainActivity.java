package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA = 0;
int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeForTeamA(View v) {
        displayForTeamA(scoreTeamA = scoreTeamA+3);
    }
    public void addTwoForTeamA(View v) {
        displayForTeamA(scoreTeamA = scoreTeamA+2);
    }
    public void addOneForTeamA(View v) {
        displayForTeamA(scoreTeamA = scoreTeamA+1);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View v) {
        displayForTeamB(scoreTeamB = scoreTeamB+3);
    }
    public void addTwoForTeamB(View v) {
        displayForTeamB(scoreTeamB = scoreTeamB+2);
    }
    public void addOneForTeamB(View v) {
        displayForTeamB(scoreTeamB = scoreTeamB+1);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetAll(View v) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }
}
