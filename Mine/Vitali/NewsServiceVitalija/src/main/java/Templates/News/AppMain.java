package Templates.News;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;

class AppMain{
    public static void main(String[] args) {
    NewsService service = new SafeNewService(new NewsServiceImpl());
     List<Article> oldArticles = service.getArticles();
     oldArticles.remove(0);

        for (Article article : oldArticles){
            System.out.println(article.getHeading() +"\n" + article.getBrief()+ "\n");
        }

    }
}