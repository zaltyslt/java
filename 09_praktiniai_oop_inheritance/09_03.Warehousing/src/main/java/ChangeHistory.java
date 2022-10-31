import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChangeHistory {// ©KS
	private ArrayList<Double> changeHistory;

	public ChangeHistory() {
		changeHistory = new ArrayList<>();
	}

	public void add(double status) {
		changeHistory.add(status);
	}

	public void clear() {
		changeHistory.clear();
	}

	public double maxValue() {
		if (this.changeHistory.size() != 0) {
			return Collections.max(changeHistory);
		}
		
		return 0.0;
	}
	public double minValue() {
		if (this.changeHistory.size() != 0) {
			return Collections.min(changeHistory);
		}
		
		return 0.0;
	}
	public double average() {
		if (this.changeHistory.size() > 0) {
			int sum =0;
			for (Double double1 : changeHistory) {
				sum += double1;
			}
			
			return sum /( this.changeHistory.size() *1.0);
		}
		
		return 0.0;
	}

	
	
	
	@Override
	public String toString() {
		return this.changeHistory.toString();
	}
}
