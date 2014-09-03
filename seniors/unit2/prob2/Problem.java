import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Fibonacci Numbers do you need?");
        int numOfFibs = input.nextInt();
        int arr[] = new int[numOfFibs];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < numOfFibs; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i = 0; i < numOfFibs; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
