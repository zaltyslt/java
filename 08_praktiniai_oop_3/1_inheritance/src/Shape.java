
public abstract class Shape {
	private String color;
	private boolean filled;

	public Shape() {
		this.color = "red";
		this.filled = true;
	}

	public Shape(String collor, boolean filled) {
		this.color = collor;
		this.filled = filled;
	}

	/**
	 * @return the collor
	 */
	abstract public String getColor();

	/**
	 * @param collor the collor to set
	 */
	public void setColor(String collor) {
		this.color = collor;
	}

	/**
	 * @return the filled
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * @param filled the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Double getArea(){
		return 0.0;
	}
	
	public Double getPerimeter(){
		return 0.0;
	}

	@Override
	public abstract String toString(); 

}
