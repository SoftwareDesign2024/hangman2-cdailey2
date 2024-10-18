package game;

import util.DisplayWord;
import util.HangmanDictionary;

public abstract class ExecutionerTemplate {
    public String mySecretWord;
    public DisplayWord myDisplayWord;

    public ExecutionerTemplate(HangmanDictionary dictionary, int wordLength) {
        mySecretWord = getSecretWord(dictionary, wordLength);
        myDisplayWord = new DisplayWord(mySecretWord);
    }
    
    // GETTERS // 

    // Returns the secret word
    public String getSecretWord() {
        return mySecretWord;
    }
    
    // Returns the display word so far
    public DisplayWord getDisplayWord() {
        return myDisplayWord;
    }

    // Helper method to get a random secret word from the dictionary
    public String getSecretWord(HangmanDictionary dictionary, int wordLength) {
        return dictionary.getRandomWord(wordLength).toLowerCase();
    }
    
    // CLASS METHODS //

    // Updates the display word and returns true if the guessed letter is in the word
    public boolean checkGuessInSecret(char guess) {
        if (mySecretWord.indexOf(guess) >= 0) {
            myDisplayWord.update(guess, mySecretWord);
            return true;
        }
        return false;
    }
}
