import java.util.ArrayList; // import the ArrayList class

public class Main
{
    public static void main (String [] args)
    {
        ArrayList<Expression> expressions = new ArrayList<Expression>(); // Create an ArrayList object


        AtomicExpression num1 = new AtomicExpression(5);
        AtomicExpression num2 = new AtomicExpression(2);
        System.out.println(num1.equals(num2));

        AdditionExpression num3 = new AdditionExpression(1, 4);
        System.out.println(num1.equals(num3));
        System.out.println(num3.equals(num1));
        System.out.println(num2.equals(num3));
        System.out.println(num3.equals(num2));

        SubtractionExpression num4 = new SubtractionExpression(6,4);
        System.out.println(num2.equals(num4));
        System.out.println(num4.equals(num2));
        System.out.println(num1.equals(num4));
        System.out.println(num4.equals(num1));
        System.out.println(num4.toString());


    }
}
