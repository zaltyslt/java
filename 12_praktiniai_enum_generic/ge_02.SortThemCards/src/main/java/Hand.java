import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {//©KS

	private ArrayList<Card> hand;

	public Hand() {
		hand = new ArrayList<>();
	}

	public void add(Card card) {
		hand.add(card);
	}

	public void print() {
		for (Card card : hand) {
			System.out.println(card);
		}
	}

	public void sort() {
		Collections.sort(hand);
	}

	public ArrayList<Card> getHand() {
		return this.hand;
	}

	public int getHandSize() {
		return this.hand.size();
	}

	public int countHand(Hand hand) {
		int handsSum = 0;
		for (Card card : hand.getHand()) {
			handsSum += card.getValue();
		}

		return handsSum;

	}

	@Override
	public int compareTo(Hand other) {
		if (countHand(this) != countHand(other)) {
			System.out.println("This hand " + countHand(this) + " other " + countHand(other));

			return this.countHand(this) - countHand(other);
		} else if (this.hand.size() < other.getHandSize()) {
			return this.hand.size() - other.getHandSize();
		}
		return 0;

	}
	
	public void sortBySuit() {
		BySuitInValueOrder sortBySuit = new BySuitInValueOrder();
		Collections.sort(hand, sortBySuit);
	}
}
