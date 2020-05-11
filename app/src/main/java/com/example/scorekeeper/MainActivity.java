package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForA;
    int foulForA;
    int scoreForB;
    int foulForB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void displayScoreForTeamA(int score){
       TextView scoreValue = findViewById(R.id.text_team_a_score);
       scoreValue.setText(String.valueOf(score));
   }

    public void displayFoulForTeamA(int foul){
        TextView foulValue = findViewById(R.id.text_team_a_foul);
        foulValue.setText(String.valueOf(foul));
    }

    public void displayScoreForTeamB(int score){
        TextView scoreValueB = findViewById(R.id.text_team_b_score);
        scoreValueB.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int foul){
        TextView scoreValueB = findViewById(R.id.text_team_b_foul);
        scoreValueB.setText(String.valueOf(foul));
    }

    public void reset(){
        scoreForA = 0;
        scoreForB = 0;
        foulForA = 0;
        foulForB = 0;
        displayScoreForTeamA(scoreForA);
        displayFoulForTeamA(foulForA);
        displayScoreForTeamB(scoreForB);
        displayFoulForTeamB(foulForB);
    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.button_team_a_goal:
                scoreForA++;
                displayScoreForTeamA(scoreForA);
                break;
            case R.id.button_team_a_foul:
                foulForA++;
                displayFoulForTeamA(foulForA);
                break;
            case R.id.button_team_b_goal:
                scoreForB++;
                displayScoreForTeamB(scoreForB);
                break;
            case R.id.button_team_b_foul:
                foulForB++;
                displayFoulForTeamB(foulForB);
                break;
            case R.id.button_reset:
                reset();
                break;
        }
    }
}
