package com.example.android.cribbage_scoring_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scorePlayerA=0;
    int scorePlayerB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

//     Player A


    /**
     * Player A This method is called when the 3 of a kind button is clicked.
     */
    public void threeOfKindPlayerA(View view) {
        scorePlayerA=scorePlayerA+6;
        displayForPlayerA(scorePlayerA);
    }
    /**
     * Player A This method is called when the 4 of a kind button is clicked.
     */
    public void fourOfKindPlayerA(View view) {
        scorePlayerA=scorePlayerA+12;
        displayForPlayerA(scorePlayerA);
    }
    /**
     * Player A This method is called when the 2 point button is clicked.
     */
    public void twoPointPlayerA(View view) {
        scorePlayerA=scorePlayerA+2;
        displayForPlayerA(scorePlayerA);
    }
    /**
     * Player A This method is called when the Nobs point button is clicked.
     */
    public void onePointPlayerA(View view) {
        scorePlayerA=scorePlayerA+1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Player A These method is called for each of the run buttons when they are clicked.
     */
    public void runOfThreePlayerA(View view) {
        scorePlayerA = scorePlayerA + 3;
        displayForPlayerA(scorePlayerA);
    }

    public void runOfFourPlayerA(View view) {
        scorePlayerA = scorePlayerA + 4;
        displayForPlayerA(scorePlayerA);
    }

    public void runOfFivePlayerA(View view) {
        scorePlayerA = scorePlayerA + 5;
        displayForPlayerA(scorePlayerA);
    }

    public void runOfSixPlayerA(View view) {
        scorePlayerA = scorePlayerA + 6;
        displayForPlayerA(scorePlayerA);
    }

    public void runOfSevenPlayerA(View view) {
        scorePlayerA = scorePlayerA + 7;
        displayForPlayerA(scorePlayerA);
    }


//    Player B



    /**
     * Player B This method is called when the 2 point button is clicked.
     */
    public void twoPointPlayerB(View view) {
        scorePlayerB=scorePlayerB+2;
        displayForPlayerB(scorePlayerB);
    }
    /**
     * Player
     B This method is called when the Go & Nobs point button is clicked.
     */
    public void onePointPlayerB(View view) {
        scorePlayerB=scorePlayerB+1;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Player B This method is called when the 3 of a kind button is clicked.
     */
    public void threeOfKindPlayerB(View view) {
        scorePlayerB = scorePlayerB + 6;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Player B This method is called when the 4 of a kind button is clicked.
     */
    public void fourOfKindPlayerB(View view) {
        scorePlayerB = scorePlayerB + 12;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Player B These method is called for each of the run buttons when they are clicked.
     */
    public void runOfThreePlayerB(View view) {
        scorePlayerB = scorePlayerB + 3;
        displayForPlayerB(scorePlayerB);
    }

    public void runOfFourPlayerB(View view) {
        scorePlayerB = scorePlayerB + 4;
        displayForPlayerB(scorePlayerB);
    }

    public void runOfFivePlayerB(View view) {
        scorePlayerB = scorePlayerB + 5;
        displayForPlayerB(scorePlayerB);
    }

    public void runOfSixPlayerB(View view) {
        scorePlayerB = scorePlayerB + 6;
        displayForPlayerB(scorePlayerB);
    }

    public void runOfSevenPlayerB(View view) {
        scorePlayerB = scorePlayerB + 7;
        displayForPlayerB(scorePlayerB);
    }


//        Reset for both players
    /**
     * Reset Player
     Scores
     */
    public void resetScores(View view){
        scorePlayerA=0;
        scorePlayerB=0;
        displayForPlayerB(scorePlayerB);
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Displays the given score for Player
     A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player
     B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
