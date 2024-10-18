package game;

import util.ConsoleReader;
import util.HangmanDictionary;

public class UserExecutioner extends ExecutionerTemplate {
	public UserExecutioner(HangmanDictionary dictionary, int wordLength) {
		super(dictionary, wordLength);
	}
	
	@Override
	public String getSecretWord(HangmanDictionary dictionary, int wordLength) {
		String result = ConsoleReader.promptString("Choose a secret word that is " + wordLength + " letters long: ");
        while (! dictionary.contains(result, wordLength)) {
            result = ConsoleReader.promptString("That word is not recognized, please choose another: ");
        }
        return result;
	}
}
