public class AtomicExpression extends Expression
{
    private double num;

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
        if(obj instanceof AtomicExpression)
        {
            return ((AtomicExpression) obj).num == this.num;
        }
        return false;
    }

    public String toString()
    {
        return this.num + "";
    }
}
