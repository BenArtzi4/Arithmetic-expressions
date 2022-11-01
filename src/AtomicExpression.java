
/*
A class represents an atomic arithmetic expression
 */
public class AtomicExpression extends Expression
{
    double num;

    public AtomicExpression(double x)
    {
        this.num= round(x);
    }


    @Override
    public double calculate()
    {
        return this.num;
    }


    public String toString()
    {
        return round(this.num) + "";
    }
}
