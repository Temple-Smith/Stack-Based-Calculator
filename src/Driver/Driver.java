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
        calculator.setVariable("m", 8);
        calculator.setVariable("n", 2);
        calculator.setVariable("p", 3);

        String expression3 = "m n * p - ";
        System.out.println("Post expression: " + expression3);
        calculator.displayVariableTree();
        int result3 = calculator.evaluatePostfixExpression(expression3);
        System.out.println("Result: " + result3);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

        //Postfix expression 4
        calculator.setVariable("s", 2);
        calculator.setVariable("r", 3);
        calculator.setVariable("q", 7);

        String expression4 = "q r s * +";
        System.out.println("Post expression: " + expression4);
        calculator.displayVariableTree();
        int result4 = calculator.evaluatePostfixExpression(expression4);
        System.out.println("Result: " + result4);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

        //Postfix expression 5
        calculator.setVariable("d", 1);
        calculator.setVariable("e", 2);
        calculator.setVariable("f", 3);

        String expression5 = "d e f * + 4 +";
        System.out.println("Post expression: " + expression5);
        calculator.displayVariableTree();
        int result5 = calculator.evaluatePostfixExpression(expression5);
        System.out.println("Result: " + result5);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

        //Postfix expression 6
        calculator.setVariable("g", 2);
        calculator.setVariable("h", 3);
        calculator.setVariable("i", 4);
        calculator.setVariable("j", 5);

        String expression6 = "g h i + * j /";
        System.out.println("Post expression: " + expression6);
        calculator.displayVariableTree();
        int result6 = calculator.evaluatePostfixExpression(expression6);
        System.out.println("Result: " + result6);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

        //Postfix express 7
        calculator.setVariable("k", 2);
        calculator.setVariable("l", 3);
        calculator.setVariable("m", 4);
        calculator.setVariable("n", 5);

        String expression7 = "k l + m n + *";
        System.out.println("Post expression: " + expression7);
        calculator.displayVariableTree();
        int result7 = calculator.evaluatePostfixExpression(expression7);
        System.out.println("Result: " + result7);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

        //Postfix express 8
        calculator.setVariable("o", 9);
        calculator.setVariable("p", 3);
        calculator.setVariable("q", 5);
        calculator.setVariable("r", 2);
        calculator.setVariable("s", 7);

        String expression8 = "o p / q r + * s +";
        System.out.println("Post expression: " + expression8);
        calculator.displayVariableTree();
        int result8 = calculator.evaluatePostfixExpression(expression8);
        System.out.println("Result: " + result8);

        calculator.variableTree.deleteAll();
        System.out.println("\n");
        System.out.println("All variables have been deleted.");

    }
}
