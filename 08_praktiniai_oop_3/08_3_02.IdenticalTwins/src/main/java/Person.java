
import java.util.Objects;

public class Person {

	private String name;
	private SimpleDate birthday;
	private int height;
	private int weight;

	public Person(String name, SimpleDate birthday, int height, int weight) {
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
	}

	// implement an equals method here for checking the equality of objects
@Override
	public boolean equals(Object person) {
		// jei nuorodos i vienoda - adresa objektas tas pats
		
		if (this == person) {
			System.out.println("Same!");
			return true;
		}

		if (!(person instanceof Person)) {
			return false;
		};

		final Person tempPerson = (Person)person;
		
		if(!birthday.equals(tempPerson.birthday)) {
			return false;
		}
		
		
		if(!this.name.equals(tempPerson.name) || 
		 this.height != tempPerson.height ||
		 this.weight != tempPerson.weight) {
			return false;
		}
	
		return true;

	}

	
	

}
