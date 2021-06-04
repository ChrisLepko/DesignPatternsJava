package Lancuch_Zobowiazan;

public abstract class Chain {

    protected Chain next;

    public Chain(Chain next){
        this.next = next;
    }

    public abstract void calculate(int firstInteger, int secondInteger, String calculationName);
}
