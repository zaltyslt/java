package Templates.News.Service;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        NewsService newsService = new MyNewsServiceCensor(new NewsServiceImpl());
        List<Article> articles = newsService.getArticles();
        for(Article article : articles){
            System.out.println(article.getHeading() + "\n" + article.getBrief() +"\n");
        }

    }
}
