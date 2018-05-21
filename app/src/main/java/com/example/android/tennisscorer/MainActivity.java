package com.example.android.tennisscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Games-The current starting value for Player 1 and Player 2.
     */
    int set1Plus1 = 0;
    int set2Plus1 = 0;
    int set3Plus1 = 0;
    int set1Plus12 = 0;
    int set2Plus12 = 0;
    int set3Plus12 = 0;

    /**
     * Increase the Set One Score for Player 1 by 1 game.
     */
    public void setOnePlusOne(View v) {
        set1Plus1 = set1Plus1 + 1;
        displaySetOnePlusOne(set1Plus1);
    }

    /**
     * Displays the given score for Player 1.
     */
    private void displaySetOnePlusOne (int set1Plus1) {
        TextView scoreView = findViewById(R.id.play_one_set_one);
        scoreView.setText(String.valueOf(set1Plus1));
    }

    /**
         * Increase the Set Two Score for Player 1 by 1 game.
         */
    public void setTwoPlusOne(View v) {
        set2Plus1 = set2Plus1 + 1;
        displayForSetTwoPlusOne(set2Plus1);
    }

    /**
     * Displays the set two for Player 1.
     */
    private void displayForSetTwoPlusOne(int set2Plus1) {
        TextView scoreView = findViewById(R.id.play_one_set_two);
        scoreView.setText(String.valueOf(set2Plus1));
    }

        /**
         * Increase the Set Three Score for Player 1 by 1 game.
         */
    public void setThreePlusOne(View v) {
        set3Plus1 = set3Plus1 + 1;
        displayForSetThreePlusOne(set3Plus1);
    }

    /**
     * Displays the 3rd set score for Player 1.
     */
    private void displayForSetThreePlusOne(int set3Plus1) {
        TextView scoreView = findViewById(R.id.play_one_set_three);
        scoreView.setText(String.valueOf(set3Plus1));
    }

    /**
     * PLAYER 2 -- SET SCORES BEGIN
     * Increase the Set One Score for Player 2 by 1 game.
     */
    public void playTwoSetOne(View v) {
        set1Plus12 = set1Plus12 + 1;
        displayForPlayTwoSetOne(set1Plus12);
    }

    /**
     * Displays the set one score for Player 2 by 1 game.
     */
    private void displayForPlayTwoSetOne(int set1Plus12) {
        TextView scoreView = findViewById(R.id.play_two_set_one);
        scoreView.setText(String.valueOf(set1Plus12));
    }

    /**
     * Increase the Set Two Score for Player 2 by 1 game.
     */
    public void playTwoSetTwo(View v) {
        set2Plus12 = set2Plus12 + 1;
        displayForPlayTwoSetTwo(set2Plus12);
    }

    /**
     * Displays the set two for Player 2.
     */
    private void displayForPlayTwoSetTwo(int set2Plus12) {
        TextView scoreView = findViewById(R.id.play_two_set_two);
        scoreView.setText(String.valueOf(set2Plus12));
    }

    /**
     * Increase the Set Three Score for Player 2 by 1 game.
     */
    public void playTwoSetThree(View v) {
        set3Plus12 = set3Plus12 + 1;
        displayForPlayTwoSetThree(set3Plus12);
    }

    /**
     * Displays the 3rd set score for Player 1.
     */
    private void displayForPlayTwoSetThree(int set3Plus12) {
        TextView scoreView = findViewById(R.id.play_two_set_three);
        scoreView.setText(String.valueOf(set3Plus12));
    }

    /**
     * Resets the sets scores to zero.
     */
    public void resetSetScore(View v) {
        set1Plus1 = 0;
        set2Plus1 = 0;
        set3Plus1 = 0;
        set1Plus12 = 0;
        set2Plus12 = 0;
        set3Plus12 = 0;
        displaySetOnePlusOne(set1Plus1);
        displayForSetTwoPlusOne(set2Plus1);
        displayForSetThreePlusOne(set3Plus1);
        displayForPlayTwoSetOne(set1Plus12);
        displayForPlayTwoSetTwo(set2Plus12);
        displayForPlayTwoSetThree(set3Plus12);
    }

        /**
         * _________________________________________________________Horizontal Line
         *
         * Points-The current starting value for Player 1.
         **/
        int scorePlayer1 = 0;

        /**
         * Points-The current starting value for Player 2.
         **/
        int scorePlayer2 = 0;

    /**
     * Increase the score for Player 1 by 1 point.
     */
    public void addOnePointForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Displays the given score for Player 1.
     **/
    public void displayForPlayer1(int score) {
        TextView scoreView = findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player 2 by 1 point.
     **/
    public void addOnePointForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Displays the given score for Player 2.
     **/
    public void displayForPlayer2(int score) {
        TextView scoreView = findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the scores to zero.
     **/
    public void resetScore(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }
}
