
//public class Box<T> implements Comparable<T> { //reiskia, kad box pati tures moketi save palyginti su kitu Box objektu tures overraidinta CompareTo
public class Box<T extends Comparable<T>> {
	private T item1;
	private T item2;

	public Box(T t1, T t2) {
		this.item1 = t1;
		this.item2 = t2;
	}

	public T getT() {
		return item1;
	}

	public T getU() {
		return item2;
	}

	public T getSmaller(){
		if(item1.compareTo(item2) < 0) {return item1;}
		
		return item2;
	}
		
	public T getEqual(){
		if(item1.equals(item2)) {
			return item1;
		}
		return item2;
	}
}
