
public class Teacher extends Person {// ©KS

	private int salary;

	public Teacher(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return this.getName() + "\n  " +
	this.getAddress() +"\n"+
				"  "+"salary "+this.getSalary()+ " euro/month";
	}
}
