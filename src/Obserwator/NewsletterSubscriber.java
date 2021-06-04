package Obserwator;

public class NewsletterSubscriber implements Observer {

    private String username;

    public NewsletterSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(Article article) {
        System.out.println(username + ": Masz do przeczytania nowy artykuł: " + article.getArticle());
    }
}
