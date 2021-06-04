package Polecenie;

public class Bend implements Command {
    @Override
    public void execute() {
        System.out.println("Zrób skłon!");
    }
}
