package Lancuch_Zobowiazan;

public class TestChainResponsibilityCalculations {
    public static void main(String[] args) {

        Chain calculationChain = new Devide();

        calculationChain.calculate(25, 5, "div");
        calculationChain.calculate(25, 5, "mpy");
        calculationChain.calculate(25, 5, "sub");
        calculationChain.calculate(25, 5, "add");
        calculationChain.calculate(25, 5, "WrongName");
    }
}
