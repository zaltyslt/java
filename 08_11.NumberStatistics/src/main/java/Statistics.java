
public class Statistics {

	
	private int sum;
	private int count;
	private int sumOfeven;
	private int sumOfOdds;

	public Statistics() {
		
		this.sum = 0;
		this.sumOfeven = 0;
		this.sumOfOdds = 0;
	}

	public void addNumber(int number) {
		this.count++;
		this.sum += number;
		if (number % 2 == 0) {
			this.sumOfeven += number;
		} else {
			this.sumOfOdds += number;
		}
	}

	public int getCount() {
		return this.count;
	}

	public int sum() {
		return this.sum;
	}
	
	public int sumOfEven() {
		return this.sumOfeven;
	}
	
	public int sumOfOdds() {
		return this.sumOfOdds;
	}

	public double average() {
		if (this.count != 0) {
			return (double) this.sum / this.count;
		} else {
			return 0.0;
		}

	}
}
