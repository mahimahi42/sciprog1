import java.util.Scanner;

/**
 * This program will print "HIRE!" if three of five inputted values are greater than
 * 50, and "REJECT" if not.
 **/
public class Type_Test {
    public static void main(String[] args) {
        int test = 0, count = 0, z;
        Scanner m = new Scanner(System.in);

        // Both conditions must be met
        while (test < 5 && count < 2) {
            System.out.println("Enter test score");
            z = m.nextInt();

            if (z >= 50) {
                count++;
            }
            test++;
        }

        if (count == 2) {
            System.out.println("HIRE!");
        } else {
            System.out.println("REJECT");
        }
    }
}
