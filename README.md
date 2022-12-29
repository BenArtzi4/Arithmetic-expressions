#Arithmetic Expression Program

Welcome to the Arithmetic Expression program, written in Java!

This program represents arithmetic expressions that contain only the addition and subtraction operations. An arithmetic expression can be one of the following:

[ ] Atomic expression: A real number, such as 2, 6, or 10.
[ ] Complex expression: An expression that consists of two operands that are arithmetic expressions, and a connection operator, such as 5-7+12 or 3+5.

## The program has the following classes:

* Expression: An abstract class that represents an arithmetic expression. It has an abstract method called calculate() that returns the result of the arithmetic expression. The equals() method is overridden in this class to compare the results of two arithmetic expressions.
* AtomicExpression: A class that inherits from Expression and represents an atomic arithmetic expression. It has a constructor that accepts a real number and initializes the expression using it. It also has a toString() method that returns the result of the expression in the form of a string.
* CompoundExpression: An abstract class that inherits from Expression and represents a compound arithmetic expression. A complex expression has two operands which are arithmetic expressions. It has a constructor that receives two parameters of type Expression and initializes the attributes.
* AdditionExpression and SubtractionExpression: Classes that inherit from CompoundExpression and represent an addition expression and a subtraction expression, respectively. They have constructors that accept two parameters of type Expression and initialize the attributes with them. They also have a toString() method that returns the expression in the form of a string.
