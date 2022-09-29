/*
*
* This is a standared diceroll random number
* guessing program.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-09-23
*
* This is a diceroll guessing program
*/

import java.util.Scanner;
/**
 * This is a diceroll program.
 */

final class DiceRoll {

    /**
     * This is the max of the random number.
     */
    public static final double MAX = 6;
    /**
     * This is the min of the random number.
     */
    public static final double MIN = 1;
    /**
     * This is your string.
     */
    public static final String SENTENCE1 = "This is your ";
    /**
     * Attempt string.
     */
    public static final String SENTENCE2 = " attempt!";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private DiceRoll() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // identifying the changing variables.
        // randomNumber, counter
        final double randomNumber = (int) (Math.random() * MAX + MIN);
        double counter = 1;

        // This is the loop that will run till a break occurs, either
        // when you guess the right number or when the user inputs
        // a string that is invalid.
        while (true) {
            // try and catch for invalid or valid inputs.
            try {
                // This is where the user makes their inputs.
                final Scanner firstInput = new Scanner(System.in);
                System.out.print("Enter your number (min: 1) (max: 6) ");
                final double userInput = firstInput.nextDouble();

                // goes through ifs to see if the input equals any
                // of these scenarios.
                if (userInput > MAX || userInput < MIN) {
                    System.out.println("Invalid Number!");
                } else {
                    if (userInput == randomNumber) {
                        System.out.println("You Guessed Correct!");
                        System.out.println("This was your " + counter
                                        + SENTENCE2);
                        break;
                    } else if (userInput < randomNumber) {
                        System.out.println("You Guessed To Low!");
                        System.out.println(SENTENCE1 + counter + SENTENCE2);
                    } else if (userInput > randomNumber) {
                        System.out.println("You Guessed To High!");
                        System.out.println(SENTENCE1 + counter + SENTENCE2);
                    }
                    counter = counter + 1;
                }
                // This catches invalid inputs.
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid Input!");
                break;
            }
        }
        System.out.println("\nDone!");
    }
}
