
public class Items {
private String id;
private String name;
public Items(String id, String name) {
	this.id = id;
	this.name = name;
}

public String getId() {
	return id;
}
public String getName() {
	return name;
}
@Override
public boolean equals(Object item) {
	if(this == item) {
		return true;
	}
	
	if(!(this instanceof Items)) {
		return false;
	}
	Items tempItem = (Items) item;
	if(this.id.equals(tempItem.id)) {
		return true;
	}
	
	return false;
}


}
