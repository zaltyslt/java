package pvz.patterns.adapter;

public class Main {

	public static void main(String[] args) {
		aplok(new LojikasStaugikasAdapter(new Staugikas()));
	}

	public static void aplok(Lojikas lojikas) {
		lojikas.lok("Ko žiūri?");
	}
}

interface Lojikas {
	void lok(String ka);
}

class Staugikas {
	void stauk(String ka) {
		System.out.println(ka + "!!!");
	}
}

class LojikasStaugikasAdapter implements Lojikas {

	private Staugikas staugikas;

	public LojikasStaugikasAdapter(Staugikas staugikas) {
		this.staugikas = staugikas;
	}

	@Override
	public void lok(String ka) {
		staugikas.stauk(ka);
	}
}
