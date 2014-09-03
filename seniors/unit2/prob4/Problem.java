import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        System.out.println("Input array size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int length = 0;
        int arr[] = new int[size];

        while (length < size) {
            System.out.println("Input value");
            int num = input.nextInt();
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == num) {
                    count++;
                }
            }
            if (count == 0) {
                arr[length] = input.nextInt();
                length++;
                System.out.println("Array:");
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println(num + " is already in the array.");
            }
        }   
    }
}
