import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        System.out.println("Find Maximum - Enter numbers >= 0");
        Scanner input = new Scanner(System.in);

        System.out.println("Input the size of the array.");
        int size = input.nextInt();
        int arr[] = new int[size];
        int max = -100;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input Number #" + (i+1));
            arr[i] = input.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum is " + max);
    }
}
