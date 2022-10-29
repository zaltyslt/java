
public class KredSaskaita extends Saskaita {

	private int maxCredit;

	public KredSaskaita(String firstName, String lastName, int maxCredit) {
		super(firstName, lastName);

		this.maxCredit = maxCredit;
	}

	@Override
	public boolean addMoney(int amount) {
		if (amount > 0 && amount <= 100_000 && amount + this.balance <= Integer.MAX_VALUE) {
			balance += amount;
			if (balance + amount > 0) {
				balance = 0;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean takeMoney(int amount) {
		if (amount > 0 && amount <= 100_000 && ( balance - amount) > maxCredit) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
}
