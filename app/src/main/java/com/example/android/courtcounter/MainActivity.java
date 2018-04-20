package com.example.android.courtcounter;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increment3TeamA(View view) {
        int score3 = 3;
        scoreTeamA = scoreTeamA + score3;
        displayForTeamA(scoreTeamA);
    }
    public void increment2TeamA(View view) {
        int score2 = 2;
        scoreTeamA = scoreTeamA + score2;
        displayForTeamA(scoreTeamA);
    }
    public void increment1TeamA(View view) {
        int score1 = 1;
        scoreTeamA = scoreTeamA + score1;
        displayForTeamA(scoreTeamA);
    }

    public void increment3TeamB(View view){
        int score3 = 3;
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void increment2TeamB(View view){
        int score2 = 2;
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void increment1TeamB(View view){
        int score1 = 1;
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
