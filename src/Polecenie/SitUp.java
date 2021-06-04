package Polecenie;

public class SitUp implements Command {
    @Override
    public void execute() {
        System.out.println("Zrób brzuszek!");
    }
}
