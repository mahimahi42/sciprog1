import java.util.Scanner;

/**
 * This program computes the maximum in an integer array inputted by the user
 **/
public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Find Maximum - Enter numbers >= 0");
        Scanner m = new Scanner(System.in);
        // Java arrays need to have their size known when they are created,
        // either by declaring the array manually or giving it a size.
        System.out.println("Input the size of the array");
        int size = m.nextInt();
        int a[] = new int[size];
        int max = -100;
        for (int i = 0; i < a.length; i++) {
            // The "i + 1" in parens will ensure that the correct number is
            // printed to the console. Java works like the standard order of
            // operations, so things in parens will be evaluated first.
            System.out.println("Input number #" + (i+1));
            a[i] = m.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The maximum is: " + max);
    }
}
