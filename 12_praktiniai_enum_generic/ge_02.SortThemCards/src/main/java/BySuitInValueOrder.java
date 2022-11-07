import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{//©KS

	public BySuitInValueOrder() {
			}

	  @Override
	    public int compare(Card card1, Card card2) {
		  return Comparator.comparing(Card::getSuit)
	                .thenComparing(Card::getValue)
	                .compare(card1, card2);
	    }

//	  @Override
//	  public int compareTo(Person o){
//	      return Comparator.comparing(Person::getFirstName)
//	                .thenComparing(Person::getLastName)
//	                .thenComparingInt(Person::getAge)
//	                .compare(this, o);
//	  }
}
