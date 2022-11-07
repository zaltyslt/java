
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MainProgram {//©KS

	public static void main(String[] args) {
		List<StoryBook> books = new ArrayList();

		Scanner scanner = new Scanner(System.in);
		String title;
		int rAge = 0;

		while (true) {
			System.out.println("Input the name of the book, empty stops:");
			title = scanner.nextLine();
			if (title.isEmpty()) {
				break;
			}

			System.out.println("Input the age recommendation:");
			rAge = Integer.parseInt(scanner.nextLine());

			books.add(new StoryBook(title, rAge));

		}
		scanner.close();
//		

//		books.addAll(Arrays.asList(new StoryBook("The Ringing Lullaby Book", 0),
//								   new StoryBook("The Exiting Transpotation Vehicles", 0), 
//								   new StoryBook("The Snowy Forest Calls", 12),
//								   new StoryBook("Litmanen 10", 10)));
		
		/***
		 * Galima pakurti atskira comparatoriaus klases kintamaji
		 * ByAgeAndName byAgeAndName = new ByAgeAndName();
		 * 
		 * arba iskart ideti kaip nauja objekta i sort funkcijos parametrus
		*/ 
		
		books.sort(new ByAgeAndName());
		
		System.out.println(books.size() + " books in total.\n"+"Books:");
				
		for (StoryBook book : books) {
			System.out.println(
					book.getTitle() + " (recommended for " + book.getAgeRecommendations() + " year-olds or older)");
		}
	}

}
