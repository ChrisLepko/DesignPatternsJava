package Pamiątka;

import java.util.ArrayList;
import java.util.List;

public class MementosManagement {

    private List<Memento> mementos;

    public List<Memento> getMementos(){
        if (mementos == null){
            mementos = new ArrayList();
        }
        return mementos;
    }

    public void addMemento(Memento memento){
        getMementos().add(memento);
    }

    public Memento getMemento(int index){
        return getMementos().get(index);
    }
}
