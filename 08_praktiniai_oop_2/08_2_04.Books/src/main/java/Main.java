import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	ArrayList<Book> books = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
    	
    	String title = " ";
		int pages = 0;
		int yearOfPublication;

		while (true) {

			System.out.print("Title: ");
			title = scanner.nextLine();
			if (title.isEmpty()) {break;}

			System.out.print("Number of pages: ");
			pages = Integer.parseInt(scanner.nextLine());

			System.out.print("Publication year: ");
			yearOfPublication = Integer.parseInt(scanner.nextLine());
			
			books.add(new Book(title, pages, yearOfPublication));

		}
		
		

		System.out.println("What information will be printed?");
		String param = scanner.nextLine();
		for (Book book : books) {
			System.out.println(book.toString(param));
			
		}

    }
}
