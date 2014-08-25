import java.util.Scanner;

/**
 * This program computes and prints the nth Fibonacci term
 **/
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0, count = 2;
        System.out.println("Input the value of N");
        Scanner m = new Scanner(System.in);
        int limit = m.nextInt();

        if (limit == 1) {
            c = 0;
        } else if (limit == 2) {
            c = 1;
        } else {
            while (count < limit) {
                c = a + b;
                a = b;
                b = c;
                count++;
            }
        }
        System.out.println("The #" + limit + " term in the Fibonacci Sequence is " + c);
    }
}
