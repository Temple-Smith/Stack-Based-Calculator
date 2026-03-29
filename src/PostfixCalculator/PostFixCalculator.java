package PostfixCalculator;

import ADTStack.StackInterface;
import ArrayBasedImplementation.StackImplementation;
import BST.BinarySearchTree;

public class PostFixCalculator {

    public BinarySearchTree variableTree;
    private StackInterface<Integer> stack;

    //constructor
    public PostFixCalculator() {
        variableTree = new BinarySearchTree();
        stack = new StackImplementation<>();
    }

    public void setVariable(String key, int value) {
        variableTree.insert(key, value);
    }

    public int evaluatePostfixExpression(String expression) {
        //Parse the expression by spaces. Tokenize.
        String [] tokens = expression.split(" ");

        for (String token : tokens) {

            if (isOperator(token)) {
                //pop 2 operands - orders matter for subtraction and addition
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a, b, token));

            } else {
                // Token is either a variable name or an integer
                try {
                    // Check to take it as integer first.
                    int number = Integer.parseInt(token);
                    stack.push(number);
                } catch (NumberFormatException e) {
                    //It's not an integer. It's a variable.
                    int value = variableTree.search(token);
                    stack.push(value);
                }
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/");
    }

    private int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Error: Division by zero.");
                return a/b;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    //Print the BST
    public void displayVariableTree() {
        System.out.println(variableTree.displayTree(variableTree.root, 0));
    }

}
