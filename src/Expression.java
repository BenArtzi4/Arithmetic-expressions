
/*
An abstract class that represents an arithmetic expression
 */
abstract class Expression
{

    /*
    Define abstract method
    */
    abstract public double calculate();

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Expression)
        {
            return this.calculate() == ((Expression) obj).calculate();
        }
        return false;
    }

    @Override
    abstract public String toString();

    public static double round(double number)
    {
        number = (Math.round(number*10));
        return number/10;
    }
}
