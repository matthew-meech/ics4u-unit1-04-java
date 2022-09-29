/*
*
* This is a standared microwave program
* that will calculate the time it takes for certain foods.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-09-20
*
* This is a microwave time program.
*/

import java.util.Scanner;
/**
 * This is a microwave program.
 */

final class MicrowaveHeater {

    /**
     * This is the subs base time.
     */
    public static final double SUBTIME = 60;
    /**
     * This is the pizzas base time.
     */
    public static final double PIZZATIME = 45;
    /**
     * This is the soups base time.
     */
    public static final double SOUPTIME = 105;
    /**
     * This is the multiplier for two items.
     */
    public static final double TWOFOOD = 1.5;
    /**
     * This is the multiplier for three items.
     */
    public static final double THREEFOOD = 2;
    /**
     * This is the variable for a sub.
     */
    public static final String SUB = "sub";
    /**
     * This is the variable for pizza.
     */
    public static final String PIZZA = "pizza";
    /**
     * This is the variable for soup.
     */
    public static final String SOUP = "soup";
    /**
     * This is the variable for one.
     */
    public static final String ONE = "one";
    /**
     * This is the variable for two.
     */
    public static final String TWO = "two";
    /**
     * This is the variable for three.
     */
    public static final String THREE = "three";
    /**
     * This is the variable for 60 seconds.
     */
    public static final double SIXTY = 60;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private MicrowaveHeater() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // identifying the changing variables.
        // time, minutes, seconds
        double time = 0;
        double minutes = 0;
        double seconds = 0;

        // This is where you the program recives inputs.
        final Scanner firstInput = new Scanner(System.in);
        final Scanner numberInput = new Scanner(System.in);
        System.out.print("Enter your choice, sub, pizza, or soup: ");
        final String userInput = firstInput.nextLine();
        System.out.print("Enter the amount: ");
        final String amountNumber = numberInput.nextLine();

        // try and catch for invalid or valid inputs.
        if (userInput.equals(SUB) || userInput.equals(PIZZA)
            || userInput.equals(SOUP)) {

            // gets what item is inputted
            if (userInput.equals(SUB)) {
                time = SUBTIME;
            } else if (userInput.equals(PIZZA)) {
                time = PIZZATIME;
            } else if (userInput.equals(SOUP)) {
                time = SOUPTIME;
            }

            // calcultes time with amount and food
            if (amountNumber.equals(ONE) || amountNumber.equals(TWO)
                || amountNumber.equals(THREE)) {
                if (amountNumber.equals(TWO)) {
                    time = time * TWOFOOD;
                } else if (amountNumber.equals(THREE)) {
                    time = time * THREEFOOD;
                }
                // calculation for setting up time in minutes and seconds
                seconds = time / SIXTY;
                minutes = Math.floor(seconds);
                seconds = (seconds - minutes) * SIXTY;
                System.out.println("The " + userInput + " will be done in "
                    + minutes + " minutes " + seconds + " seconds!");

            // catches invalid number input
            } else {
                System.out.println("Invalid Number!");
            }
            // catches invalid word input
        } else {
            System.out.println("Invalid Food!");
        }
        System.out.println("\nDone!");
    }
}
