
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// you can write test code here
		// however, remove all unnecessary code when doing the final parts of the
		// exercise

		// In order for the tests to work, the objects must be created in the
		// correct order in the main program. First the object that tracks the total
		// sum, secondly the object that tracks the sum of even numbers,
		// and lastly the one that tracks the sum of odd numbers!
		int InputNumber = 0;
		Statistics statistics = new Statistics();
		System.out.println("Enter numbers:");
		while (InputNumber != -1) {

			InputNumber = scanner.nextInt();

			if (InputNumber != -1) {
				statistics.addNumber(InputNumber);
			}

		}
		System.out.println("Sum: " + statistics.sum());
		System.out.println("Count: " + statistics.getCount()+ "\n");
		
	
		

		System.out.println("Sum: " + statistics.sum());
		System.out.println("Sum of even numbers: " + statistics.sumOfEven());
		System.out.println("Sum of odd numbers: " + statistics.sumOfOdds());
	}
}
