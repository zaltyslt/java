
import java.util.ArrayList;

public class SimpleCollection {

	private String name;
	private ArrayList<String> elements;

	public SimpleCollection(String name) {
		this.name = name;
		this.elements = new ArrayList<>();
	}

	public void add(String element) {
		this.elements.add(element);
	}

	public ArrayList<String> getElements() {
		return this.elements;
	}

	@Override
	public String toString() {

		if (this.elements.size() > 0) {
			String answer = "The collection " + name + " has " + this.elements.size() + " element";
			answer = (this.elements.size() == 1) ? answer += ":\n" : (answer += "s:\n");

			for (String string : elements) {
				answer += string + "\n";
			}
			return answer.trim();
		}
		return "The collection " + name + " is empty.";
	}

}
