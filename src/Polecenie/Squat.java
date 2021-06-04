package Polecenie;

public class Squat implements Command {
    @Override
    public void execute() {
        System.out.println("Zrób przysiad!");
    }
}
