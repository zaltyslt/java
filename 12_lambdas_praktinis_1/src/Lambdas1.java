
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

public class Lambdas1 {
	/**
	 * Run the exercises to ensure we got the right answers
	 */
	public void runExercises() {
		System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
		System.out.println("Running exercise 1 solution...");
		exercise1();
		System.out.println("Running exercise 2 solution...");
		exercise2();
    System.out.println("Running exercise 3 solution...");
    exercise3();
    System.out.println("Running exercise 4 solution...");
    exercise4();
//    System.out.println("Running exercise 5 solution...");
//    exercise5();
	}

	/**
	 * All exercises should be completed using Lambda expressions and the new
	 * methods added to JDK 8 where appropriate. There is no need to use an explicit
	 * loop in any of the code. Use method references rather than full lambda
	 * expressions wherever possible.
	 */
	/**
	 * Exercise 1
	 *
	 * Create a string that consists of the first letter of each word in the list of
	 * Strings provided.
	 */
	private void exercise1() {
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

		StringBuilder string = new StringBuilder();
//  for(String word: list) { string.append(word.charAt(0));}
		list.forEach(word -> string.append(word.charAt(0)));
		// for(String word: list) { System.out.println(string);}
		// list.forEach(System.out::println);
		System.out.println("Exercise 1 rezult " + string);

	}

	/**
	 * Exercise 2
	 *
	 * Remove the words that have odd lengths from the list.
	 */
	private void exercise2() {
		List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
		list.removeIf(word -> word.length() % 2 != 0);

  		list.forEach(word -> System.out.println(word));
		// list.forEach( System.out::println);

//		str1.removeIf(x -> str2.contains(x)); 
		/* YOUR CODE HERE */

	}

//
//	/**
//	 * Exercise 3
//	 *
//	 * Replace every word in the list with its upper case equivalent.
//	 */
	private void exercise3() {
		List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
		
//		list.replaceAll(word ->word.toUpperCase());
		list.replaceAll(String::toUpperCase);
		list.forEach(System.out::println);

		/* YOUR CODE HERE */
	}

//	/**
//	 * Exercise 4
//	 *
//	 * Convert every key-value pair of the map into a string and append them all
//	 * into a single string, in iteration order.
//	 */
	private void exercise4() {
		Map<String, Integer> map = new TreeMap<>();
		map.put("c", 3);
		map.put("b", 2);
		map.put("a", 1);
		StringBuilder strinG = new StringBuilder();
		//(x, y) -> System.out.println(x + y);
		map.forEach((key, value) -> strinG.append(key+value));
		System.out.println(strinG);

		/* YOUR CODE HERE */
	}
//
	/**
	 * Main entry point for application
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Lambdas1 lesson = new Lambdas1();
		lesson.runExercises();
		
	}
}
