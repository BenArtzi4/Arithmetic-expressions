
abstract class CompoundExpression extends Expression
{
    private final double NUM1;
    private final double NUM2;

    public CompoundExpression(double x, double y )
    {
        this.NUM1 = x;
        this.NUM2 = y;
    }

    public double getNUM1()
    {
        return NUM1;
    }

    public double getNUM2()
    {
        return NUM2;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Expression)
        {
            return ((Expression) obj).calculate() == this.calculate();
        }
        return false;
    }
}
