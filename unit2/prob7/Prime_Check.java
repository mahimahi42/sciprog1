import java.util.Scanner;

/**
 * This program check if an entered value is prime.
 **/
public class Prime_Check {
    // This is a very inefficient, but easy to write prime check algorithm
    public static boolean check_If_Prime(int p) {
        int i = 2;
        boolean m = true;

        // If the number is 1 or 0, it's not prime
        if (p == 1 || p == 0) {
            return false;
        } else {
            while (i < p && m == true) {
                // If the number has a factor, it isn't prime
                if (p % i == 0) {
                    m = false;
                } else {
                     i++;
                }
            }
            return m;
        }
    }

    public static void main(String[] args) {
        int z;
        System.out.println("Input a number greater than one");
        Scanner m = new Scanner(System.in);
        z = m.nextInt();
        if (check_If_Prime(z) == true) {
            System.out.println(z + " is prime");
        } else {
            System.out.println(z + " isn't prime");
        }
    }
}
