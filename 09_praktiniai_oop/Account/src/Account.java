import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() throws ParseException {
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 0.0;
		this.dateCreated = (Date) new SimpleDateFormat("yyyy.MM.dd").parse("2022.01.25");
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
		return id;
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
		return balance;
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
		return annualInterestRate;
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
	public Date getDateCreated() {
		return dateCreated;
	}

	
	
}
