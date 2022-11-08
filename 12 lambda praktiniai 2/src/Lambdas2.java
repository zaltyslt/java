import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;



public class Lambdas2 {

	

	public static void main(String[] args) {
		
		String[] array = {"Karla", "Pepa", "Terminator", "Malvina"};
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
//			public int compare(String string) {
				public int compare(String string1, String string2) {
				// TODO Auto-generated method stub
//				return string1.length() - string2.length();
//				return string1.charAt(0) - string2.charAt(0);
				int value1 = string1.contains("e") ? -1:1;
				int value2 = string2.contains("e") ? -1:1;
//				System.out.println(string1+ ": "+ value1 +"; "+ string2+ ": "+ value2 + "= " + (value1 - value2) );
				return value1 - value2;
			}
		};

//		Arrays.sort(array, (string1,string2)->string1.length() - string2.length());
//		System.out.println(Arrays.asList(array));
//		Arrays.sort(array, (string1,string2)->string2.length() - string1.length());
//		System.out.println(Arrays.asList(array));
//		Arrays.sort(array, (string1,string2)->string1.charAt(0) - string2.charAt(0));
//		System.out.println(Arrays.asList(array));
//		Arrays.sort(array, (string1, string2) -> {int value1 = string1.contains("e") ? -1:1;
//												 int value2 = string2.contains("e") ? -1:1;
//												 return value1 - value2;
//												 });
//		System.out.println(Arrays.asList(array));
		
		Arrays.sort(array, (s1,s2) -> yourMethod(s1,s2));
	}
	
	
	static int yourMethod(IntBinaryOperator op1, IntBinaryOperator op2){
	    //return op.applyAsInt(5, 10);
		
	}
//		public static applyAsInt(T t, U u) {
//			return null;
//		}
}
