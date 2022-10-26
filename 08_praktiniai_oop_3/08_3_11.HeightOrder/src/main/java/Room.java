import java.util.ArrayList;

public class Room {
	private ArrayList<Person> persons;

	public Room() {
		this.persons = new ArrayList<>();
	}

	public void add(Person person) {
		this.persons.add(person);
	}

	public boolean isEmpty() {

		if (this.persons.size() > 0) {
			return false;
		}

		return true;
	}

	public ArrayList<Person> getPersons() {
		return this.persons;
	}

	public Person shortest() {

		if (persons.size() > 0) {
			int shortH = this.persons.get(0).getHeight();
			int shortestPos = 0;

			for (int i = 1; i < this.persons.size(); i++) {
				if (shortH > this.persons.get(i).getHeight()) {
					shortH = this.persons.get(i).getHeight();
					shortestPos = i;
				}
			}
			return persons.get(shortestPos);
		} else {
			return null;
		}
	}

	public Person take() {
		if (persons.size() == 0) {
			return null;
		}

		Person person = this.shortest();
		persons.remove(persons.indexOf(person));

		return person;
	}

}
