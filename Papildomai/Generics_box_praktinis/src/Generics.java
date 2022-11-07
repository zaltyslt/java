import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Generics {

	

	static <T> T lastElementList(List<T> arr) {
		return arr.get(arr.size()-1);
	}
	static <T> T lastElementArray(T[] arr) {
		
		return arr[arr.length-1];
	}

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arr1 = Arrays.asList("List1", "List2", "List3");
		
		String[] arr2 = {"Arr1", "Arr2", "Arr3"};
		List<String> arr3 = new ArrayList<>();
		arr3.add("Foo");
		arr3.add("Bar");
		arr3.add("FooBar");
		
		System.out.println(lastElementList(arr1));
		System.out.println(lastElementArray(arr3));
		
		
	}

}
