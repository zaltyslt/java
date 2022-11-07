
public enum Education {
	PHD("Doctoral degree"), MA ("Masters degree"), BA("Bachelors degree"), HS ("High School diploma");

	private String description;
	
	private Education(String string) {
		this.description = string;
	}
	
	String getDescription(String abr) {
		return description;
	}
}
