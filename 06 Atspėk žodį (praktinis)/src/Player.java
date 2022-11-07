
public class Player {// ©KS
	private String name;
	private int triesLeft;
//	private boolean active;
	private boolean isOut;

	public Player(String name) {
		this.name = name.toUpperCase();
		this.isOut = false;
		this.triesLeft = 9;
	}

	/**
	 * @return the isOut
	 */
	public boolean isOut() {
		return isOut;
	}

	/**
	 * @param isOut the isOut to set
	 */
	public void setOut() {
		this.isOut = true;
		this.triesLeft = 0;
	}

	public int getTriesLeft() {
		return triesLeft;
	}

	/**
	 * @param triesLeft the triesLeft to set
	 */
	public void setTriesLeft(int num) {
		this.triesLeft += num;
		if (this.triesLeft <= 0) {
			this.setOut();
		}

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
