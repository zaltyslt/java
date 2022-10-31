
public class Student extends Person {//©KS
private int credits;
	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.credits = 0;
	}
	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}

	public void study() {
		credits++;
	}
	
	public int credits() {
		return this.credits;
	}
	
	@Override
	public String toString() {
		return this.getName() + "\n  " +
	this.getAddress() +"\n"+
				"  "+"Study credits "+this.getCredits();
	}
}
