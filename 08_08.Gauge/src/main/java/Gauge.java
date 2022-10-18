
public class Gauge {

	private int value;
	
	public Gauge() {
	this.value = 0;	
	}
	
	public void increase() {
		// TODO Auto-generated method stub
		if(this.value < 5) {
			this.value++;
		}
	}
	
	public void decrease() {
		// TODO Auto-generated method stub
		if(this.value > 0) {
			this.value++;
		}
	}
	
	public int value() {
		return this.value;
	}
	
	public boolean full() {
		if (this.value == 5) {
			return true;
		}else {
			return false;
		}
	}
}
