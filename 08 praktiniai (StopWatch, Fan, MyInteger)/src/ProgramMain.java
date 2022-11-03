
public class ProgramMain {// ©KS

	public static void main(String[] args) throws InterruptedException {

//		StopWatch stopWatch = new StopWatch();
//		stopWatch.start();
//		Thread.sleep(1000);
//		stopWatch.stop();
//		System.out.println(stopWatch);

		/*
		 * Write a test program that creates two Fan objects. Assign maximum speed,
		 * radius 10, color yellow, and turn it on to the first object.
		 * 
		 * Assign medium speed, radius 5, color blue, and turn it off to the second
		 * object. Display the objects by invoking their toString method.
		 */

//		Fan fan1 = new Fan();
//		Fan fan2 = new Fan();
//
//		fan1.setSpeed(fan1.getFAST());
//		fan1.setRadius(10);
//		fan1.setOn(true);
//		
//		fan2.setSpeed(fan1.getFAST());
//		fan2.setRadius(10);
//		fan2.setOn(false);
//		
//		System.out.println(fan1);
//		System.out.println(fan2);

		MyInteger myInteger = new MyInteger(19);
		System.out.println("Value stored in myInteger object: " + myInteger.getValue());

		System.out.println("Does value stored inside MyInteger object is even? " + myInteger.isEven());
		System.out.println("Does value stored inside MyInteger object is odd? " + myInteger.isOdd());
		System.out.println("Does value stored inside MyInteger object is prime? " + myInteger.isPrime());

		System.out.println("Does value 17 is even? " + MyInteger.isEven(17));
		System.out.println("Does value 17 is odd? " + MyInteger.isOdd(17));
		System.out.println("Does value 17 is prime? " + MyInteger.isPrime(17));

		MyInteger myInteger2 = new MyInteger(13);
		System.out.println("Value stored in myInteger2 object: " + myInteger2.getValue());
		System.out.println("Does value stored in myInteger2 object is even? " + MyInteger.isEven(myInteger2));
		System.out.println("Does value stored in myInteger2 object is odd? " + MyInteger.isOdd(myInteger2));
		System.out.println("Does value stored in myInteger2 object is prime? " + MyInteger.isPrime(myInteger2));

		System.out.println("Does value stored in myInteger2 object is equal 12? " + myInteger2.equals(12));
		System.out.println("Does value stored in myInteger2 object is equal 13? " + myInteger2.equals(13));

		MyInteger myInteger3 = null;
		MyInteger myInteger4 = myInteger2;
		MyInteger myInteger5 = new MyInteger(13);
		System.out.println("Does value stored in myInteger3 object: can't chaeck value - object is null");
		System.out
				.println("Does value stored in myInteger4 (reference to myInteger2) object: " + myInteger4.getValue());
		System.out.println("Does value stored in myInteger5 object: " + myInteger5.getValue());

		System.out.println("Does objects myInteger2 and myInteger3(null) are equal (by instance and value)?: "
				+ myInteger2.equals(myInteger3));
		System.out.println("Does objects myInteger2 and myInteger4(reference) are equal (by instance and value)?: "
				+ myInteger2.equals(myInteger4));
		System.out.println("Does objects myInteger2 and myInteger5 are equal (by instance and value)?: "
				+ myInteger2.equals(myInteger5));
		
		
		System.out.println(MyInteger.parseInt(new char[]{'1','9','8','1'}) + 5);
		System.out.println(MyInteger.parseInt("1980") + 5);
		

	}

}
