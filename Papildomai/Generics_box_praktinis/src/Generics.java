import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Generics {//©KS

	

	

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arr1 = Arrays.asList("List1", "List2", "List3");
		
		String[] arr2 = {"Arr1", "Arr2", "Arr3"};
		
		
		System.out.println(lastElementList(arr1));
		System.out.println(lastElementArray(arr2));
		
		Box<String> twoNames = new Box<>("John", "Jane");
		
	}

}
