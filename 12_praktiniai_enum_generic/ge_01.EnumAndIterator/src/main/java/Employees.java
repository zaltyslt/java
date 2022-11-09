import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employees {//©KS

	private ArrayList<Person> employees = new ArrayList<>();

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public void add(Person personToAdd) {
		this.employees.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd) {
		this.employees.addAll(peopleToAdd);
	}

	public void print() {
		Iterator<Person> itr = employees.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void print(Education education) {
		Iterator<Person> itr = employees.iterator();
		while (itr.hasNext()) {
			Person tempItr = itr.next();
			if (tempItr.getEducation().equals(education)) {
				System.out.println(tempItr);
			}
		}
	}

	public void fire(Education education) {
		Iterator<Person> itr = employees.iterator();
		ArrayList<Person> tempEmployeesList = new ArrayList<>();
		while (itr.hasNext()) {
			Person tempItr = itr.next();
			if (tempItr.getEducation().equals(education)) {
				tempEmployeesList.add(tempItr);
			} 
		}
		this.employees.removeAll(tempEmployeesList);
	}

}
