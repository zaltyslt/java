
/**public class Box<T> implements Comparable<T> { 
 * //reiskia, kad box pati tures moketi save palyginti 
 * su kitu Box objektu, t.y. ** tures overraidinta CompareTo
 * */

/**
 * Tai kad Box extendina Comparable, reiskia, kad joje bus galima saugoti tik
 * tuos kintamuosius, kurie patys implementuoja comparable interface, t.y. gali
 * buti palyginti tapusavyje
 */

/*
 * Dar reikia pasiziureti is hand, kai reikia parasyti ir pakisti atskirus
 * comparatorius
 */

public class Box<T extends Comparable<T>> {//©KS
	private T item1;
	private T item2;
	private Boolean isLocked;

	public Box(T t1, T t2) {
		this.item1 = t1;
		this.item2 = t2;
		this.isLocked = false;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void lock() {
		this.isLocked = true;
	}

	public void unlock() {
		this.isLocked = false;
	}

	public T getItem1() {
		if (!isLocked()) {
			return item1;
		}
		throw new RuntimeException("The box is locked");
	}

	public T getItem2() {
		if (!isLocked()) {
			return item2;
		}
		throw new RuntimeException("The box is locked");
	}

	public T getSmaller() {
		if (!isLocked()) {
			if (item1.compareTo(item2) < 0) {
				return item1;
			}

			return item2;
		}
		return null;
	}

	public T isEqual() {
		if (item1.equals(item2)) {
			return item1;
		}
		return item2;
	}
	
	@Override
	public String toString() {
		if (!isLocked()) {
			String item1 = this.item1 != null ? this.item1.toString() : ""; 
			String item2 = this.item2 != null ? this.item2.toString() : ""; 
			
			return item1 + " : " + item2;
		}
		
		
		
		
		throw new RuntimeException("The box is locked");
	}
}
