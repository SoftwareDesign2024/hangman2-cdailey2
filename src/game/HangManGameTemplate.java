package game;

import util.HangmanDictionary;

public abstract class HangManGameTemplate {
	
	protected ExecutionerTemplate executioner;
	protected GuesserTemplate guesser;
	
	public HangManGameTemplate(HangmanDictionary dictionary, int wordLength, int numGuesses, ExecutionerTemplate executioner, GuesserTemplate guesser) {
        // Create Guesser and Executioner
        this.executioner = executioner;
        this.guesser = guesser;
    }

    // Play one complete game
    public void play() {
        boolean gameOver = false;
        while (!gameOver) {
            printStatus();
            String guess = guesser.makeGuess();
            if (guess.length() == 1 && Character.isAlphabetic(guess.charAt(0))) {
                guesser.processGuess(guess.toLowerCase().charAt(0), executioner);
                if (isGameLost()) {
                    System.out.println("YOU ARE HUNG!!!");
                    gameOver = true;
                } else if (isGameWon()) {
                    System.out.println("YOU WIN!!!");
                    gameOver = true;
                }
            } else {
                System.out.println("Please enter a single letter ...");
            }
        }
        System.out.println("The secret word was " + executioner.getSecretWord());
    }

    // Check if the game is won
    private boolean isGameWon() {
    	String displayWordWithSpaces = executioner.getDisplayWord().toString();
    	// remove spaces
    	String displayWord = displayWordWithSpaces.replace(" ", "");
    	
    	String secretWord = executioner.getSecretWord();
    	
        return displayWord.equals(secretWord);
    }
    
    // Check if the game is lost
    private boolean isGameLost() {
    	boolean hasNoRemainingGuesses = guesser.getRemainingGuesses() == 0;
    	return hasNoRemainingGuesses;
    }
    
    
    // Print the game status
    private void printStatus() {
        System.out.println(executioner.getDisplayWord());
        System.out.println("# misses left = " + guesser.getRemainingGuesses());
        System.out.println("letters not yet guessed = " + guesser.getLettersLeftToGuess());
        // NOT PUBLIC, but makes it easier to test
        System.out.println("*** " + executioner.getSecretWord());
        System.out.println();
    }
    
}
