import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.println(number1 + " == " + number2);

        if (number1 != number2) {
            System.out.println(number1 + " != " + number2);
        }

        if (number1 < number2)
            System.out.println(number1 + " < " + number2);

        if (number1 > number2)
            System.out.println(number1 + " > " + number2);

        if (number1 <= number2)
            System.out.println(number1 + " <= " + number2);

        if (number1 >= number2)
            System.out.println(number1 + " >= " + number2);
    }
}
