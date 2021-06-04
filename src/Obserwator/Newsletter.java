package Obserwator;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject{

    private List<Observer> newsletterSubscribers = new ArrayList<>();

    @Override
    public void addNewObserver(Observer observer) {
        newsletterSubscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        newsletterSubscribers.remove(observer);
    }

    @Override
    public void notifyObservers(Article article) {
        for(Observer tmp : newsletterSubscribers){
            tmp.update(article);
        }
    }
}
