
public class Dog extends Animal implements NoiseCapable {// ©KS

	public Dog() {
		super("Dog");
		// TODO Auto-generated constructor stub
	}
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void bark() {
		System.out.println(this.getName() + " barks");
	}
	
//	@Override
//	public void eat() {
//		super.eat();
//	}
//	@Override
//	public void sleep() {
//		super.sleep();
//	}
	@Override
	public void makeNoise() {
		this.bark();
		
	}
	

}
