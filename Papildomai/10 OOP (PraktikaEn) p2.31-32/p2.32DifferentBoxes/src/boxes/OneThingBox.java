package boxes;

import java.util.LinkedList;
import java.util.List;

public class OneThingBox extends Box {//©KS
	private List<Thing> thingStored;
	
	
	public OneThingBox() {
		this.thingStored = new LinkedList<>();
				
	}

	@Override
	public void add(Thing thing) {
		if(thingStored.isEmpty()) {
			
			thingStored.add(thing);
		}

	}

	@Override
	public boolean isInTheBox(Thing thing) {
		if(thingStored.contains(thing)) {
			return true;
		}
		return false;
	}

}
