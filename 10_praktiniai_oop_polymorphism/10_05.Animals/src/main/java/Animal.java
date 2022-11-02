
public abstract class Animal {// ©KS

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(getName() + " eats");
	};
	public void sleep() {
		System.out.println(getName() + " sleeps");
	};
	
	public String getName() {
		return this.name;
	}

}
