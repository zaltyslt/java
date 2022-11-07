import java.util.Comparator;

public class ByAgeAndName implements Comparator<StoryBook> {//©KS

	@Override
	public int compare(StoryBook book1, StoryBook book2) {
		// TODO Auto-generated method stub
		if (book1.getAgeRecommendations() != book2.getAgeRecommendations()) {
			return book1.getAgeRecommendations() - book2.getAgeRecommendations();
		} else {

			return book1.getTitle().compareToIgnoreCase(book2.getTitle());
		}
	}
}
