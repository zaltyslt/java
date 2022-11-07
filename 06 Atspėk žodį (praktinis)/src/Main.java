import java.util.Scanner;

public class Main {// ©KS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Words word = new Words();

		System.out.println("Áveskite pirmojo þaidëjo vardà");
		Player player1 = new Player(scan.nextLine());

		System.out.println("Áveskite antrojo þaidëjo vardà");
		Player player2 = new Player(scan.nextLine());
//		Player player1 = new Player("Shitas");
//		Player player2 = new Player("Anas");

		Game game = new Game(word, player1, player2);

		while (!game.gameOver()) {
			game.roundStart();
			String enteredLetter = "";
			while (enteredLetter.equals("")) {
				enteredLetter = scan.nextLine();
			}
			game.roundCheck(enteredLetter);

		}

		scan.close();
	}

}
