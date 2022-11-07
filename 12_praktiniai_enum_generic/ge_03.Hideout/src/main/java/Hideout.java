
public class Hideout<T> {//©KS
	private T hideout;

	public Hideout() {

	}

	public void putIntoHideout(T toHide) {
		this.hideout = toHide;
	}

	public boolean isInHideout() {
		if (this.hideout != null) {
			return true;
		}
		return false;
	}

	public T takeFromHideout() {
		if (isInHideout()) {
			T tempT = this.hideout;
			this.hideout = null;
			return tempT;
		}
		return null;
	}

}
