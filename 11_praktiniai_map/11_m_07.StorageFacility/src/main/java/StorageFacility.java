import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {// ©KS

	private HashMap<String, ArrayList<String>> units;

	public StorageFacility() {
		units = new HashMap<>();
	}

	public void add(String unit, String item) {
		ArrayList<String> contents = units.get(unit);
		if (units.containsKey(unit)) {
//			ArrayList<String> contents = units.get(unit);
			contents.add(item);
		} else {
			units.put(unit, new ArrayList<String>() {
				{
					add(item);
				}
			});
		}
	}

	public ArrayList<String> contents(String storageUnit) {
		if (units.containsKey(storageUnit)) {
			return units.get(storageUnit);
		} else {
			return new ArrayList<>();
		}
	}

	public void remove(String storageUnit, String item) {
		if (units.containsKey(storageUnit)) {
			ArrayList<String> contents = units.get(storageUnit);
			if (contents.contains(item)) {
				for (String entry : contents) {
					if (entry.equalsIgnoreCase(item)) {
						contents.remove(entry);
						
						if(contents.size() ==0) {
							units.remove(storageUnit);
						}
						return;
					}
				}
				
			}
		}
	}
	
	public ArrayList<String> storageUnits(){
		
		return new ArrayList<String>(units.keySet());
	}
};
