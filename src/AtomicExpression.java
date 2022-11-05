
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


    /*
    Calculating the value of the expression
     */
    @Override
    public double calculate()
    {
        return this.num;
    }


    /*
    Return the expression as String
     */
    public String toString()
    {
        return round(this.num) + "";
    }
}
