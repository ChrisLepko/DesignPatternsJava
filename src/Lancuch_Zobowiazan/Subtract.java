package Lancuch_Zobowiazan;

public class Subtract extends Chain {

    public Subtract() {
        super(new Add());
    }

    @Override
    public void calculate(int firstInteger, int secondInteger, String calculationName) {
        if("sub".equalsIgnoreCase(calculationName)){
            System.out.println("Wynik odejmowania: " + (firstInteger - secondInteger));
        } else {
            next.calculate(firstInteger, secondInteger, calculationName);
        }
    }
}
