

import java.util.ArrayDeque;
import java.util.Queue;

public class Pipe <T>{//©KS

	private Queue<T> pipe = new ArrayDeque<>();
	
	public Pipe() {
		// TODO Auto-generated constructor stub
	}
	public void putIntoPipe(T value) {
		this.pipe.add(value);
	}
	
	public boolean isInPipe() {
		if(!this.pipe.isEmpty()) {
			return true;
		}
		return false;
	}
	
public T takeFromPipe() {

		return this.pipe.poll();
	}
}
