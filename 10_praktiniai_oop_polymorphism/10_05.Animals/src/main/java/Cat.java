
public class Cat extends Animal implements NoiseCapable{// ©KS

	public Cat() {
		super("Cat");

	}

	public Cat(String name) {
		super(name);

	}

	public void purr() {
		System.out.println(this.getName() + " purrs");
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
		this.purr();
		
	}

}
