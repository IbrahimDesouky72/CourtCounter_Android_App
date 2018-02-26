package com.example.andriod.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore=0;
    int teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void add3PointsForTeamA(View view){
        teamAScore+=3;
        displayForTeamA(teamAScore);
    }

    public void add2PointsForTeamA(View view){
        teamAScore+=2;
        displayForTeamA(teamAScore);
    }

    public void add1PointForTeamA(View view){
        teamAScore+=1;
        displayForTeamA(teamAScore);
    }

    private void displayForTeamA(int number){
        TextView scoreText=(TextView)findViewById(R.id.score);
        scoreText.setText(""+number);

    }


    public void add3PointsForTeamb(View view){
        teamBScore+=3;
        displayForTeamB(teamBScore);
    }

    public void add2PointsForTeamB(View view){
        teamBScore+=2;
        displayForTeamB(teamBScore);
    }

    public void add1PointForTeamB(View view){
        teamBScore+=1;
        displayForTeamB(teamBScore);
    }

    private void displayForTeamB(int number){
        TextView scoreText=(TextView)findViewById(R.id.scoreTeamb);
        scoreText.setText(""+number);

    }

    public void resetScore(View view){
        teamAScore=0;
        teamBScore=0;
        displayForTeamB(teamBScore);
        displayForTeamA(teamAScore);


    }
}
