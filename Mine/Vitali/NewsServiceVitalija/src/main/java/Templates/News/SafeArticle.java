package Templates.News;
import lt.vtvpmc.Article;

public class SafeArticle implements Article {

	private Article article;
	private Swearwords swearwords;

	public SafeArticle(Article article, Swearwords swearwords) {
		this.article = article;
		this.swearwords = swearwords;
	}

	@Override
	public String getBrief() {

		for (int i = 0; i < swearwords.getSwearwords().size(); i++) {

			if (this.article.getBrief().contains(swearwords.getSwearwords().get(i))) {
				return this.article.getBrief().replace(swearwords.getSwearwords().get(i), "***");
			}
		}
		return this.article.getBrief();
	}

	@Override
	public String getHeading() {
		
		for (int i = 0; i < swearwords.getSwearwords().size(); i++) {

			if (this.article.getHeading().toLowerCase().contains(swearwords.getSwearwords().get(i))) {
				return null;
			}
		}
		return this.article.getHeading();
	}

}
