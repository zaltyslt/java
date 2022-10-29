import java.util.ArrayList;

public class SaskRegistras {

	private static ArrayList<Saskaita> saskRegistras;

	public SaskRegistras() {
		saskRegistras = new ArrayList<>();
	}

	public static int getNumForAcc() {
		boolean making = true;
		int num = -1;
		while (making) {
			 num = makeAccNo();
			if (canAdd(num)) {
				making = false;
			}
		}
		return num;
	}
	
	private static int makeAccNo() {

		return (int) ((Math.random() * (200 - 100)) + 100);

	}
	private static boolean canAdd(int num) {
		

		for (int i = 0; i < saskRegistras.size(); i++) {
			if (saskRegistras.get(i).getAccountNo() == num) {
				return false;
			}
		}
		return true;
	}

	public static void addToReg(Saskaita saskaita) {
		saskRegistras.add(saskaita);
	}
	
	public static Saskaita getFromReg(int index) {
		return saskRegistras.get(index);
	}
	
	public static void rmFromReg(int index) {
		saskRegistras.remove(index);
	}

	

	

}
