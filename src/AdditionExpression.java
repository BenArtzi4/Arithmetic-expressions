
/*
A class that represents an addition expression
 */
public class AdditionExpression extends CompoundExpression
{
    public AdditionExpression(double x, double y)
    {
        super(x, y);
    }

    /*
    Calculation of the value obtained from the operation and the numbers
     */
    @Override
    public double calculate()
    {
        return getNUM1()+ getNUM2();
    }

    @Override
    public String toString()
    {
        return this.getNUM1() + " + " + this.getNUM2();
    }
}
