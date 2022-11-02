import java.util.ArrayList;

public class OneItemBox extends Box {//©KS

	private ArrayList<Item> items;
	
	public OneItemBox() {
		items = new ArrayList<>();
	}

	@Override
	public void add(Item item) {
		if(this.items.size() < 1) {
			items.add(item);
		}

	}

	@Override
	public boolean isInBox(Item item) {
		if(items.contains(item)) {return true;}
		return false;
	}

}
