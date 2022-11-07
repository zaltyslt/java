
public class CustomTacoBox implements TacoBox {//©KS
private int tacos;
	public CustomTacoBox(int tacos) {
		this.tacos = tacos;
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
