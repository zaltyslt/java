import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Generics {//©KS

	

	

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arr1 = Arrays.asList("List1", "List2", "List3");
		
		String[] arr2 = {"Arr1", "Arr2", "Arr3"};
		
		
		System.out.println(LastElement.lastElementList(arr1));
		System.out.println(LastElement.lastElementArray(arr2));
		
		Box<String> twoNames = new Box<>("John", "Jane");
		Box<Integer> twoInts = new Box<>(5, 7);
		System.out.println(twoNames.getSmaller());
		System.out.println(twoInts.getSmaller());
		
		twoInts.unlock();
		
		System.out.printf("twoNames = %s.%n", twoNames);
		
		twoInts.unlock();
		System.out.printf("twoInts = %s.%n", twoInts);
		
		
	}

}
