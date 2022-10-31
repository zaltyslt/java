
public class StoryBook implements Comparable<StoryBook>{//©KS

	private String title;
	private int ageRecommendations;

	public StoryBook(String title, int ageRecommendations) {
		this.title = title;
		this.ageRecommendations = ageRecommendations;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the ageRecommendations
	 */
	public int getAgeRecommendations() {
		return ageRecommendations;
	}

	/**
	 * @param ageRecommendations the ageRecommendations to set
	 */
	public void setAgeRecommendations(int ageRecommendations) {
		this.ageRecommendations = ageRecommendations;
	}
	@Override
	public int compareTo(StoryBook book) {
		return this.ageRecommendations - book.ageRecommendations;
	}
}
