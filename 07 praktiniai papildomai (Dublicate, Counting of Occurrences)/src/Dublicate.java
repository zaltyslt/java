import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Dublicate {

	public static int firstDublicate(int[] values) {
		HashSet<Integer> cheked = new HashSet<>();
		int minDistance = values.length;
		int firstDublicate = -1;

		for (int i = 0; i < values.length; i++) {
			if (cheked.contains(values[i])) {
				continue;
			}
			for (int j = i + 1; j < values.length; j++) {

				if (cheked.contains(values[j])) {
					continue;
				}
				if (values[i] == values[j]) {

					if (j - i < minDistance) {
						minDistance = j - i;
						firstDublicate = values[i];
						cheked.add(i);
						System.out.println(values[i] +": "+i+ "-"+ j);
						break;
					}
				}

			}
		}
		return firstDublicate;
	}

	public static char getRandomLowercaseLetter() {
		return (char) ('a' + Math.random() * ('z' - 'a' + 1));
	}

	public static HashMap<Character, Integer> countOccurrences(char[] chars) {
		HashMap<Character, Integer> table = new HashMap<>();
		for (int i = 0; i < chars.length; i++) {
			if (!table.containsKey(chars[i])) {
				table.put(chars[i], 1);
			} else {
				table.put(chars[i], table.get(chars[i]) + 1);
			}
		}

		return table;
	}
}
