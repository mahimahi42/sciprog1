import java.util.Scanner;

/**
 * This program creates an array of unique, inputted integers.
 **/
public class Array_Distinct_Insert {
    public static void main(String[] args) {
        System.out.println("Input array size");
        Scanner m = new Scanner(System.in);

        int size = m.nextInt();
        int length = 0;

        int a[] = new int[size];

        while (length < size) {
            System.out.println("Input value");
            int input = m.nextInt();

            int count = 0;

            // Check for duplicates before adding to the array
            for (int i = 0; i < size; i++) {
                if (a[i] == input) {
                    count++;
                }
            }

            // If there are no duplicates...
            if (count == 0) {
                a[length] = input;
                length++;
                System.out.print("Array: ");
                for (int i = 0; i < length; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println(input + " is already a value in the array");
            }
        }
    }
}
