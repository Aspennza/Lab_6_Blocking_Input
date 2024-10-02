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


    }
}

