package lambda;

public class LMain {

	public static void main(String[] args) {
		Printable lambdaPrintable = (s) -> {return "Meow " +s;};
		print(lambdaPrintable);
//		print((s) -> {return "Meow " +s;});
	}
	
	public static void print(Printable thing) {
		thing.print("mine");
	}

}
//public interface Printable {
//String print(String suffix);
//}
