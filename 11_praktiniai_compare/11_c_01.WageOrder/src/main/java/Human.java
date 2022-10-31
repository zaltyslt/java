
public class Human implements Comparable<Human>{//�KS
    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

	@Override
	public int compareTo(Human o) {
		// TODO Auto-generated method stub
//		if(this.wage) {}
		return o.wage - this.wage; 
	}
    
}
