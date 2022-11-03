import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int maxVal = 105;
		int[] values = new int[maxVal];
		for (int i = 0; i < maxVal; i++) {
			values[i] = (int) (Math.random() * (maxVal - 1)) + 1;
		}
		
//		 int[] values ={2,1,3,2,5,3,2};
//		int[] values = {14, 6, 11, 4, 9, 3, 2, 16, 12, 10, 19, 6, 19, 9, 12, 8, 11, 8, 11, 13};
		

		System.out.println(Arrays.toString(values));
		System.out.println("First dublicate: " + Dublicate.firstDublicate(values) +"\n");

		int maxChars = 100;
		char[] chars = new char[maxChars];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Dublicate.getRandomLowercaseLetter();
		}

		int lineBreak = 0;
		System.out.println("The lower case letters are:");
		for (char val : chars) {
			System.out.print(val + " ");

			if (++lineBreak % 20 == 0) {
				System.out.print("\n");
			}
		}

		lineBreak = 0;
		System.out.println("\nThe countOccurrences of each letter are:");
		for (var entry : Dublicate.countOccurrences(chars).entrySet()) {
			System.out.print(entry.getValue() + " " + entry.getKey() + " ");
			if (++lineBreak % 10 == 0) {
				System.out.print("\n");
			}
		}
	}

}
