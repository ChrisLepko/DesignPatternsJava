package Obserwator;

public interface Subject {

    void addNewObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Article article);
}
