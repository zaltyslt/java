
public class ProductWarehouse extends Warehouse {//©KS
private String name;

public ProductWarehouse(String productName, double capacity ) {
	super(capacity);
	this.name = productName;
	
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
public void setName(String newName) {
	this.name = newName;
}
@Override
public String toString() {
    return this.getName() +": "+super.toString();
}

}
