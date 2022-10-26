
public class Item {

	private String name;
	private int weight;

	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "name + ("+weight+" kg)";
	}

}
