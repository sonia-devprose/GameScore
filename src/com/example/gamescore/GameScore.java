package com.example.gamescore;

public class GameScore {

  public static void main (String[] args)
    {
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        System.out.println("Demonstrating Implicit vs Explicit Casting:");
        // Step 1: implicit casting
        float intermediateResult;
        // Integer division
        intermediateResult = userScore / maxScore * 100;
        System.out.println(intermediateResult);

        // Step 2: explicit casting
        // Proper float division
        float percentage;
        percentage = 100 * (float) (userScore)/maxScore;
        System.out.println(percentage);


    }
}
