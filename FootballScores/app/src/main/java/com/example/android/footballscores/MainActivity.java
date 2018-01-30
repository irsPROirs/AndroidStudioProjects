package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscores.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goalForTeamA(View v) {
        displayForTeamA(scoreTeamA = scoreTeamA+1);
    }
    public void foulTeamA(View v) {
        displayFoulTeamA(foulsTeamA = foulsTeamA+1);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }
    public void goalForTeamB(View v) {
        displayForTeamB(scoreTeamB = scoreTeamB+1);
    }
    public void foulTeamB(View v) {
        displayFoulTeamB(foulsTeamB = foulsTeamB+1);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetAll(View v) {
        displayForTeamA(scoreTeamA = 0);
        displayFoulTeamA(foulsTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
        displayFoulTeamB(foulsTeamB = 0);
    }
}
