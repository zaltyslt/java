
public class HealthStation {

	private int weighings = 0;
	
	public int weigh(Person person) {
weighings++;
		return person.getWeight();
	}

	public void feed(Person person) {

		person.setWeight(person.getWeight() + 1);;
	}

	/**
	 * @return the weighings
	 */
	public int weighings() {
		return weighings;
	}

	
	
	
}
