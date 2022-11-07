
public class Organism implements Movable {//©KS

	private int x;
	private int y;

	public Organism(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;

	}

	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "x: " + this.x + "; y: " + this.y;
	}

}
