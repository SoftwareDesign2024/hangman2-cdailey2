package game;

import util.HangmanDictionary;


/**
 * This class represents the traditional word-guessing game Hangman
 * that plays interactively with the user.
 *
 * @author Robert C. Duvall
 */
public class HangmanGame extends HangManGameTemplate{
//    private Guesser guesser;
//    private Executioner executioner;

    public HangmanGame(HangmanDictionary dictionary, int wordLength, int numGuesses, ExecutionerTemplate executioner, GuesserTemplate guesser) {
        // Create Guesser and Executioner
    	super(dictionary, wordLength, numGuesses, executioner, guesser);

    }

}
