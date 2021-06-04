package Interpreter;

public class MultiplyExpression implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public MultiplyExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return firstExpression.interpreter() * secondExpression.interpreter();
    }
}
