import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();

        if (number % 2 == 0) 
            System.out.println(number + " is even.");

        if (number % 2 == 1)
            System.out.println(number + " is odd.");
    }
}
