
public class Circle extends Shape {
	private Double radius;

	
	
	public Circle() {
		super();
		this.radius = 1.0;
	}
	public Circle(Double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(Double radius, String collor, Boolean filled ) {
		super(collor, filled);
		this.radius = radius;
	}
	
		@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @return the radius
	 */
	public Double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public Double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	@Override
	public String toString() {
		return "A Circle with radius=" + radius + " which is a subclass of " + super.getClass();
	}
	
	
}
