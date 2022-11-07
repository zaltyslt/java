

public class Student implements Comparable<Student>{//©KS

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);
	}

	

}
