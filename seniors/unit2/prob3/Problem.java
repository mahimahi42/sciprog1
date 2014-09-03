import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        System.out.println("Input two arrays. Both arrays will have the same size.");
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Input array size:");
        int size = input.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];

        System.out.println("Input values for first array");
        for (int i = 0; i < size; i++) {
            System.out.println("Input value " + (i+1));
            a[i] = input.nextInt();
        }
        System.out.println("\nInput value for second array");
        for (int i = 0; i < size; i++) {
            System.out.println("Input value " + (i+1));
            b[i] = input.nextInt();
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
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are unequal");
        }
    }
}
