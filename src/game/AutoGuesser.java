package game;

public class AutoGuesser extends GuesserTemplate {
	private static final String LETTERS_ORDERED_BY_FREQUENCY = "etaoinshrldcumfpgwybvkxjqz";
	private String myLetters;
	private int myIndex;

	public AutoGuesser(int numGuesses) {
        super(numGuesses);
        myLetters = LETTERS_ORDERED_BY_FREQUENCY;
        myIndex = 0;
    }
	
	@Override
	public String makeGuess() {
		return Character.toString(myLetters.charAt(myIndex++));
	}
	
}
