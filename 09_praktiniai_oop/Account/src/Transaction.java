/*
 * 
 */
import java.nio.charset.Charset;
import java.util.Date;

public class Transaction {//©KS
	
private Date date;
private char type;
private Double amount; 
private Double balance;
private String description;

public Transaction(char type, Double amount, Double balance,   String description) {
	this.date = new Date();
	this.type = type;
	this.amount = amount;
	this.balance = balance;
	this.description = description;
}

/**
 * @return the date
 */
public Date getDate() {
	return date;
}

/**
 * @return the type
 */
public char getType() {
	return type;
}

/**
 * @return the amount
 */
public Double getAmount() {
	return amount;
}

/**
 * @return the balance
 */
public Double getBalance() {
	return balance;
}

/**
 * @return the description
 */
public String getDescription() {
	return description;
}

}
