
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    public static List<Book> readBooks(String file){
        List <Book> tempList = new ArrayList<>();

        try {
            List<String> allLines = Files.readAllLines(Paths.get(file));

           allLines.forEach(l -> tempList.add(extractBookDetails(l)));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempList;
    }

    private static Book extractBookDetails(String line){
        String[] bookDetails = line.split(",");
        return new Book(bookDetails[0], Integer.parseInt(bookDetails[1]), Integer.parseInt(bookDetails[2]), bookDetails[3]);
    }
}
