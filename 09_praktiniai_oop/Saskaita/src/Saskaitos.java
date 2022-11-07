import java.util.ArrayList;

public class Saskaitos {//©KS
 private static ArrayList<Integer> sasList;
 
 public Saskaitos() {
	 sasList = new ArrayList<>();
 }
 
 public static boolean canCreate(int num) {
	 if(sasList.contains(num)) {
		 
		 System.out.println( num + " ups");
		 return false;
	 } else {
		 sasList.add(num);
		 System.out.println( num + " OK");
	 }
	 return true;
 }
 
}
