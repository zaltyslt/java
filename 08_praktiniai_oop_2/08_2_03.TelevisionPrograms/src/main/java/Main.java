import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// implement here your program that uses the TelevisionProgram class
		//©KS
		ArrayList<TelevisionProgram> programs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		String title = " ";
		int duration = 0;

		while (true) {

			System.out.print("Name: ");
			title = scanner.nextLine();
			if (title.isEmpty()) {
				break;
			}

			System.out.print("Duration: ");
			duration = Integer.parseInt(scanner.nextLine());

			programs.add(new TelevisionProgram(title, duration));

		}

		System.out.println("Program's maximum duration?");
		int maxduration = scanner.nextInt();

		for (TelevisionProgram televisionProgram : programs) {
			if (televisionProgram.getDuration() <= maxduration) {
				System.out.println(televisionProgram);
			}
		}

	}
}
