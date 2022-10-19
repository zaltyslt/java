package lt.vtmc.ks.sumthese;
//©KS
public class main {
	public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
		smallest = (smallest < 0)? 0: smallest;
		largest = (largest > array.length-1)? array.length-1: largest;
		
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
		int[] numbers = {0, 0, 0, 10};
		
		System.out.println(sum(numbers, 0, 0, 0, 0));
		
//		System.out.println(sum(numbers, 0, 0, 0, 0));
//		System.out.println(sum(numbers, 0, 0, 0, 10));
//		System.out.println(sum(numbers, 0, 1,
	}

}
