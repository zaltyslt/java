
public class Book {

	private String name;
	private int publicationYear;

	public Book(String name, int publicationYear) {
		this.name = name;
		this.publicationYear = publicationYear;
	}

	public String getName() {
		return name;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	@Override
	public boolean equals(Object book) {
		Book tempBook = (Book) book;
		if (this.name.equals(tempBook.name) && this.publicationYear == tempBook.publicationYear) {
			return true;
		}
		return false;
	}

}
