// Fig. 6.3: MaximumFinder.java
// Programmer declared method maximum.
import java.util.Scanner;

public class MaximumFinder
{
    // obtain three floating-point values and locate the maximum value
    public void determineMaximum()
    {
        Scanner input = new Scanner(System.in);

        // obtain user input
        System.out.print(
                "Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();  // read first double
        double number2 = input.nextDouble();  // read second double
        double number3 = input.nextDouble();  // read third double

         // determine the maximum value
        double result = maximum(number1, number2, number3);

        // display maxinum value
        System.out.println("Maximum is: " + result);
    }  // end method determinMaxinum

    // returns the maximum of its three double parameters
    public double maximum(double x, double y, double z)
    {
        double maximumValue = x;  // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if(y > maximumValue)
            maximumValue = y;

        // determine whether z is greater than maximumValue
        if(z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }  // end method maximum
} // end class MaximumFinder
