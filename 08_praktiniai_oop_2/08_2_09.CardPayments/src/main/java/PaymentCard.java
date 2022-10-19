
public class PaymentCard {

	private double balance;
	//private boolean transactionSuccess = false;
	
	public PaymentCard(double balance) {
		this.balance = balance;
	}

	public double balance() {
		return this.balance;
	}

	public void addMoney(double increase) {
		this.balance = increase > 0 ? this.balance += increase : this.balance;
	}

	public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
    	if(balance >= amount) {
    		this.balance -= amount; 
    		return true; };
    		
        return false;
    }
	
//	public void setTransactionSuccess (boolean result) {
//		transactionSuccess = result;
//	}
//	
//	public boolean isTransactionSuccessful() {
//		return transactionSuccess;
//	}
}
