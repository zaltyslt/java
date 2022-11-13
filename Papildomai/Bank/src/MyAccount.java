import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.FeeCollector;

public class MyAccount implements Account, FeeCollector {

	
	private String number;
	private double balance;
	private double earnings;
	private int numberOfTransactions;
	
	
	public MyAccount(String number, double balance) {
		this.number = number;
		this.balance = balance;
		this.earnings = 0.0;
		this.numberOfTransactions = 0;
	}
	
		
	@Override
	public boolean deposit(double depositSum) {
	if(depositSum <5) {
		return false;
		
		}

	double fee = depositSum * 0.02;
	this.balance += depositSum - fee;
	this.earnings += fee;
	this.numberOfTransactions++;
	return true;
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return this.number;
	}

	@Override
	public boolean withdraw(double withdrawSum) {
		if(getBalance() > withdrawSum || withdrawSum >=5 || withdrawSum >= getBalance() / 10 ) {
			
			return false;
		}
		
		this.balance -= withdrawSum;
		return true;
	}

	@Override
	public double getAverageEarningsPerTransaction() {
		
//		return this.earnings / this.numberOfTransactions;
		return 0;
	}


	@Override
	public double getEarnings() {
		
		//return this.earnings;
		return 0;
	}


	@Override
	public int getNumberOfTransactions() {
		
		//return this.numberOfTransactions ;
		return 0;
	}
	

}
