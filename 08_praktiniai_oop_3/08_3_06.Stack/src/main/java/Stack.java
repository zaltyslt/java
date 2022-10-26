import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Stack {
	
private ArrayList<String> list;
	
public Stack () {
	list = new ArrayList<>();
}

public boolean isEmpty() {
	if(list.isEmpty()) {
		return true;
	}else {
		return false;
	}
}

public void add(String value) {
	this.list.add(value);
}

public ArrayList<String> values(){
	return this.list;
}

public String take() {
	String last = this.list.get(list.size()-1);
	this.list.remove(list.size()-1);
	return last;
	
}

}
