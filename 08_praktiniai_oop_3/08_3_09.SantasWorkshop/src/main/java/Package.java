import java.util.ArrayList;

public class Package {
	
	
	
	private ArrayList<Gift> gifts;
	
	public Package() {
		this.gifts = new ArrayList<>();
	}
	
	public void addGift(Gift gift) {
		
		this.gifts.add(gift);
		
	}

	/**
	 * @return the totalWeight
	 */
	public int totalWeight() {
		int totalWeight =0;
		
		for (Gift gift : gifts) {
			totalWeight += gift.getWeight();
		}
		
		return totalWeight;
	} 
	
	
}
