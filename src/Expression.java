
/*
An abstract class that represents an arithmetic expression
 */
abstract class Expression
{
    /*
    Defining abstract methods
     */
    abstract public double calculate();

    @Override
    abstract public boolean equals(Object obj);
}
