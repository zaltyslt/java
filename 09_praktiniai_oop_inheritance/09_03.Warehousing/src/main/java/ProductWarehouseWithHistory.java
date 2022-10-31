
public class ProductWarehouseWithHistory extends ProductWarehouse {//©KS

	private ChangeHistory history;

	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		history = new ChangeHistory();
		history.add(initialBalance);
		this.setBalance(initialBalance);
	}

	@Override
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		history.add(getBalance());
	}

	@Override
	public double takeFromWarehouse(double amount) {
		double amountRemoved = super.takeFromWarehouse(amount);
		history.add(getBalance());
		return amountRemoved;
	}

	public void printAnalysis() {
		System.out.println("Product: "+this.getName());
		System.out.println("History: "+this.history());
		System.out.println("Largest amount of product: "+this.history.maxValue());
		System.out.println("Smallest amount of product: "+this.history.minValue());
		System.out.println("Average: "+this.history.average());
	}
	
	public String history() {
		return this.history.toString();
	}
}
