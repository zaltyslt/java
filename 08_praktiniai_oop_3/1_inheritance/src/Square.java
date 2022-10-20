
public class Square extends Rectangle {

	public Square() {
		super();
		
	}
	public Square(Double side) {
		super(side, side);
	}
	
	public Square(Double side, String collor, boolean filled) {
		super(side, side, collor, filled);
	}
	
	/**
	 * @return the side/width/length
	 */
	public Double getSide() {
		return super.getWidth();
	}
	/**
	 * @param width the width to set
	 */
	public void setSide(Double width) {
		super.setWidth(width);
		super.setWidth(width);
	}
	
	/**
	 * @return the width
	 */
	public Double getWidth() {
		return this.getSide();
	}
	@Override
	public void setWidth(Double width) {
		this.setSide(width);
	}
	
	@Override
	public void setLength(Double width) {
		this.setSide(width);
	}
	
	@Override
	public String toString() {
		return "A Square with side=" + this.getSide() + " which is a subclass of " + super.toString();
	}
}
