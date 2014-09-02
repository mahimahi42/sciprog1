import java.text.DecimalFormat;

/**
 * This program calculates the Mexican population growth versus the US.
 **/
public class Population {
    public static void main(String[] args) {
        // "double" is a number with a decimal point with "double precision"
        // Use it whenever you need a number with a decimal
        // These values are in millions
        double usa = 260, mexico = 58;
        int time = 0;

        // DecimalFormat allows us to format the printing of numbers with decimals
        // In this case, we only want three points of precision after the decimal
        // point
        DecimalFormat df = new DecimalFormat("0.000");

        // Now we calculate population growth per year until the Mexican population
        // is greater than the US'.
        while (mexico <= usa) {
            usa *= 1.02;
            mexico *= 1.07;
            time++;
            System.out.println("Year #" + time + ": Mexico = " + df.format(mexico) + " | USA = " + df.format(usa));
        }
        System.out.println("Time in years will be: " + time);
    }
}
