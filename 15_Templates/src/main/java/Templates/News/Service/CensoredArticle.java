package Templates.News.Service;

import lt.vtvpmc.Article;

import java.util.Locale;

import static Templates.News.Service.SwearWords.*;

public class CensoredArticle implements Article {
    private Article article;

    SwearWords swearWords;

    public CensoredArticle(Article article, SwearWords swearWords) {

        this.article = article;
        this.swearWords = swearWords;
    }

    @Override
    public String getHeading() {
        String heading = this.article.getHeading();
        for (String swearWord : this.swearWords.getSwearWords()) {

            if (heading.toLowerCase().contains(swearWord.toLowerCase())) {
                return null;
            }
        }
        return article.getHeading();
    }
        @Override
        public String getBrief() {
        String brief = this.article.getBrief();
        for(String swearWord : this.swearWords.getSwearWords()) {
            if(brief.toLowerCase().contains(swearWord.toLowerCase())){
             return brief.replace(swearWord,"***");
            }
        }
        return brief;
        }

}