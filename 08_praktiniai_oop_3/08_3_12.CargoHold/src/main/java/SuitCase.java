import java.util.ArrayList;

public class SuitCase {
	private int maxCaseWeight;
	ArrayList<Item> items;

	public SuitCase(int maxWeight) {
		this.maxCaseWeight = maxWeight;
		this.items = new ArrayList<>();
	}

	public void add(Item item) {
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

	public ArrayList<Item> printItems() {
		return items;
	}

	public Item heviestItem() {
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
