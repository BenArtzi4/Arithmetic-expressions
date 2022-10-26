
abstract class CompoundExpression extends Expression
{
    private double num1;
    private double num2;

    public CompoundExpression(double x, double y )
    {
        this.num1 = x;
        this.num2 = y;
    }

    public double getNum1()
    {
        return num1;
    }

    public double getNum2()
    {
        return num2;
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
