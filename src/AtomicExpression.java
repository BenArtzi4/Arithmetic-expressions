
/*
A class represents an atomic arithmetic expression
 */
public class AtomicExpression extends Expression
{

    public AtomicExpression(double x)
    {
        this.num1 = x;
    }

    @Override
    public double calculate()
    {
        return this.num1;
    }


    public String toString()
    {
        return this.num1 + "";
    }
}
