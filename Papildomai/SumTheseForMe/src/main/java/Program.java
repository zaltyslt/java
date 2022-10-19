
//©KS
public class Program {
	
	public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
		
		fromWhere = fromWhere < 0 ? 0: fromWhere;
		fromWhere = fromWhere > array.length ? fromWhere = array.length -1 : fromWhere;
		
		toWhere = toWhere > array.length ? array.length : toWhere;
		
		int sum =0;
		for (int i = fromWhere; i < toWhere; i++) {
			if( array[i] >= smallest && array[i]<= largest) {
				sum += array[i];
			}
			
		}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1};
		
		System.out.println(sum(numbers, -2, 3, 0, 999));
		
//		System.out.println(sum(numbers, 0, 0, 0, 0));
//		System.out.println(sum(numbers, 0, 0, 0, 10));
//		System.out.println(sum(numbers, 0, 1,
	}

}
