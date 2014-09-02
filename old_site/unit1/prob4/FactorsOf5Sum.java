import java.util.Scanner;

/**
 * This program identifies three numbers in the input which have 5 as their factor
 * and obtains their sum, then terminates.
 **/
public class FactorsOf5Sum {
    public static void main(String[] args) {
        int sum = 0, count = 0, z;
        System.out.println("Factors of 5 and their sum");
        Scanner m = new Scanner(System.in);

        // After we find three numbers, stop
        while (count < 3) {
            System.out.println("Input value");
            z = m.nextInt();

            // Check if 5 is a factor
            // If the remainder after division is 0, then the divisor is a factor
            if (z % 5 == 0) {
                count++;
                sum += z;
                System.out.println(z + " has 5 as its factor\n");
            }
            // Print a blank line
            System.out.println();
        }
        System.out.println("Sum of all the number with a factor of 5 is: " + sum);
    }
}
