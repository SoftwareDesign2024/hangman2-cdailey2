package game;

public class CheatedGuesser extends InteractiveGuesser {
	
	CheatingComputerExecutioner cheatingExecutioner;
	
	public CheatedGuesser(int numGuesses, CheatingComputerExecutioner cheatingExecutioner) {
        super(numGuesses);
        this.cheatingExecutioner = cheatingExecutioner;
    }
	
	@Override
	public void processGuess(char guess, ExecutionerTemplate executioner) {
		cheatingExecutioner.cheat(guess);
		super.processGuess(guess, executioner);
	}
	
}
