
public class Main {// ©KS

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();

		Dog fido = new Dog("Fido");
		fido.bark();

		Cat cat = new Cat();
		cat.purr();
		cat.eat();

		Cat garfield = new Cat("Garfiled");
		garfield.purr();

		NoiseCapable dog2 = new Dog();
		dog.makeNoise();

		NoiseCapable cat2 = new Cat("Garfield");
		cat.makeNoise();

		Cat c = (Cat) cat;
		c.purr();

		System.out.println(cat + " : " + c);
	}

}
