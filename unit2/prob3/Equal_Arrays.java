import java.util.Scanner;

/**
 * This program checks if two inputted arrays are equal.
 **/
public class Equal_Arrays {
    public static void main(String[] args) {
        System.out.println("Input two arrays. Both must be of equal size.");
        Scanner m = new Scanner(System.in);
        int count = 0;
        System.out.println("Input array size");
        int size = m.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];

        System.out.println("Enter values for first array");
        for (int i = 0; i < size; i++) {
            System.out.println("Input Value #" + (i+1));
            a[i] = m.nextInt();
        }
        System.out.println();
        System.out.println("Enter values for second array");
        for (int i = 0; i < size; i++) {
            System.out.println("Input Value #" + (i+1));
            b[i] = m.nextInt();
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (a[i] == b[j]) {
                    count++;
                }
            }
        }
        if (count == size) {
            System.out.println("Arrays are equal!");
        } else {
            System.out.println("Arrays are unequal...");
        }
    }
}
