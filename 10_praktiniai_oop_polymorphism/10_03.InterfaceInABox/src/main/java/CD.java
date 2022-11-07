
public class CD implements Packable {//©KS
	private String author;
	private String name;
	private int year;
	private final double CD_WEIGHT = 0.1;

	public CD(String author, String name, int year) {
		this.author = author;
		this.name = name;
		this.year = year;
	}

	@Override
	public double weight() {
		
		return this.CD_WEIGHT;
	}
	
	@Override
	public String toString() {
		return author + ": " + name + " (" + year + ")";
	}

	
	
}
