

/*
An abstract class called CompoundExpression that inherits from Expression and represents a compound arithmetic expression
 */
abstract class CompoundExpression extends Expression
{
    private double num2;

    public CompoundExpression(Expression x, Expression y )
    {
        this.num1 = x.num1;
        this.num2 = y.num1;
    }

    public double getNUM1()
    {
        return this.num1;
    }

    public double getNUM2()
    {
        return this.num2;
    }
}
