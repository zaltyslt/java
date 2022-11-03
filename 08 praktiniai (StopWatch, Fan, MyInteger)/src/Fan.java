
public class Fan {//©KS

	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}

//	A method named toString() that returns a string description for the fan. 
//	If the fan is on, the
//	method returns the fan speed, color, and radius in one combined string. 
//	If the fan is not on, the
//	method returns the fan color and radius along with the string “fan is off” in one combined string.
	
	@Override
	public String toString() {
		if(this.on) {
			return "Speed " + getSpeed() + ", color " + getColor() +", radius " + getRadius() +".";
		}else {
			return "Color " + getColor() +", radius " + getRadius() +", fan is off.";
		}
		
	}
	
	
	
	/**
	 * @return the sLOW
	 */
	public  int getSLOW() {
		return SLOW;
	}

	/**
	 * @return the mEDIUM
	 */
	public int getMEDIUM() {
		return MEDIUM;
	}

	/**
	 * @return the fAST
	 */
	public int getFAST() {
		return FAST;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the on
	 */
	public boolean isOn() {
		return on;
	}

	/**
	 * @param on the on to set
	 */
	public void setOn(boolean on) {
		this.on = on;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
