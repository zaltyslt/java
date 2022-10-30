import java.text.ParseException;

public class CheckingAccount extends Account {//©KS
private Double overdraftLimit;

public CheckingAccount(int id, double balance, Double overdraftLimit) throws ParseException {
	super(id,balance);
	this.overdraftLimit = overdraftLimit;
}

@Override
public void withdraw(Double amount) {

	if(this.getBalance() - amount > this.overdraftLimit) {
		this.setBalance(this.getBalance() - amount);
	}
}
@Override
public String toString() {
	return this.getDateCreated()+" "+this.getId()+" "+this.getBalance()+" "+this.getAnnualInterestRate() + " " + this.overdraftLimit;
}
}
