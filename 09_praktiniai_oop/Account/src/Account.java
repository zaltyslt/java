import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Account {//©KS
	private int id;
	private double balance;
	private double annualInterestRate;
	private LocalDate dateCreated;

	public Account() throws ParseException {
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 6.0;
		// SimpleDateFormat formatter = new SimpleDateFormat("yyyy.mm.dd - HH:mm:ss");
		this.dateCreated = LocalDate.now();
	}

	public Account(int id, double balance) throws ParseException {
		this();
		this.id = id;
		this.balance = balance;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public LocalDate getDateCreated() {
		return this.dateCreated;
	}

	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;

	}

	public double getMonthlyInterest() {
		return this.balance * (this.getMonthlyInterestRate() / 100);

	}

	public void withdraw(Double amount) {
		this.balance -= amount;
	}
	public void deposit(Double amount) {
		this.balance += amount;
	}
@Override
public String toString() {
	return this.getDateCreated()+" "+this.getId()+" "+this.getBalance()+" "+this.getAnnualInterestRate();
}
}
