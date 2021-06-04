package Interpreter;

public class Number implements Expression {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpreter() {
        return number;
    }
}
