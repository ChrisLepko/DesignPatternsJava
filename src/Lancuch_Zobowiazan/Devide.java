package Lancuch_Zobowiazan;

public class Devide extends Chain{

    public Devide() {
        super(new Multiply());
    }

    @Override
    public void calculate(int firstInteger, int secondInteger, String calculationName) {
        if("div".equalsIgnoreCase(calculationName)){
            System.out.println("Wynik dzielenia całkowitego: " + (firstInteger / secondInteger));
        } else {
            next.calculate(firstInteger, secondInteger, calculationName);
        }
    }
}
