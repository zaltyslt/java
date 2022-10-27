import java.util.ArrayList;

public class Hold {

	private ArrayList<Suitcase> suitcases;
	private int maxHoldWeight;
	

	public Hold(int maxWeight) {
		this.maxHoldWeight = maxWeight;
		suitcases = new ArrayList<>();
	}

	public void addSuitcase(Suitcase suitcase) {
		if (maxHoldWeight >= totalHWeight()+ suitcase.totalWeight()) {
		this.suitcases.add(suitcase);
		
		} else {System.out.println("sorry");}
	}

	public int totalHWeight() {
		int totalWeight = 0;
				
		for (Suitcase suitcase : suitcases) {
		totalWeight += suitcase.totalWeight();
		}

		return totalWeight;
	}	
	
	public void printItems() {
		for (Suitcase suitcase : this.suitcases) {
//			for (Item item : suitcase.listItems()) {
//				System.out.println(item);
//			}
			suitcase.printItems();
		}
	}

	@Override
	public String toString() {
	return this.suitcases.size() + " suitcases ("+this.totalHWeight()+" kg)";
	}

}
