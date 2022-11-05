
/*
A class representing a subtraction expression
 */
public class SubtractionExpression extends CompoundExpression
{
    public SubtractionExpression(Expression e1, Expression e2)
    {
        super(e1, e2);
    }

    /*
    Calculation of the value obtained from the operation and the numbers
     */

    @Override
    public double calculate()
    {
        return x1.calculate() - x2.calculate();
    }

    /*
    Return the expression as String
     */
    @Override
    public String toString()
    {
        return x1.toString() + " - " + x2.toString();
    }
}
