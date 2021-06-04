package Interpreter;

public class MathExpressionManagement {

    public static boolean isMathOperator(String operator) {
        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
            return true;
        } else {
            return  false;
        }
    }

    public static Expression doMathOperation(String operator, Expression firstNumber, Expression secondNumber){
        switch (operator){
            case "+":
                return new AddExpression(firstNumber, secondNumber);
            case "-":
                return new SubtractExpression(firstNumber, secondNumber);
            case "*":
                return  new MultiplyExpression(firstNumber, secondNumber);
            case "/":
                return new DivideExpression(firstNumber, secondNumber);
        }

        return null;
    }
}
