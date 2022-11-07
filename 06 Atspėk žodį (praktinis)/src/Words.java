import java.util.Arrays;
import java.util.HashMap;

public class Words {// ©KS
	private char[] wordLetters;
	private String wordWord;
	private char[] guessed;
	private boolean letterGuessSuccess;
	private boolean wordGuessed;

	public Words() {
		letterGuessSuccess = false;
		wordGuessed = false;
		String[] words = { "Kilometras", "Respublika", "Traktorius", "Implementacija" };
		wordWord = words[(int) (Math.random() * (4 - 0)) + 0];
		wordLetters = wordWord.toCharArray();

		guessed = new char[wordLetters.length];
		for (int i = 0; i < guessed.length; i++) {
			guessed[i] = '_';
		}

	}

	public void print() {
	//	System.out.println(Arrays.toString(wordLetters));
	//	System.out.println(Arrays.toString(guessed));
		System.out.println();
		for(char letter: guessed) {
			System.out.print((letter + " ").toUpperCase());
		}
		System.out.println();
	}

	public HashMap<String, Boolean> guess(String value) {
		boolean letter = false;
		boolean word = false;
		HashMap<String, Boolean> turn = new HashMap<>();

		if (value.length() == 1) {
			// ar atspeta raide?
			letter = this.letterGuess(value.charAt(0)) ? true : false;

			// A. jei atspeta raide, ir tuo paciu zodis, msg kad atspetas zodis
			if (charsToString().equalsIgnoreCase(wordWord)) {

				turn.put("wordOrNot", true);
				turn.put("success", true);
				return turn;
			}
			// A. kitu atveju msg apie atspeta/neatspeta raide
			turn.put("wordOrNot", false); // msg - speta raide
			turn.put("success", letter); // msg - atspeta true/false
		}

		// jei spetas zodis, msg kad atspetas/neatspetas zodis
		if (value.length() > 1) {
			word = wordGuess(value) ? true : false;
			turn.put("wordOrNot", true);
			turn.put("success", word);
		}
		return turn;

	}

	private boolean letterGuess(char value) {
		boolean success = false;
		for (int i = 0; i < this.guessed.length; i++) {
			if (Character.toLowerCase(this.wordLetters[i]) == Character.toLowerCase(value)) {
				// jei atseta raide dar nebuvo atspeta, ja pridedam
				if (Character.toLowerCase(this.guessed[i]) != Character.toLowerCase(value)) {
					this.guessed[i] = this.wordLetters[i];
					success = true;
				} // kitu atveju manom kad atspeta nebuvo
			}
		}
		return success ? true : false;
	}

	private boolean wordGuess(String value) {
		if (this.wordWord.equalsIgnoreCase(value)) {
			this.guessed = value.toCharArray();
			return true;
		}
		return false;
	}

	private String charsToString() {
		return String.valueOf(guessed);
	}

	public String getWord() {
		return this.wordWord;
	}

}
