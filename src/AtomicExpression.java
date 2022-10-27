
/*
A class represents an atomic arithmetic expression
 */
public class AtomicExpression extends Expression
{
    private final double num;

    public AtomicExpression(double x)
    {
        this.num = x;
    }

    @Override
    public double calculate()
    {
        return num;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Expression)
        {
            return ((Expression) obj).calculate() == this.num;
        }
        return false;
    }

    public String toString()
    {
        return this.num + "";
    }
}
