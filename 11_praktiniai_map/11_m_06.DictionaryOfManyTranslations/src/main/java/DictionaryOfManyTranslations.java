import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {// ©KS

	private HashMap<String, ArrayList<String>> dict;

	public DictionaryOfManyTranslations() {
		dict = new HashMap<>();
	}

	public void add(String word, String translation) {
		if (dict.containsKey(word)) {
			ArrayList<String> wordList = dict.get(word);
			for (String entry : wordList) {
				if (entry.toLowerCase().equalsIgnoreCase(translation)) {
					return;
				}
			}
			wordList.add(translation);
		} else {
			dict.put(word, new ArrayList<String>() {
				{
					add(translation);
				}
			});
		}
	}

	public void remove(String word) {
		dict.remove(word);
	}

	public ArrayList<String> translate(String word) {
		if (dict.containsKey(word)) {
			return dict.get(word);
		}

		return new ArrayList<>();
	}

}
