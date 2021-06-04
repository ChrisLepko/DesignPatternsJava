package Lancuch_Zobowiazan;

public class Add extends Chain {

    public Add() {
        super(null);
    }

    @Override
    public void calculate(int firstInteger, int secondInteger, String calculationName) {
        if("add".equalsIgnoreCase(calculationName)){
            System.out.println("Wynik dodawnia: " + (firstInteger + secondInteger));
        }  else {
            System.out.println("Nie ma nic do zrobienia");
        }
    }
}
