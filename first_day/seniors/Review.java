import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        // Printing to STDOUT
        System.out.println("Hello, world!");

        // Getting user input and string concatanation
        Scanner in = new Scanner(System.in);
        System.out.println("Type some text");
        String input = in.nextLine();
        System.out.println("You typed: " + input);

        // For loops and escaped characters
        System.out.println("\nFor Loop Example");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        // Data types and if/else statements
        boolean test = true;
        if (test) {
            System.out.println("This is an if statement.");
        } else {
            System.out.println("This is an else statement, but you shouldn't see me!");
        }

        // While loops
        int a = 1;
        int b = 1000;
        while (a < b) {
            a += 42;
            b += 1;
        }
        System.out.println("A: " + a + " B: " + b);
    }
}
