package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
	// argumentas rodo i klase kuri implementuoja UserInterface,
	// kad butu galima paduoti bet kokia klase, kuri implementuoja UserInterface.
	private UserInterface userDo;

	public ApplicationLogic(UserInterface ui) {
		// TODO Auto-generated constructor stub
		this.userDo = ui;
	}

	public void execute(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Application logic is working");
			userDo.update();
		}
	}

}
