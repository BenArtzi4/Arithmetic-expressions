
/*
A class that represents an addition expression
 */
public class AdditionExpression extends CompoundExpression
{
    public AdditionExpression(Expression e1, Expression e2)
    {
        super(e1, e2);
    }

    /*
    Calculation of the value obtained from the operation and the numbers
     */
    @Override
    public double calculate()
    {
        return x1.calculate()+ x2.calculate();
    }

    @Override
    public String toString()
    {
        return x1.toString() + " + " + x2.toString();
    }
}
