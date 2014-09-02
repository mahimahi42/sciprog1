import java.util.Scanner;

/**
 * This program computes the factorial of an input integer >=0 and <=12
 **/
public class Factorial {
    public static void main(String[] args) {
        // Multiple assignment
        // "number" will have no value, while
        // "factorial" is set to 1
        int number, factorial = 1;
        
        System.out.println("Input a number >=0 and <=12");

        // Create a new Scanner object using System.in
        // This object allows us to get keyboard input
        Scanner scan = new Scanner(System.in);
        // Give us the next Integer value inputted via the keyboard.
        // Using nextInt() will ensure the value is an Integer.
        number = scan.nextInt();

        // Calculate the factorial using the standard algorithm
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        // String concatanation
        // println() will parse Integers into Strings (turns numbers into strings)
        // then stick everything together into one long string.
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
