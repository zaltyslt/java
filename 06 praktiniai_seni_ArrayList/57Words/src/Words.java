import java.util.ArrayList;
import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();

		while (true) {
			String word = reader.nextLine();
			if (word.equals("")) {
				break;
			}
			words.add(word);
		}
		reader.close();
		for(String word: words) {
			System.out.println(word);
		}
	}
}
