import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class VehicleRegistry {//©KS

	private HashMap<LicensePlate, String> list;

	public VehicleRegistry() {
		list = new HashMap<>();
	}

	public boolean add(LicensePlate licensePlate, String owner) {
		if (list.containsKey(licensePlate)) {
			return false;
		} else {
			list.putIfAbsent(licensePlate, owner);
			return true;
		}
	}

	public String get(LicensePlate licensePlate) {
		return list.getOrDefault(licensePlate, null);
	}

	public boolean remove(LicensePlate licensePlate) {
		if (list.containsKey(licensePlate)) {
			list.remove(licensePlate);
			return !list.containsKey(licensePlate) ? true : false;
		} else {
			return false;
		}
	}

	public void printLicensePlates() {
		for (Map.Entry<LicensePlate, String> entry : list.entrySet()) {
			System.out.println(entry.getKey());
		}
	}
	
	public void printOwners() {
	HashSet<String> owners = new HashSet<>(); 
		
		for (Map.Entry<LicensePlate, String> entry : list.entrySet()) {
		owners.add(entry.getValue());
		}
		
		owners.forEach((k) -> System.out.println((k+"\n")));
	}
}
