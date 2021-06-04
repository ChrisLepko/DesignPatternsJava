package Interpreter;

import java.util.Stack;

public class TestMathInterpreter {

    public static void main(String[] args) {

        String stringExpression = "8 2 / 4 3 * + 4 2 + + 14 6 - + 3 2 + /";
        Stack<Expression> mathOperation = new Stack<>();

        String[] operationChars = stringExpression.split(" ");

        for(String currentChar : operationChars){
            if(MathExpressionManagement.isMathOperator(currentChar)){
                Expression secondNumber = mathOperation.pop();
                Expression firstNumber = mathOperation.pop();
                Expression mathOperationResult = MathExpressionManagement.doMathOperation(currentChar, firstNumber, secondNumber);
                int result = mathOperationResult.interpreter();
                mathOperation.push(new Number(result));
            } else {
                Expression number = new Number(Integer.parseInt(currentChar));
                mathOperation.push(number);
            }
        }

        System.out.println("Wynik działania przedstawionego w postaci: " + stringExpression + " to: " + mathOperation.pop().interpreter());

    }
}
