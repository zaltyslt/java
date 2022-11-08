import java.util.List;

public class LastElement {//©KS

	public LastElement() {
		// TODO Auto-generated constructor stub
	}

	static <T> T lastElementList(List<T> list) {
		return list.get(list.size()-1);
	}
	static <T> T lastElementArray(T[] array) {
		
		return array[array.length-1];
	}
}
