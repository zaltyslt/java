import java.util.ArrayList;

public class Box implements Packable{//©KS

	private ArrayList<Packable> packed;
	private double maxCapacity;
//	private double totalWeight;

	public Box(double maxCapacity) {
		this.packed = new ArrayList<>();
		this.maxCapacity = maxCapacity;
//		this.totalWeight = 0;
	}

	public void add(Packable item) {
		if (this.weight() + item.weight() <= this.maxCapacity) {
			this.packed.add(item);
		}
	}

	public double weight() {
		double weight = 0;
		for (Packable item : packed) {
			weight += item.weight();
		}

		return weight;
	}

	@Override
	public String toString() {
		return "Box: " + this.packed.size() + " items, total weight " + this.weight() + " kg";
	}

}
