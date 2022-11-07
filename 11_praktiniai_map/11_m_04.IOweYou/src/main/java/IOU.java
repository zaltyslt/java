import java.util.HashMap;
import java.util.Map;

public class IOU {//©KS
	private HashMap<String, Double> iOY;

	public IOU() {
		this.iOY = new HashMap<>();
	}

	public void setSum(String toWhom, double amount) {
		if (iOY.keySet().contains(toWhom)) {
			iOY.put(toWhom, iOY.get(toWhom) + amount);
		} else {
			iOY.put(toWhom, amount);
		}
	}

	public double howMuchDoIOweTo(String toWhom) {
		if (iOY.containsKey(toWhom)) {
			double sum = 0;
			for (Map.Entry<String, Double> entry : iOY.entrySet()) {
				if (entry.getKey().equalsIgnoreCase(toWhom)) {
					sum += entry.getValue();
				}
			}
			return sum;
		} else {
			return 0.0;
		}
	}
}
