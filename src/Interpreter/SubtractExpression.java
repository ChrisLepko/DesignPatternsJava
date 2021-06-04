package Interpreter;

public class SubtractExpression implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public SubtractExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return firstExpression.interpreter() - secondExpression.interpreter();
    }
}
