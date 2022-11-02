
public class TripleTacoBox implements TacoBox {//©KS
	private int tacos;

	public TripleTacoBox() {
		tacos = 3;
	}

	@Override
	public int tacosRemaining() {
		return this.tacos;
	}

	@Override
	public void eat() {
		if (this.tacos > 0) {
			tacos--;
		}

	}

}
