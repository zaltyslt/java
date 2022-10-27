import java.util.ArrayList;

public class Suitcase {
	private int maxCaseWeight;
	private ArrayList<Item> items;

	public Suitcase(int maxWeight) {
		this.maxCaseWeight = maxWeight;
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		if (maxCaseWeight >= totalWeight() + item.getWeight()) {
			this.items.add(item);
		}
	}

	public int totalWeight() {
		int totalWeight = 0;
		for (Item item : this.items) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}

	
	public ArrayList<Item> listItems() {
		return this.items;
	}
	public void printItems() {
		for (Item item : this.items) {
			System.out.println(item);
		}

	}

	public Item heaviestItem() {
		if (items.size() > 0) {
			int maxItemWeight = 0;
			int position = 1;

			for (int i = 0; i < items.size(); i++) {
				if (maxItemWeight < items.get(i).getWeight()) {
					maxItemWeight = items.get(i).getWeight();
					position = i;
				}
			}

			return items.get(position);
		}
		return null;
	}

	@Override
	public String toString() { // x items (y kg)
		if (items.size() == 0) {
			return "no items (0 kg)";
		}
		return (items.size() == 1) ? "1 item (" + totalWeight() + " kg)"
				: items.size() + " items(" + totalWeight() + " kg)";
	}

}
