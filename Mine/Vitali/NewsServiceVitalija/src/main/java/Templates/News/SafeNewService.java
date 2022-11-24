package Templates.News;
import java.util.ArrayList;

import java.util.List;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;

public class SafeNewService implements NewsService {

	NewsService newsService;
	List<String> swearwords;

	public SafeNewService(NewsService newsService) {

		this.newsService = newsService;
	}

	@Override
	public List<Article> getArticles() {
		
		

		List<Article> tempList = new ArrayList<>();

		for (Article article : newsService.getArticles()) {
			tempList.add(new SafeArticle(article, new Swearwords()));
		}
		for (int i = 0; i < tempList.size(); i++) {
			if (tempList.get(i).getHeading() == null) {
				tempList.remove(i);
			}
		}
		return tempList;
//		return null;
	}

}
