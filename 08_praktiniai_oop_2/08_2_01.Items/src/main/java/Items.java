
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        ArrayList<Item> list = new ArrayList<>();
        while(true) {
        	name = scanner.nextLine();
        	if(name.isEmpty()) { break;}
        	list.add(new Item(name));
        }
        
        for (Item item : list) {
		System.out.println(item.toString());
		}
    }
}
