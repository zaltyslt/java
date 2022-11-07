import java.util.Comparator;

public class SortBySuit implements Comparator<Card>{//©KS

	public SortBySuit() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Card card1, Card card2) {
		
		return card1.getSuit().ordinal() - card2.getSuit().ordinal();
	}

}
