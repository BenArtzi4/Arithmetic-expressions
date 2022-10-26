public class SubtractionExpression extends CompoundExpression
{
    public SubtractionExpression(double x, double y)
    {
        super(x, y);
    }

    @Override
    public double calculate()
    {
        return getNum1()-getNum2();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public String toString()
    {
        return this.getNum1() + " - " + this.getNum2();
    }
}
