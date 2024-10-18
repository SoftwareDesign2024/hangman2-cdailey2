import game.AutoGuesser;
import game.CheatedGuesser;
import game.CheatingComputerExecutioner;
import game.HangmanGame;
import game.InteractiveGuesser;
import game.NormalComputerExecutioner;
import game.UserExecutioner;
import util.HangmanDictionary;


/**
 * This class launches the Hangman game and plays once.
 * 
 * @author Michael Hewner
 * @author Mac Mason
 * @author Robert C. Duvall
 * @author Shannon Duvall
 */
public class Main {
    public static final String DICTIONARY = "data/lowerwords.txt";
    public static final int NUM_LETTERS = 6;
    public static final int NUM_MISSES = 8;


    public static void main (String[] args) {
    	
    	HangmanDictionary hangmanDictionary = new HangmanDictionary(DICTIONARY);
    	
    	// INTERACTIVE GUESSER VERSION OF HANGMAN WITH NORMAL COMPUTER EXECUTIONER //
    	NormalComputerExecutioner executioner = new NormalComputerExecutioner(hangmanDictionary, NUM_LETTERS);
    	InteractiveGuesser guesser = new InteractiveGuesser(NUM_MISSES);
    	new HangmanGame(hangmanDictionary, NUM_LETTERS, NUM_MISSES, executioner, guesser).play();
    	
    	// COMPUTER GUESSER VERSION OF HANGMAN WHERE USER IS EXECUTIONER //
//    	UserExecutioner userExecutioner = new UserExecutioner(hangmanDictionary, NUM_LETTERS);
//    	AutoGuesser autoGuesser = new AutoGuesser(NUM_MISSES);
//    	new HangmanGame(hangmanDictionary, NUM_LETTERS, NUM_MISSES, userExecutioner, autoGuesser).play();
    	
    	// CHEATED INTERACTIVE GUESSER VERSION OF HANGMAN WITH CHEATER COMPUTER EXECUTIONER //
//    	CheatingComputerExecutioner cheatingExecutioner = new CheatingComputerExecutioner(hangmanDictionary, NUM_LETTERS);
//    	CheatedGuesser cheatedGuesser = new CheatedGuesser(NUM_MISSES, cheatingExecutioner);
//    	new HangmanGame(hangmanDictionary, NUM_LETTERS, NUM_MISSES, cheatingExecutioner, cheatedGuesser).play();
    }
}
