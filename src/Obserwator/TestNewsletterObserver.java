package Obserwator;

public class TestNewsletterObserver {
    public static void main(String[] args) {

        Subject newsletter = new Newsletter();

        Observer adam = new NewsletterSubscriber("Adam");
        Observer ania = new NewsletterSubscriber("Ania");
        Observer rafał = new NewsletterSubscriber("Rafał");

        newsletter.addNewObserver(adam);

        newsletter.notifyObservers(new Article("Wspaniały artykuł"));
        System.out.println();

        newsletter.addNewObserver(ania);
        newsletter.addNewObserver(rafał);

        newsletter.notifyObservers(new Article("Drugi niesamowity artykuł"));
        System.out.println();

        newsletter.removeObserver(ania);

        newsletter.notifyObservers(new Article("Trzeci znakomity artykuł"));
    }
}
