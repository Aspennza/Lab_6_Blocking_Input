import java.util.Random;
import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int FREEZING_POINT = 32;
        final int BOILING_POINT = 212;
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\nPlease enter your temperature in Celsius: ");

            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            }
        }while (!done);

        fahrenheit = celsius * 9/5 + 32;

        System.out.println("\nYour Celsius temperature converted to Fahrenheit is " + fahrenheit + " degrees.");

        if (fahrenheit == FREEZING_POINT)
        {
            System.out.println("\nYour temperature is at the freezing point.");
        } else if (fahrenheit < FREEZING_POINT)
        {
            System.out.println("\nYour temperature is below the freezing point.");
        } else {
            System.out.println("\nYour temperature is above the freezing point.");
        }

        if (fahrenheit == BOILING_POINT)
        {
            System.out.println("\nYour temperature is at the boiling point.");
        } else if (fahrenheit < BOILING_POINT)
        {
            System.out.println("\nYour temperature is below the boiling point.");
        } else
        {
            System.out.println("\nYour temperature is above the boiling point.");
        }

    }

}

class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsOfGas = 0.00;
        double fuelEfficiency = 0.00;
        double gallonGasPrice = 0.00;
        double mile100Cost = 0.00;
        double fullGasDistance = 0.00;
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        String trash = "";

        do {
            System.out.print("\nPlease enter the number of gallons of gas in your tank: ");

            if(in.hasNextDouble())
            {
                gallonsOfGas = in.nextDouble();
                in.nextLine();

                if (gallonsOfGas >= 1)
                {
                    done1 = true;
                } else {
                    System.out.println("\nPlease enter a positive value at or above 1. You entered: " + gallonsOfGas + ".");
                }

            } else
            {
                trash = in.nextLine();
                System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            }
        }while (!done1);

        do {
            System.out.print("\nPlease enter the fuel efficiency of your vehicle in miles per gallon: ");

            if(in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();

                if (fuelEfficiency >= 1)
                {
                    done2 = true;
                } else {
                    System.out.println("\nPlease enter a positive value at or above 1. You entered: " + fuelEfficiency + ".");
                }

            } else
            {
                trash = in.nextLine();
                System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            }
        }while (!done2);

        do {
            System.out.print("\nPlease enter the price of gas per gallon: ");

            if(in.hasNextDouble())
            {
                gallonGasPrice = in.nextDouble();
                in.nextLine();

                if (gallonGasPrice > 0)
                {
                    done3 = true;
                } else {
                    System.out.println("\nPlease enter a positive value. You entered: " + gallonGasPrice + ".");
                }

            } else
            {
                trash = in.nextLine();
                System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            }
        }while (!done3);

        mile100Cost = (100 / fuelEfficiency) * gallonGasPrice;

        System.out.printf("\nThe cost for your car to drive 100 miles is %4.2f dollars.", mile100Cost);

        fullGasDistance = gallonsOfGas * fuelEfficiency;

        System.out.println("\n\nYour car can travel " + fullGasDistance + " miles with a full tank of gas.");
    }
}

class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double rectangleWidth = 0.00;
        double rectangleHeight = 0.00;
        double rectangleArea = 0.00;
        double rectanglePerimeter = 0.00;
        double rectangleDiagonal = 0.00;
        boolean done1 = false;
        boolean done2 = false;
        String trash = "";

        do
        {
            System.out.print("\nPlease enter the width of your rectangle: ");

            if (in.hasNextDouble())
            {
                rectangleWidth = in.nextDouble();
                in.nextLine();

                if (rectangleWidth > 0)
                {
                    done1 = true;
                } else {
                    System.out.println("\nPlease enter a positive value. You entered: " + rectangleWidth + ".");
                }

            } else {
                trash = in.nextLine();
                System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            }
        }while (!done1);

        do
        {
            System.out.print("\nPlease enter the height of your rectangle: ");

            if (in.hasNextDouble())
            {
                rectangleHeight = in.nextDouble();
                in.nextLine();

                if (rectangleHeight > 0)
                {
                    done2 = true;
                } else {
                    System.out.println("\nPlease enter a positive value. You entered: " + rectangleHeight + ".");
                }

            } else {
                trash = in.nextLine();
                System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            }
        }while (!done2);

        rectangleArea = rectangleHeight * rectangleWidth;

        System.out.println("\nThe area of your rectangle is " + rectangleArea + " units.");

        rectanglePerimeter = (rectangleHeight * 2) + (rectangleWidth * 2);

        System.out.println("\nThe perimeter of your rectangle is " + rectanglePerimeter + " units.");

        rectangleDiagonal = Math.sqrt((Math.pow(rectangleHeight, 2) + Math.pow(rectangleWidth, 2)));

        System.out.println("\nThe length of the diagonal of your rectangle is " + rectangleDiagonal + " units.");

    }
}

class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int numGuess = 0;
        int randomVal = gen.nextInt(10) + 1;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("\nThis program generates a random integer between 1 and 10. \nYou have one guess at what number is generated. Enter your guess here: ");

            if(in.hasNextInt())
            {
                numGuess = in.nextInt();
                in.nextLine();

                if (numGuess >= 1 && numGuess <= 10)
                {
                    done = true;
                } else {
                    System.out.println("Please enter an integer value between 1 and 10. You entered: " + numGuess + ".");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nPlease enter an integer value between 1 and 10. You entered: " + trash + ".");
            }
        }while (!done);


        System.out.println("\nThe random number generated was: " + randomVal);

        if (numGuess > randomVal)
        {
            System.out.println("\nYour guess was higher than the random value generated.");
        } else if (numGuess < randomVal) {
            System.out.println("\nYour guess was lower than the random value generated.");
        } else {
            System.out.println("\nYour guess was exactly right!");
        }
    }
}