/*
 * This program plays Rock, Paper, Scissors with the user.
 *
 * @author  Roman Cernetchi
 * @version 1.0
 * @since   2021-12-02
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
* This class generates a random choice and goes against the user.
*/
final class RckPprSci {

    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private RckPprSci() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Generates a random number.
    *
    * @return This function returns the random choice of the computer.
    *
    */
    private static String compPlay() {

        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";

        final int lowerNum = 0;
        final int higherNum = 2;

        final int randomInt = new Random().nextInt(higherNum) + lowerNum;
        String compPlay = "";

        switch (randomInt) {
            case 0:
                compPlay = rock;
                break;
            case 1:
                compPlay = paper;
                break;
            case 2:
                compPlay = scissors;
                break;
            default:
                break;
        }

        return compPlay;
    }

    /**
    * Checks to see who won the game.
    *
    * @param userChoice is the user input.
    * @param compPlay is the computer's random choice.
    * @return This function returns the random choice of the computer.
    *
    */
    private static String whoWins(
            final String userChoice, final String compPlay) {

        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";

        final String whoWins;

        if (userChoice.equals(compPlay)) {
            whoWins = "It was a tie. ";
        } else if (rock.equals(userChoice) && scissors.equals(compPlay)
                   || scissors.equals(userChoice) && paper.equals(compPlay)
                   || paper.equals(userChoice) && rock.equals(compPlay)) {

            whoWins = "You won! ";
        } else {
            whoWins = "You lost, try again!";
        }

        return whoWins;
    }

    /**
     * Calculates and outputs the energy generated from a certain amount of
     * mass.
     *
     * @param args No args will be used.
     * @throws IOException if there is anything wrong with the user input.
     *
     * */
    public static void main(final String[] args) {

        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";

        final String userChoice;
        final String compPlay;
        final String whoWins;

        try {
            // User prompt
            System.out.print("Please enter a move(rock, paper, scissors): ");

            // Gathers and parses input to a String
            userChoice = new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine().toLowerCase();

            switch (userChoice) {
                case rock: break;
                case paper: break;
                case scissors: break;
                default: throw new IOException();
            }

            compPlay = compPlay();

            whoWins = whoWins(userChoice, compPlay);
            System.out.println(
                    whoWins + "The computer played " + compPlay + ".");

        } catch (IOException exception) {
            // Outputs error message
            System.out.println("Please enter a correct input.\n");
        }

        System.out.println("\nDone.");
    }

}
