/*
*
* This is a standared rock, paper, scissors program
* regular game, regular rules with a try and catch.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-01-01
*
* This is a rock paper scissors program.
*/

import java.util.Scanner;
/**
 * This is a rock, paper, scissors program.
 */

final class RockPaperScissors {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // identifying the strings.
        // rock, paper and scissors.
        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";
        final String botplayer = "(botPlayer)";

        // max number in the Math.Random generator.
        final int max = 3;
        final Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice, Rock, Paper, or Scissors: ");
        final String userInput = in.nextLine();

        // try and catch for invalid inputs.
        if (!userInput.equals(rock) && !userInput.equals(paper)
                    && !userInput.equals(scissors)) {
            System.out.println("Invalid Input");
        } else {
            // random bot choice.
            final int randomNumber = (int) (Math.random() * max);
            String botPlayer = "";
            if (randomNumber == 0) {
                botPlayer = rock;
            } else if (randomNumber == 1) {
                botPlayer = paper;
            } else if (randomNumber == 2) {
                botPlayer = scissors;
            }

            // program decides if bot, or user wins, using standared
            // Rock, Paper, Scissors rules.
            if (userInput.equals(botPlayer)) {
                System.out.println("It was a Tie!");
                System.out.println("The bot also played: " + botPlayer);
            } else if (userInput.equals(rock) && botPlayer.equals(paper)
                || userInput.equals(paper) && botPlayer.equals(scissors)
                || userInput.equals(scissors) && botPlayer.equals(rock)) {
                System.out.println("botPlayer Wins!");
                System.out.println("The bot chose: " + botPlayer);
            } else {
                System.out.println("User Wins!");
                System.out.println("The bot played: " + botPlayer);
            }
        }
        System.out.println("\nDone!");
    }
}
