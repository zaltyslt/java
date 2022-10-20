
public class Rectangle extends Shape {

	private Double width; 
	private Double length;
	
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	public Rectangle(Double width, Double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(Double width, Double length, String collor, boolean filled) {
		super(collor, filled);
		this.width = width;
		this.length = length;
	}
	
	@Override
	public String getColor() {
		return this.getColor();
	}
	
	
	/**
	 * @return the width
	 */
	public Double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(Double width) {
		this.width = width;
	}
	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(Double length) {
		this.length = length;
	}
	
	@Override
	public Double getArea() {
		return this.width * this.length;
	}
		
	public Double getPerimeter() {
		return 2 * (this.width + this.length);
	}
	@Override
	public String toString() {
		return "A Rectangle with color=" + this.getColor() + " which is a subclass of " + super.getClass();
	}
	
}
