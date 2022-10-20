
public class Triangle extends Shape {
 private String color;
 private boolean filled;
 
	public Triangle() {
		super();
		color = "White";
		filled = true;
	}

	public Triangle(String collor, boolean filled) {
		super(collor, filled);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	
	@Override
	public String toString() {
		return "A Triangle with color=" + this.getColor() + " which is a subclass of " + super.getClass();
	}

	
}
