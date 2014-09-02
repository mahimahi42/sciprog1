import java.util.Scanner;

/**
 * This program prints an inputted integer in reverse.
 **/
public class Reverse {
    public static void main(String[] args) {
        int number, digit;
        System.out.println("Input a number greater than 0");
        Scanner m = new Scanner(System.in);
        number = m.nextInt();
        // print() (not println()!!!!) will not add a newline to the end
        System.out.print("The reversed number is: ");
        // Until we process the entire number, get the last digit, print it,
        // then remove it from the number.
        while (number != 0) {
            digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
        System.out.println();
    }
}
