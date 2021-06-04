package Interpreter;

public class AddExpression implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public AddExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return firstExpression.interpreter() + secondExpression.interpreter();
    }
}
