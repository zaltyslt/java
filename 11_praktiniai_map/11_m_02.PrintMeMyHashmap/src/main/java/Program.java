
import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {//©KS

	public static void printKeys(HashMap<String, String> hashmap) {

		for (Map.Entry<String, String> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

	public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
		for (Map.Entry<String, String> entry : hashmap.entrySet()) {
			if (entry.getKey().contains(text)) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
		for (Map.Entry<String, String> entry : hashmap.entrySet()) {
			if (entry.getKey().contains(text)) {
				System.out.println(entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new LinkedHashMap<>();
		hashmap.put("f.e", "for example");
		hashmap.put("etc.", "and so on");
		hashmap.put("i.e", "more precisely");
		printKeys(hashmap);
		System.out.println("---");
		printKeysWhere(hashmap, "i");
		System.out.println("---");
		printValuesOfKeysWhere(hashmap, ".e");
	}

}
