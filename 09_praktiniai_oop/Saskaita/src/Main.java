import java.util.ArrayList;
import java.util.Scanner;

public class Main {//©KS

	public static void main(String[] args) {

		SaskRegistras registras = new SaskRegistras();
		Scanner scan = new Scanner(System.in);
		boolean init = true;
		String fName = "a", lName = "s";

		while (true) {

			if (init) {
				System.out.println("Vardas? (Empty to quit)");
				fName = scan.nextLine();
				if (fName.isEmpty()) {
					break;
				}
				System.out.println("Pavarde?");
				lName = scan.nextLine();

				registras.addToReg(new Saskaita(fName, lName));
				registras.addToReg(new KredSaskaita(fName, lName, -500));
				init = false;

			}
			while (true) {
				System.out.println("Kokia saskaita naudosim (Debetine/Kreditine/Baigti)");

				String accType = scan.nextLine().substring(0, 1);
				if (accType.equalsIgnoreCase("b")) {
					break;
				}

				while (true) {
					int ammount = 0;
					if (accType.equalsIgnoreCase("d") || accType.equalsIgnoreCase("k")) {
						System.out.println("Pasirinkti operacija: Info (1), Add$ (2), Take$ (3), Baigti (0)");
						int op = Integer.parseInt(scan.nextLine());
						if (op == 0) {
							break;
						} else if (op == 1) {

							accDo(registras, accType, op, 0);
						}
						if (op == 2) {
							System.out.println("Kiek pinigu prideti?");
							accDo(registras, accType, op, Integer.parseInt(scan.nextLine()));

						} else if (op == 3) {
							System.out.println("Kiek pinigu isimti?");
							accDo(registras, accType, op, Integer.parseInt(scan.nextLine()));
						}
					}
				}
			}
			break;
			
		}
		scan.close();
	}

	static void accDo(SaskRegistras registras, String accType, int opp, int ammount) {
		int accTypeInt = -1;
		if (accType.equals("d")) {
			accTypeInt = 0;
		} else {
			accTypeInt = 1;
		}

		switch (opp) {
		case 1: {
			System.out.println(registras.getFromReg(accTypeInt).toString());
			break;

		}
		case 2: {
			if (registras.getFromReg(accTypeInt).addMoney(ammount)) {
				System.out.println("Operacija pavyko");
			} else {
				System.out.println("Operacija Nepavyko");
			}
			;
			System.out.println(registras.getFromReg(accTypeInt).toString());
			break;

		}
		case 3: {
			if (registras.getFromReg(accTypeInt).takeMoney(ammount)) {
				System.out.println("Operacija pavyko");
			} else {
				System.out.println("Operacija Nepavyko");
			}
			;

			System.out.println(registras.getFromReg(accTypeInt).toString());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opp);
		}
	}

}
