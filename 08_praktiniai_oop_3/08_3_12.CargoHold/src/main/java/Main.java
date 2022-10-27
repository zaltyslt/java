
public class Main {

	public static void main(String[] args) {
		// You can use the main to test your classes!

		Item item1 = new Item("aaa", 3);
		Item item2 = new Item("bbb", 3);
		Item item3 = new Item("ccc", 3);
		
		Suitcase suitcase1 = new Suitcase(10);
		suitcase1.addItem(item1);
		suitcase1.addItem(item2);
		suitcase1.addItem(item3);
		
		Hold hold1 = new Hold(30);
		hold1.addSuitcase(suitcase1);
		hold1.addSuitcase(suitcase1);
		hold1.addSuitcase(suitcase1);
		
		suitcase1.printItems();
		
		
		
		
		
		
	}
}
