package game;

public abstract class GuesserTemplate {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private StringBuilder myLettersLeftToGuess;
    private int myNumGuessesLeft;

    public GuesserTemplate(int numGuesses) {
        myNumGuessesLeft = numGuesses;
        myLettersLeftToGuess = new StringBuilder(ALPHABET);
    }
    
    // GETTERS //
    
    // Return the number of remaining guesses
    public int getRemainingGuesses() {
        return myNumGuessesLeft;
    }

    // Return the letters not yet guessed
    public String getLettersLeftToGuess() {
        return myLettersLeftToGuess.toString();
    }
    
    // CLASS METHODS //
    
    // Record that the specific letter was guessed
    private void recordGuess(int index) {
        myLettersLeftToGuess.deleteCharAt(index);
    }
    
    // Process the player's guess
    public void processGuess(char guess, ExecutionerTemplate executioner) { // name changed
        int index = myLettersLeftToGuess.indexOf("" + guess);
        if (index >= 0) {
            recordGuess(index);
            if (!executioner.checkGuessInSecret(guess)) {
                myNumGuessesLeft -= 1;
            }
        }
    }
    
    public abstract String makeGuess(); 
}
