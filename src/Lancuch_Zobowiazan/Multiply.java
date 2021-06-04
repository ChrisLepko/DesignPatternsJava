package Lancuch_Zobowiazan;

public class Multiply extends Chain {

    public Multiply() {
        super(new Subtract());
    }

    @Override
    public void calculate(int firstInteger, int secondInteger, String calculationName) {
        if("mpy".equalsIgnoreCase(calculationName)){
            System.out.println("Wynik mnożenia: " + (firstInteger * secondInteger));
        } else {
            next.calculate(firstInteger, secondInteger, calculationName);
        }
    }
}
