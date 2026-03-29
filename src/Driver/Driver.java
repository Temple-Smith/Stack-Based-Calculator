package Driver;

import PostfixCalculator.PostFixCalculator;

public class Driver {
    public static void main(String[] args) {

        PostFixCalculator calculator = new PostFixCalculator();
        System.out.println("*** Sample Run ***");

        //Postfix expression 1
        calculator.setVariable("x", 5);
        calculator.setVariable("y", 3);
        calculator.setVariable("z", 4);

        String expression1 = "x y * z +";
        System.out.println("Post expression: " + expression1);
        calculator.displayVariableTree();
        int result1 = calculator.evaluatePostfixExpression(expression1);
        System.out.println("Result: " + result1);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

        //Postfix expression 2
        calculator.setVariable("a", 2);
        calculator.setVariable("b", 3);
        calculator.setVariable("c", 4);

        String expression2 = "a b + c *";
        System.out.println("Post expression: " + expression2);
        calculator.displayVariableTree();
        int result2 = calculator.evaluatePostfixExpression(expression2);
        System.out.println("Result: " + result2);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

        //Postfix expression 3
        


    }
}
