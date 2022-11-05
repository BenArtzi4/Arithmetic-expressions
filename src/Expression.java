
/*
An abstract class that represents an arithmetic expression
 */
abstract class Expression
{

    /*
    Define abstract method
    */
    abstract public double calculate();

    /*
    A method that checks whether the value of the two expressions is equal
     */
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Expression)
        {
            return this.calculate() == ((Expression) obj).calculate();
        }
        return false;
    }

    /*
    Abstract method of the toString method
     */
    @Override
    abstract public String toString();


    /*
    A method for rounding the number to two digits after the decimal point
     */
    public static double round(double number)
    {
        number = (Math.round(number*10));
        return number/10;
    }
}
