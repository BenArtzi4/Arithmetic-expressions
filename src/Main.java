import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;


public class Main
{
    public static void main (String [] args)
    {
        // Create an ArrayList object
        ArrayList<Expression> expressions = new ArrayList<>();

        AtomicExpression num1 = new AtomicExpression(generateRandomNumber());
        AtomicExpression num2 = new AtomicExpression(generateRandomNumber());
        AdditionExpression num3 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        SubtractionExpression num4 = new SubtractionExpression(generateRandomNumber(),generateRandomNumber());
        Expression num5 = new AtomicExpression(generateRandomNumber());
        Expression num6 = new AtomicExpression(generateRandomNumber());
        Expression num7 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        Expression num8 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        Expression num9 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        Expression num10 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num11 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num12 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num13 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num14 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num15 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num16 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        Expression num17 = new AtomicExpression(generateRandomNumber());
        Expression num18 = new AtomicExpression(generateRandomNumber());
        Expression num19 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        Expression num20 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        Expression num21 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        Expression num22 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num23 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num24 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num25 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num26 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num27 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        CompoundExpression num28 = new SubtractionExpression(generateRandomNumber(), generateRandomNumber());
        AdditionExpression num29 = new AdditionExpression(generateRandomNumber(), generateRandomNumber());
        SubtractionExpression num30 = new SubtractionExpression(generateRandomNumber(),generateRandomNumber());

        expressions.add(num1);
        expressions.add(num2);
        expressions.add(num3);
        expressions.add(num4);
        expressions.add(num5);
        expressions.add(num6);
        expressions.add(num7);
        expressions.add(num8);
        expressions.add(num9);
        expressions.add(num10);
        expressions.add(num11);
        expressions.add(num12);
        expressions.add(num13);
        expressions.add(num14);
        expressions.add(num15);
        expressions.add(num16);
        expressions.add(num17);
        expressions.add(num18);
        expressions.add(num19);
        expressions.add(num20);
        expressions.add(num21);
        expressions.add(num22);
        expressions.add(num23);
        expressions.add(num24);
        expressions.add(num25);
        expressions.add(num26);
        expressions.add(num27);
        expressions.add(num28);
        expressions.add(num29);
        expressions.add(num30);

        for (int i = 0 ; i < expressions.size() ; i ++)
        {
            System.out.println("Expression" + i + " = " +  expressions.get(i).toString()  + " = " + round(expressions.get(i).calculate()));
        }

        System.out.println();
        for (int i = 0 ; i < expressions.size() ; i ++)
        {
            for (int j = 0 ; j < expressions.size() ; j ++)
            {
                if (i != j && expressions.get(i).equals(expressions.get(j)))
                System.out.println("Expression" + i + " = " + expressions.get(i)
                        + " Expression" + j + " = " + expressions.get(j)
                        + "\nAre they equals? " + expressions.get(i).equals(expressions.get(j)) + "\n");
            }
        }
    }

    public static double generateRandomNumber()
    {
        Random rand = new Random();
        double number = rand.nextDouble(-5, 5);
        return round(number);
    }

    public static double round(double number)
    {
        number = (Math.round(number*10));
        return number/10;
    }
}
