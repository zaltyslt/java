package lambda;

public class LMain {

	public static void main(String[] args) {
		Printable lambdaPrintable = (s) -> {return "Meow " +s;};
		print(lambdaPrintable);
	}
	
	public static void print(Printable thing) {
		thing.print("mine");
	}

}
