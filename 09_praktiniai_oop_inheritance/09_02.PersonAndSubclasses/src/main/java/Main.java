import java.util.ArrayList;

public class Main {// ©KS

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Teacher("Dada Barb","Mussolini 15, Rome", 1200));
		persons.add(new Student("Esko Ukkonen", "mannerheiminte 15, Helsinki"));

//    	Person ada = new Person("Ada Lovelace","24 Maddox st.");
//    Student esko = new Student("Esko Ukkonen","mannerheiminte 15, Helsinki");
//    Teacher dada = new Teacher("Dada Barb","Mussolini 15, Rome", 1200);

//		System.out.println(esko);
//		esko.study();
//		System.out.println(dada);
		
		printPersons(persons);

	}

	public static void printPersons(ArrayList<Person> persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
