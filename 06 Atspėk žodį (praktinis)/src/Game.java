import java.io.IOException;
import java.util.HashMap;

public class Game {
	private Words word;
	private Player player1;
	private Player player2;
	private Player activePlayer;
	private boolean gameOver;

	public Game(Words word, Player player1, Player player2) {
		this.word = word;
		this.player1 = player1;
		this.player2 = player2;
		this.gameOver = false;
		activePlayer = player1;

	}

	public boolean gameOver() {// ©KS

		return gameOver;
	}

	public void roundStart() {
		
		System.out.println("\n" + activePlayer.getName() + " jûsø bandymas ");
		//+	"(tries left " +activePlayer.getTriesLeft()+", is out "+activePlayer.isOut()+ ")");
		word.print();

	}

	public void roundCheck(String enteredLetter) {

		HashMap<String, Boolean> answer = word.guess(enteredLetter);
//jei speta raide
		if (!answer.get("wordOrNot")) {

			if (!answer.get("success")) {
				this.activePlayer.setTriesLeft(-1);
				
				this.drawHangman(activePlayer.getTriesLeft());
				
				playerSwitch();
				return;
			} else {
				this.printMsg(1);
			}
			// else {playerSwitch(false);}
		} else {
			// jei spetas zodis
			if (!answer.get("success")) {
				activePlayer.setOut();
				this.drawHangman(activePlayer.getTriesLeft());
				playerSwitch();
			} else {
				this.printMsg(2);
				gameEnd(true);
			}
		}
	}

	private void printMsg(int var) {
		if(var == 1) {
			System.out.println(this.activePlayer.getName() + " jûs atspëjote raidæ!!!");
		}
		if(var == 2) {
			System.out.println(this.activePlayer.getName() + " jûs atspëjote þodá!!!");
		}
	}
	
	private void playerSwitch() {
		if (this.activePlayer == player1) {

			if (!player2.isOut()) {
				activePlayer = player2;
				return;
			}
			
			if ( player1.isOut()) {
				gameEnd(false);
			}
		}
		else {
			if (!player1.isOut()) {
				activePlayer = player1;
				return;
			}
			
			if ( player2.isOut()) {
				gameEnd(false);
			}
	}
	}
	private void gameEnd(boolean win) {
		this.gameOver = true;

		if (win) {
			System.out.println("Atspëtas þodis yra " + word.getWord().toUpperCase() + "\nÞaidimo laimëtojas - "
					+ this.activePlayer.getName());

		} else {
			System.out.println("Neatspëtas þodis yra " + word.getWord().toUpperCase() + "\nZaidimas baigtas");
		}
		
		
		
	}
	private void drawHangman(int step) {
	
		String[] hang = { 
			
			"||",
			"||", 
			"||", 
			"||",
			"||",
			"||",
		    "//////////"
	};
	String[] man = {
	"||=====   ",//7
	"||    |   ",//6 
	"||    O   ", //5
	"||    |   ",//4=| 3= /| 2=/|\ 
	"||   /     ",//1=/ 0=\
	"||        ",
    "//////////"};
	
	
	switch (step) {
	case 7: { for(int i = 0;i <8-step;i++) {
	          hang[i] = man[i];
			}
			break;
	}
	case 6: { for(int i = 0;i <8-step;i++) {
			hang[i] = man[i];
			}
		break;
	}
	case 5: { for(int i = 0;i <8-step;i++) {
		hang[i] = man[i];
	}
	break;
	}
	case 4: { for(int i = 0;i <8-step;i++) {
		hang[i] = man[i];
	}
	break;
	}
	case 3: { for(int i = 0;i <8-step-1;i++) {
		hang[i] = man[i];
	}
	hang[3] = "||   /|  ";
	break;
	}
	case 2: { for(int i = 0;i <8-step-2;i++) {
		hang[i] = man[i];
	}
	hang[3] = "||   /|\\ ";
	break;
	}
	case 1: { for(int i = 0;i <8-step-2;i++) {
		hang[i] = man[i];
		
	}
	
	break;
	}
	case 0: { for(int i = 0;i <8-step-3;i++) {
		hang[i] = man[i];
	}
	hang[3] = "||   /|\\ ";
	hang[4] = "||   / \\ ";
	break;
	}
	
	}
	
	System.out.println("\n" + activePlayer.getName() + " spëjimas neteisingas \n");
for(String line : hang) {
	System.out.println(line);
}
}
}
