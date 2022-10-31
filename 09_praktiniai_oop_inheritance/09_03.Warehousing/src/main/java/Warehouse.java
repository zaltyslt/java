
public class Warehouse {// ©KS

	private double capacity;
	private double balance;

	public Warehouse(double capacity) {
		if (capacity > 0.0) {
			this.capacity = capacity;
		} else {
			this.capacity = 0.0;
		}

		this.setBalance(0.0);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getCapacity() {
		return this.capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double howMuchSpaceLeft() {
		return this.capacity - this.getBalance();
	}

	public void addToWarehouse(double amount) {
		if (amount <= 0) {
			return;
		}
		if (amount < howMuchSpaceLeft()) {
			this.setBalance(this.getBalance() + amount);
		} else {
			this.setBalance(this.capacity);
		}
	}

	public double takeFromWarehouse(double amount) {
		if (amount < 0) {
			return 0.0;
		}
		if (amount > this.getBalance()) {
			double allThatWeCan = this.getBalance();
			this.setBalance(0.0);
			return allThatWeCan;
		}

		this.setBalance(this.getBalance() - amount);
		return amount;
	}

	public String toString() {
		return "balance = " + this.getBalance() + ", space left " + howMuchSpaceLeft();
	}

}
