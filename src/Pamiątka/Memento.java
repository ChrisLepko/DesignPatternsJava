package Pamiątka;

public class Memento {
    private final String state;

    public Memento(String state){
        super();
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
