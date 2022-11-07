

public class Saskaita {//©KS

	private final int accountNo;
	private String fName;
	private String lName;
	protected int balance;

	public Saskaita(String name, String lastName) {

		
		this.accountNo = SaskRegistras.getNumForAcc();
		this.fName = name;
		this.lName = lastName;
		balance = 0;
		
		
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @return the accountNo
	 */
	public int getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return this.balance;
	}
		
	public boolean addMoney(int amount) {
		if (amount > 0 && amount <= 100_000 && amount + this.balance <= Integer.MAX_VALUE) {
			balance += amount;
			return true;
		}
		return false;
	}
	
	public boolean takeMoney(int amount) {
		if (amount > 0 && amount <= 100_000 && this.balance - amount >= 0) {
			balance -= amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Saskaita " + this.accountNo + "\n"+
	"Vartotojas "+ getfName()+" "+getlName() + "\n"+
	"Balansas "+ getBalance();			
		
	}
	
	
	
	
}
