import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {//©KS

	
	private ArrayList<Movable> herds = new ArrayList<>();

	public Herd() {
		
	}

	public void addToHerd(Movable movable) {
		herds.add(movable);
	}

	@Override
	public void move(int dx, int dy) {
		for (Movable herd : herds) {
			herd.move(dx, dy);
		}
	}

	@Override
	public String toString() {
		String text = "";
		for (Movable organism : herds) {
			text += organism.toString() + "\n";
		}
		return text;
	}
}
