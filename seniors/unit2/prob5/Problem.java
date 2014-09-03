import java.util.Scanner;

public class Problem {
    public static boolean prime(int p) {
        int i = 2;
        boolean m = true;

        if (p == 1 || p == 0) {
            return false;
        } else {
            while (i < p && m == true) {
                if (p % i == 0) {
                    m = false;
                } else {
                    i++;
                }
            }
            if (m == true) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a number >0");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (prime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
