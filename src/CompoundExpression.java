

/*
An abstract class called CompoundExpression that inherits from Expression and represents a compound arithmetic expression
 */
abstract class CompoundExpression extends Expression
{
    protected final Expression x1;
    protected final Expression x2;


    public CompoundExpression(Expression e1, Expression e2 )
    {
        this.x1 = e1;
        this.x2 = e2;
    }


    @Override
    abstract public String toString();
}
