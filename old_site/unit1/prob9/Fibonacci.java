import java.util.Scanner;

/**
 * This program prints out a specified amount of the Fibonacci Sequence
 **/
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, count = 2;
        System.out.println("How many Fibonacci numbers do you need?");
        Scanner m = new Scanner(System.in);
        int limit = m.nextInt();

        // Hard code small limits
        if (limit == 1) {
            System.out.println("0");
        } else if (limit == 2) {
            System.out.println("0 1");
        } else {
            System.out.print(a + " " + b + " ");
            while (count < limit) {
                c = a + b;
                a = b;
                b = c;
                count++;
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
