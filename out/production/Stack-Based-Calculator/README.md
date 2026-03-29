# Stack-Based Calculator

## How to Run

1. Download or locate the JAR file: `StackbasedCalculator.jar`
Located inside Stack-Based_Calculator/src/Stackbased Calculator.jar
2. Open a terminal (Command Prompt on Windows, Terminal on Mac/Linux).
3. Navigate to the folder containing the JAR file:

```
cd path/to/folder
```

4. Run the program:

```
java -jar StackbasedCalculator.jar
```

A dialog box will appear — click OK to start the program.

The program will evaluate 8 postfix expressions and print the results to the terminal, including the Binary Search Tree visualization and deletion confirmation after each expression.

## Expected Output (per expression)

========================================
Postfix Expression 1: x y + z *
========================================
Binary Search Tree:
```
		||==> z:4
	||==> y:3
||==> x:5
```

Result: 32
All variables have been deleted.
BST after deletion:
