public class SubtractionExpression extends CompoundExpression
{
    public SubtractionExpression(double x, double y)
    {
        super(x, y);
    }

    @Override
    public double calculate()
    {
        return getNUM1()- getNUM2();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public String toString()
    {
        return this.getNUM1() + " - " + this.getNUM2();
    }
}
