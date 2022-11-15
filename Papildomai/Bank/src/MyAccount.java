import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.FeeCollector;

public class MyAccount implements Account, FeeCollector {

	private double earnings;
	private int numberOfTransactions;
	private Account holdedAccount;

	public MyAccount(Account account) {
		this.holdedAccount = account;
		this.earnings = 0.0;
		this.numberOfTransactions = 0;
	}

	@Override
	public boolean deposit(double depositSum) {
		if (depositSum < 5) {
			return false;
		}

		double fee = depositSum * 0.02;
		this.holdedAccount.deposit(depositSum - fee);
		this.earnings += fee;
		this.numberOfTransactions++;
		return true;

	}

	@Override
	public double getBalance() {
		return this.holdedAccount.getBalance();
	}

	@Override
	public boolean withdraw(double withdrawSum) {
		if (withdrawSum < 5 ||getBalance() < withdrawSum ||  withdrawSum <= getBalance() / 10) {
			return false;
		}

		this.holdedAccount.withdraw(withdrawSum);
		this.numberOfTransactions++;
				return true;
	}

	@Override
	public double getAverageEarningsPerTransaction() {

		return this.earnings / this.numberOfTransactions;

	}

	@Override
	public double getEarnings() {

		return this.earnings;

	}

	@Override
	public int getNumberOfTransactions() {

		return this.numberOfTransactions;

	}

	@Override
	public String getNumber() {

		return this.holdedAccount.getNumber();
	}

}
