
import java.awt.print.Book;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int rAge =0;
        while (true) {
        	System.out.println("Input the name of the book, empty stops:");
        	name = scanner.nextLine();
        	if(name.isEmpty()) {break;}
        	
        	System.out.println("Input the age recommendation:");
        	rAge = Integer.parseInt(scanner.nextLine());
			
		}

    }

}
