
public class Book {

	private String title;
	private int numOfPages;
	private int publicatonYear;

	//©KS
	public Book(String title, int numOfPages, int publicatonYear) {
		this.title = title;
		this.numOfPages = numOfPages;
		this.publicatonYear = publicatonYear;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public int getPublicatonYear() {
		return publicatonYear;
	}

	public void setPublicatonYear(int publicatonYear) {
		this.publicatonYear = publicatonYear;
	}

	
	 public String toString(String param) {
        if(param.equals("everything")) {
		return this.title + ", " + this.numOfPages + " pages, " + publicatonYear;
		}
        if(param.equals("name")) {
    		return this.title;
    	}
        return "";
    }
	
	
}
