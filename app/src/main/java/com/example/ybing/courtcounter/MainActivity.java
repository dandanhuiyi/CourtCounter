package com.example.ybing.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamA(View view) {
        displayForTeamA(scoreTeamA += 1);
    }

    public void addTwoForTeamA(View view) {
        displayForTeamA(scoreTeamA += 2);
    }

    public void addOneThreeTeamA(View view) {
        displayForTeamA(scoreTeamA += 3);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamB(View view) {
        displayForTeamB(scoreTeamB += 1);
    }

    public void addTwoForTeamB(View view) {
        displayForTeamB(scoreTeamB += 2);
    }

    public void addOneThreeTeamB(View view) {
        displayForTeamB(scoreTeamB += 3);
    }

    public void resetTeamScore(View view) {

        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }
}
