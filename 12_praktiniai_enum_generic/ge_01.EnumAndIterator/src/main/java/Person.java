
public class Person {//©KS

	private String name;
	private Education education;
	
	public Person(String name, Education education) {
		this.name = name;
		this.education = education;
	}

	public Education getEducation() {
		return this.education;
	}
	public String getEducationDescription() {
		return this.education.getDescription();
	}
	

	@Override
	public String toString() {
		return name + ", " + education.toString();
	}
	
	
}
