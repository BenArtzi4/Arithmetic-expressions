
/*
An abstract class that represents an arithmetic expression
 */
abstract class Expression
{
    double num1;

    /*
    Define abstract methods
    */
    abstract public double calculate();

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Expression)
        {
            return ((Expression) obj).calculate() == this.num1;
        }
        return false;
    }

    @Override
    abstract public String toString();
}
