package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {//©KS

	private int boxMaxWeight;
	private List<Thing> things;

	public MaxWeightBox(int maxWeight) {
		things = new ArrayList<>();
		this.boxMaxWeight = maxWeight;
	}
//	public MaxWeightBox() {
//		// TODO Auto-generated constructor stub
//	}

	public int getWeight() {
		return things.stream().mapToInt(Thing::getWeight).sum();
	}

	@Override
	public void add(Thing thing) {
		if (this.boxMaxWeight >= thing.getWeight()+this.getWeight()) {
			this.things.add(thing);
		}

	}

	@Override
	public boolean isInTheBox(Thing thing) {
		if(things.contains(thing)) {
			return true;}
		return false;
	}

}
