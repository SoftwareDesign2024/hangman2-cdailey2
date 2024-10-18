package game;

import util.ConsoleReader;

public class InteractiveGuesser extends GuesserTemplate {

	public InteractiveGuesser(int numGuesses) {
        super(numGuesses);
    }
	
	@Override
	public String makeGuess() {
		String guess = ConsoleReader.promptString("Make a guess: ");
		return guess;
	}
}