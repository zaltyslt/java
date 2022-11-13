package boxes;

import java.util.Objects;

public class Thing {//©KS

    private String name;
    private int weight;

    public Thing(String name) {
        this(name, 0);
    }
    
    public Thing(String name, int weight) {
    		if(weight >=0) {
    			this.name = name;
    			this.weight = weight;
    		}
		else{
			throw new IllegalArgumentException("Weight should not be negative");
		}
    }

    

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Thing)) {
			return false;
		}
		Thing other = (Thing) obj;
		return Objects.equals(name, other.name);
	}

}
