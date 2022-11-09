import java.util.ArrayList;
import java.util.Collections;

public class Main {//©KS

    public static void main(String[] args) {
//    	ArrayList<Card> cards = new ArrayList<>();
//    	cards.add(new Card(3, Suit.SPADE));
//    	cards.add(new Card(2, Suit.DIAMOND));
//    	cards.add(new Card(14, Suit.SPADE));
//    	cards.add(new Card(12, Suit.HEART));
//    	cards.add(new Card(2, Suit.SPADE));
//    	cards.add(new Card(6, Suit.CLUB));
//   // 	SortBySuit sortBySuitSorter = new SortBySuit();
////    	BySuitInValueOrder bySuitInValOrder = new BySuitInValueOrder();
////Collections.sort(cards, bySuitInValOrder);
////    //	Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
//    	
//    	cards.sort(new SortBySuit());
//    	

    	Hand hand = new Hand();
    	hand.add(new Card(12, Suit.HEART));
    	hand.add(new Card(4, Suit.SPADE));
    	hand.add(new Card(2, Suit.DIAMOND));
    	hand.add(new Card(14, Suit.SPADE));
    	hand.add(new Card(7, Suit.HEART));
    	hand.add(new Card(2, Suit.SPADE));
    	hand.sortBySuit();
    	hand.getHand().stream().forEach(c -> System.out.println(c));
    }
}
