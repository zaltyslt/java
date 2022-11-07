import java.text.ParseException;
import java.util.ArrayList;

public class Account2 extends Account {//©KS

	private String name;
	ArrayList<Transaction> transactions;

	public Account2(int id, String name, Double balance, Double anualIntRate) throws ParseException {
		super(id, balance);
		this.name = name;
		this.setAnnualInterestRate(anualIntRate);
		this.transactions = new ArrayList<>();
	}

	public void SetName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void withdraw(Double amount, String description) {
		this.setBalance(this.getBalance() - amount);

		transactions.add(new Transaction('w', amount, this.getBalance(), description));
	}

	public void deposit(Double amount, String description) {
		this.setBalance(this.getBalance() + amount);
		transactions.add(new Transaction('d', amount, this.getBalance(), description));
	}

	public void printSummary() {
		System.out.println(this.getName() + "\n" + 
	        "Interest rate " + this.getAnnualInterestRate() + "%\n" + 
				"Balance " + this.getBalance()+"\n"+
	        "============");
		for (Transaction trans : transactions) {
			System.out.printf("%s %s - %,.2f,\t %,.2f,\t %s \n", trans.getDate(),trans.getType(),trans.getAmount(),trans.getBalance(),trans.getDescription());
			
			
		}
		
	}
//		Print an account summary that shows the account holder name, interest
//		rate, balance, and all transactions.

}