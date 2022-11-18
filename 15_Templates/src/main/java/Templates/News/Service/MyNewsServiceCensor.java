package Templates.News.Service;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;

import java.util.ArrayList;
import java.util.List;

public class MyNewsServiceCensor implements NewsService {
    NewsService newsService;
    List<String> swearwords;
    public MyNewsServiceCensor(NewsService newsService) {
   this.newsService = newsService;

    }

    @Override
    public List<Article> getArticles() {
        List<Article> tempList = new ArrayList<>();

        for(Article article : newsService.getArticles()){
           tempList.add(new CensoredArticle(article, new SwearWords()));
        }
        for(int i = 0; i < tempList.size(); i++){
            if(tempList.get(i).getHeading() == null){
                tempList.remove(i);
            }
        }
        return   tempList;
    }
}
