
public class Person {//©KS
private String name;
private String address;

public Person(String name, String address) {
	this.name = name;
	this.address = address;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the address
 */
public String getAddress() {
	return address;
}

/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return this.name + "\n  " + this.address;
}


}
